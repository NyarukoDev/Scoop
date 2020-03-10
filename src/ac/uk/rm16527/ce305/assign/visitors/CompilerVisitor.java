package ac.uk.rm16527.ce305.assign.visitors;

import ac.uk.rm16527.ce305.assign.intermediate.CompilerException;
import ac.uk.rm16527.ce305.assign.intermediate.ContextTracker;
import ac.uk.rm16527.ce305.assign.generated.CompilerBaseVisitor;
import ac.uk.rm16527.ce305.assign.generated.CompilerParser;
import ac.uk.rm16527.ce305.assign.intermediate.actions.AssignAction;
import ac.uk.rm16527.ce305.assign.intermediate.scopes.ControlScope;
import ac.uk.rm16527.ce305.assign.intermediate.actions.DoneAction;
import ac.uk.rm16527.ce305.assign.intermediate.scopes.FunctionScope;
import ac.uk.rm16527.ce305.assign.intermediate.actions.IfAction;
import ac.uk.rm16527.ce305.assign.intermediate.actions.IterateAction;
import ac.uk.rm16527.ce305.assign.intermediate.actions.OnFailAction;
import ac.uk.rm16527.ce305.assign.intermediate.actions.OtherwiseAction;
import ac.uk.rm16527.ce305.assign.intermediate.data.Parameter;
import ac.uk.rm16527.ce305.assign.intermediate.actions.PrintAction;
import ac.uk.rm16527.ce305.assign.intermediate.scopes.Program;
import ac.uk.rm16527.ce305.assign.intermediate.PythonGenerator;
import ac.uk.rm16527.ce305.assign.intermediate.actions.ResultAction;
import ac.uk.rm16527.ce305.assign.intermediate.actions.RunAction;
import ac.uk.rm16527.ce305.assign.intermediate.actions.SafeAction;
import ac.uk.rm16527.ce305.assign.intermediate.scopes.Scope;
import ac.uk.rm16527.ce305.assign.intermediate.data.Type;
import ac.uk.rm16527.ce305.assign.intermediate.data.VariableData;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class CompilerVisitor extends CompilerBaseVisitor<PythonGenerator> {
    /**
     * The program that will be returned by this evaluation.
     */
    private Program program = new Program();
    /**
     * The scope stack. Used to track current functions and variable scoping
     */
    private Stack<Scope> stack = new Stack<>();
    /**
     * These labels cannot be used for assignments or scopes as they are reserved in python
     */
    List<String> reservedLabels = Arrays.asList(
            "class","finally","is","return",
            "continue","for","lambda","try",
            "def","from","nonlocal","while",
            "and","del","global","not","with",
            "as","elif","if","or","yield",
            "assert","else","import","pass",
            "break","except","in","raise");

    /**
     * Go through each rule line and process them into a Python program generator
     * @param ctx The parser context
     * @return A class that can generate a Python program
     */
    @Override
    public PythonGenerator visitStart(CompilerParser.StartContext ctx) {
        ContextTracker found = new ContextTracker();
        List<ParseTree> children = ctx.children;
        loadScopes(ctx.scope());
        int elementCount = 1;
        String currentRawInputLine="";
        for (ParseTree pt : children) {//Iterate over children of parse tree
            String contextClass = pt.getClass().getSimpleName();
            currentRawInputLine = pt.getText();
            try {
                switch (contextClass.substring(0, contextClass.length() - 7)) {//Context class sans the affixed "Context"
                    //Standard action cases with no scope impact
                    case "Assign":
                        insertAssign(ctx.assign(found.incrementTracker(contextClass)));
                        break;
                    case "OperatorAssign":
                        insertOperatorAssign(ctx.operatorAssign(found.incrementTracker(contextClass)));
                        break;
                    case "Run":
                        insertRun(ctx.run(found.incrementTracker(contextClass)));
                        break;
                    case "Print":
                        insertPrint(ctx.print(found.incrementTracker(contextClass)));
                        break;
                    case "Result":
                        insertResult(ctx.result(found.incrementTracker(contextClass)));
                        break;
                    //Cases that increase scope
                    case "Scope":
                        if (getCurrentFunction(false) != null) throw new CompilerException("Function declared in function");
                        String label = ((CompilerParser.ScopeContext) pt).label().getText();
                        assertLabelUnreserved(label);

                        stack.push(program.scopes.get(label));
                        break;
                    case "Iterate":
                        insertIterate(ctx.iterate(found.incrementTracker(contextClass)));
                        break;
                    case "Safe":
                        getCurrentFunction(true).addAction(new SafeAction());
                        stack.push(new ControlScope());
                        break;
                    case "IfStatement":
                        getCurrentFunction(true).addAction(visitIfStatement(ctx.ifStatement(found.incrementTracker(contextClass)).booleanStatement(), false));
                        break;
                    //Cases that descope
                    case "Elif":
                        descope(contextClass);
                        CompilerParser.ElifContext elif = ctx.elif(found.incrementTracker(contextClass));
                        getCurrentFunction(true).addAction(visitIfStatement(elif.ifStatement().booleanStatement(), true));
                        break;
                    case "ElseStatement":
                        descope(contextClass);
                        getCurrentFunction(true).addAction(new OtherwiseAction());
                        stack.push(new ControlScope());
                        break;
                    case "OnFail":
                        descope(contextClass);
                        getCurrentFunction(true).addAction(new OnFailAction());
                        stack.push(new ControlScope());
                        break;
                    case "Done":
                        descope(contextClass);
                        break;
                    case "Comment"://Ignores comments and unknown contexts
                    default:
                        break;
                }
                elementCount++;
            } catch (Exception e) {
                System.err.println("ERROR COMPILING INPUT SOURCE["+elementCount+"]!");
                System.err.println("INPUT: " + currentRawInputLine);
                System.err.println("MESSAGE: " + e.getMessage());
                e.printStackTrace();
                return null;
            }
        }

        return program;
    }

    /**
     * Inserts a RESULT return into the abstract program. Must be scoped in a function somewhere in the stack
     * @param ctx The ResultContext data to process
     * @throws CompilerException If the wrong type is returned or this result is not within a function scope
     */
    public void insertResult(CompilerParser.ResultContext ctx) throws CompilerException {
        FunctionScope fs = getCurrentFunction(true);
        //Populate VariableData for return type checking. If nothing is being returned, construct a VOID VariableData.
        VariableData variableData = ctx.returnable() != null ? deepReturnable(ctx.returnable()) : new VariableData(Type.VOID, "");
        //The actual type check
        if(variableData.type != fs.returnType)
            throw new CompilerException("RESULT call returns invalid type " + variableData.type + ". Expected " + fs.returnType);

        fs.addAction(new ResultAction(variableData.data));
    }

    /**
     * Adds an if statement (or else if) action to the abstract program and push a ControlScope to the scope stack
     * @param ctx The PrintContext to convert
     * @param isElse Is this conditional statement an 'elif'
     * @throws CompilerException See {@link #parseBooleanStatement(CompilerParser.BooleanStatementContext)}
     */
    public IfAction visitIfStatement(CompilerParser.BooleanStatementContext ctx, boolean isElse) throws CompilerException{
        IfAction ifAction = new IfAction(parseBooleanStatement(ctx), isElse);
        stack.push(new ControlScope());
        return ifAction;
    }

    /**
     * Adds a print action to the abstract program
     * @param ctx The PrintContext to convert
     * @throws CompilerException See {@link #returnableToPythonString(CompilerParser.ReturnableContext)}
     */
    public void insertPrint(CompilerParser.PrintContext ctx) throws CompilerException {
        getCurrentFunction(true).addAction(new PrintAction(returnableToPythonString(ctx.returnable())));
    }

    /**
     * Adds a run (method call) action to the abstract program
     * @param ctx The RunContext to convert
     * @throws CompilerException See {@link #generateRun(CompilerParser.RunContext)}
     */
    public void insertRun(CompilerParser.RunContext ctx) throws CompilerException {
        getCurrentFunction(true).addAction(generateRun(ctx));
    }

    /**
     * Creates a {@link RunAction} from the RunContext data
     * @param ctx The RunContext to get information from
     * @return A valid RunContext
     * @throws CompilerException If the generated run is invalid (See {@link #assertValidRunCall(String, VariableData...)})
     */
    public RunAction generateRun(CompilerParser.RunContext ctx) throws CompilerException {
        FunctionScope func = program.scopes.get(ctx.label().getText());
        VariableData[] parameters = extractRunCallVariableData(ctx);

        assertValidRunCall(ctx.label().getText(), parameters);

        return new RunAction(func, parameters);
    }

    /**
     * Convert parameter returnables to interpretable VariableData.
     * @param ctx RunContext to get VariableData from
     * @return VariableData array for the given RunContext
     * @throws CompilerException See {@link #deepReturnable(CompilerParser.ReturnableContext)}
     */
    private VariableData[] extractRunCallVariableData(CompilerParser.RunContext ctx) throws CompilerException{
        VariableData[] parameters = new VariableData[ctx.returnable().size()];
        for (int i = 0; i < ctx.returnable().size(); i++) parameters[i] = deepReturnable(ctx.returnable(i));
        return parameters;
    }

    /**
     * Asserts that the given information from a run call:
     * - Calls a function that exists
     * - Supplies enough parameters
     * - Supplies the correct types of parameters
     * @param targetLabel The label of the scope to be called
     * @param parameters The parameters that were supplied by the run call
     * @throws CompilerException In any event that the run call is invalid
     */
    private void assertValidRunCall(String targetLabel, VariableData... parameters) throws CompilerException {
        //Check target scope function scope exists
        FunctionScope func = program.scopes.get(targetLabel);
        if(func == null) throw new CompilerException("Cannot run undeclared function " + targetLabel);
        //Check right amount of parameters supplied
        int suppliedParameters = parameters.length;
        if(func.parameters.size() != suppliedParameters)
            throw new CompilerException("Incorrect amount of parameters supplied by run, expected " + func.parameters.size() + " but got " + suppliedParameters);

        //Check right parameter types are supplied
        for (int i = 0; i < func.parameters.size(); i++)
            if (parameters[i].type != func.parameters.get(i).type)
                throw new CompilerException("Invalid run parameter specified, expected " + func.parameters.get(i).type + " but got " + parameters[i].type);
    }

    /**
     * Converts a ReturnableContext to its Python value for use in inline actions.
     * @param ctx The ReturnableContext to convert
     * @return A Python string representing the returnable.
     * @throws CompilerException On unknown returnable sub-context type
     */
    public String returnableToPythonString(CompilerParser.ReturnableContext ctx) throws CompilerException{
        ParseTree tree = ctx.children.get(0);
        String contextClass = tree.getClass().getSimpleName();
        String raw;
        switch (contextClass) {//Determine python
            case "StringContext":
            case "ValueContext":
                raw = tree.getText();
                break;
            case "CalcContext":
                raw = normaliseRPN(tree.getText(), ((CompilerParser.CalcContext)tree).run());
                break;
            case "RunContext":
                raw = generateRun((CompilerParser.RunContext)tree).generatePython();
                break;
            default:
                throw new CompilerException("Unknown returnable type");
        }

        return raw;
    }

    /**
     * Converts a ReturnableContext to a {@link VariableData} object with proper type and Python-compatible value
     * @param ctx The ReturnableContext to convert
     * @return A {@link VariableData} object with proper type and Python-compatible value
     * @throws CompilerException On unknown returnable sub-context type or failed RUN assertion {@link #assertValidRunCall(String, VariableData...)}
     */
    public VariableData deepReturnable(CompilerParser.ReturnableContext ctx) throws CompilerException {
        String raw = returnableToPythonString(ctx);
        Type type = Type.STRING;

        ParseTree tree = ctx.children.get(0);
        String contextClass = tree.getClass().getSimpleName();
        switch (contextClass) {
            case "StringContext": break;//string is default, no need to set, drop through safely possible
            case "ValueContext":
                CompilerParser.ValueContext vc = ((CompilerParser.ValueContext) tree);
                if(vc.label() != null) {//Label type value, true type must be determined from most closely scoped VariableData
                    type = getLabelType(vc.label().getText());
                } else {//Real type value, type is decimal if a '.' is found
                    type = vc.real().POINT() != null ? Type.DECIMAL : Type.INTEGER;
                }
                break;
            case "CalcContext"://Calc always results in decimal
                type = Type.DECIMAL;
                break;
            case "RunContext":
                CompilerParser.RunContext rc = (CompilerParser.RunContext) tree;
                assertValidRunCall(rc.label().getText(), extractRunCallVariableData(rc));//Check RUN validity before accessing

                FunctionScope fs = program.scopes.get(rc.label().getText());
                type = fs.returnType;
                break;
            default:
                throw new CompilerException("Unknown returnable type");
        }

        return new VariableData(type, raw);
    }

    /**
     * Gets the stored variable data from the scope stack. If it is not present in the scope stack, it will try to get it from the global stack.
     * @param label The label of the variable to get
     * @return A VariableData containing information about the given label at the closest scope or null if it does not exist
     */
    private VariableData getVariableFromScopeStack(String label) {
        Stack<Scope> temp = new Stack<>();
        VariableData variableData = null;
        while(!stack.isEmpty()) {
            Scope scope = stack.peek();
            if(scope.variables.containsKey(label)) {//Variable found
                variableData = scope.variables.get(label);
                break;
            } else {//Move stack head to temp stack
                stack.pop();
                temp.push(scope);
            }
        }

        //Rebuild scope stack
        while (!temp.isEmpty()) stack.push(temp.pop());

        if(variableData == null) {//Last chance globalScope presence check
            variableData = program.globalScope.variables.get(label);
        }

        return variableData;
    }

    /**
     * Gets the {@link Type} of a given variable label
     * @param label The label to get the type of
     * @return The label type
     * @throws CompilerException If the label does not exist in any available scope
     */
    private Type getLabelType(String label) throws CompilerException{
        VariableData variableData = getVariableFromScopeStack(label);
        if(variableData == null || variableData.type == null)
            throw new CompilerException("Failed to derive type of variable '"+label+"' which is undeclared in this scope");
        return variableData.type;
    }

    /**
     * Extract a list of {@link Parameter}s from a ParametersContext
     * @param ctx The ParametersContext to extract from
     * @return A List of {@link Parameter}s
     */
    public List<Parameter> parseParameters(CompilerParser.ParametersContext ctx) {
        List<Parameter> parameters = new ArrayList<>();
        for(int i = 0; i < ctx.label().size(); i++) {//Build parameter list
            parameters.add(new Parameter(ctx.label(i).getText(), Type.valueOf(ctx.TYPES(i).getText())));
        }

        return parameters;
    }

    /**
     * Populates the {@link Program} of this compilation with all detected SCOPEs. Sets whether an entryPoint Scope was found.
     * @param scopes All ScopeContexts in the input
     */
    private void loadScopes(List<CompilerParser.ScopeContext> scopes) {
        //Build program SCOPE list
        for(CompilerParser.ScopeContext scope : scopes) {
            String label = scope.label().getText();
            program.scopes.put(label, new FunctionScope(label, parseParameters(scope.parameters()), Type.valueOf(scope.allTypes().getText())));
        }
        //Insert entryPoint call if one is present
        if(program.scopes.containsKey("entryPoint")) program.hasEntryPoint = true;
    }

    /**
     * Inserts an assign action into the abstract program if the current scope is not global. Stores a VariableData log at the current scope
     * so that later assigns can be type-checked.
     * @param ctx The AssignContext to get information from
     * @throws CompilerException If label is reserved (see {@link #assertLabelUnreserved(String)}), or assigned value does not match variable type at label
     */
    private void insertAssign(CompilerParser.AssignContext ctx) throws CompilerException {
        String label = ctx.label().getText();
        assertLabelUnreserved(label);

        VariableData variableData = deepReturnable(ctx.returnable());
        Scope scope = !stack.isEmpty() ? stack.peek() : program.globalScope;

        //Verify types of returnable and variable match
        if(scope.variables.containsKey(label) && scope.variables.get(label).type != variableData.type)
            throw new CompilerException("Cannot assign an existing variable to a value of a different type " +
                    "("+label+" is "+scope.variables.get(label).type+", got" + variableData.type+")");

        //Store the variable in the current scope
        scope.variables.put(label, variableData);

        if(scope == program.globalScope) return;//Global variables are generated by the program itself, do not inject action

        getCurrentFunction(true).addAction(new AssignAction(label, returnableToPythonString(ctx.returnable())));
    }

    /**
     * Inserts an operator assign action into the abstract program if the operating value is of the same type as the variable.
     * @param ctx The OperatorAssignContext to get information from
     * @throws CompilerException If label is reserved (see {@link #assertLabelUnreserved(String)}), the labelled variable does not exist, or the
     * operated value type does not match variable type
     */
    public void insertOperatorAssign(CompilerParser.OperatorAssignContext ctx) throws CompilerException {
        String varLabel = ctx.label().getText();
        assertLabelUnreserved(varLabel);

        VariableData variableData = getVariableFromScopeStack(varLabel);
        if(variableData == null) throw new CompilerException("Cannot perform operator assign on undefined variable " + varLabel);
        VariableData returnableData = deepReturnable(ctx.returnable());
        //Verify the operated type is of the same type as the variable
        if(variableData.type != returnableData.type)
            throw new CompilerException("Data type mismatch in operator assign for " + varLabel +
                    "(got " + returnableData.type + " needed " + variableData.type+")");

        getCurrentFunction(true).addAction(new AssignAction(varLabel, returnableToPythonString(ctx.returnable()), ctx.operator().getText()));
    }

    /**
     * Inserts an iterate action and the associated assignment operations into the abstract program.
     * @param ctx The IterateContext to build the actions from
     * @throws CompilerException If a label is used and the variable is undeclared, or if an invalid boolean statement is made
     * (see {@link #parseBooleanStatement(CompilerParser.BooleanStatementContext)})
     */
    public void insertIterate(CompilerParser.IterateContext ctx) throws CompilerException{
        CompilerParser.LabelContext label = ctx.label();
        if(label == null) insertAssign(ctx.assign(0));
        else {//Label
            VariableData variableData = getVariableFromScopeStack(label.getText());
            if(variableData == null) throw new CompilerException("Iterate leading parameter is not a declared variable. Must declare a/be a declared variable");
        }
        getCurrentFunction(true).addAction(new IterateAction(parseBooleanStatement(ctx.booleanStatement())));

        //Inline assign is optional
        if(ctx.assign().size() > (label == null ? 1 : 0)) insertAssign(ctx.assign(label==null ? 1 : 0));

        stack.push(new ControlScope());
    }

    /**
     * Assert that the given label is not one of Python's reserved keywords.
     * @param label The label to check
     * @throws CompilerException If the label is reserved by Python
     */
    private void assertLabelUnreserved(String label) throws CompilerException{
        if(reservedLabels.contains(label))//Verify label isn't reserved by Python
            throw new CompilerException("Invalid assign label. " + label + "is reserved");
    }

    /**
     * Finds the currently scoped function if any.
     * @param safe Whether or not to throw an exception if no scope is found
     * @return The currently scoped function
     * @throws CompilerException If no scope is on the scope stack when safe is true.
     */
    private FunctionScope getCurrentFunction(boolean safe) throws CompilerException{
        FunctionScope result = null;
        Stack<Scope> popped = new Stack<>();

        //Find next FunctionScope
        while(!stack.isEmpty() && !(stack.peek() instanceof FunctionScope)) popped.push(stack.pop());
        if(!stack.isEmpty()) result = (FunctionScope)stack.peek();//Can only happen if previous while break was due to finding a FunctionScope
        while(!popped.isEmpty()) stack.push(popped.pop());//Rebuild scope stack

        if(safe && result == null) throw new CompilerException("No function in scope");
        return result;
    }

    /**
     * Parses a BooleanStatementContext into a Python-compatible String.
     * @param ctx The BooleanStatementContext to parse
     * @return a Python-compatible boolean statement string
     * @throws CompilerException If a label used as a boolean is not of boolean type, a comparison is incomplete, or compared types are not of the same type
     */
    private String parseBooleanStatement(CompilerParser.BooleanStatementContext ctx) throws CompilerException {
        StringBuilder out = new StringBuilder();
        List<ParseTree> children = ctx.children;

        for (ParseTree child : children) {//Iterate over children of parse tree
            if (child instanceof CompilerParser.BoolJoinerContext) out.append(child.getText().toLowerCase());//AND/OR symbols
            else {
                CompilerParser.BoolGroupsContext bgc = (CompilerParser.BoolGroupsContext)child;

                if(!bgc.returnable().isEmpty()) { //Returnable set
                    if(bgc.returnable().size() != 2)//Check both returnables are in
                        throw new CompilerException("Invalid returnable count ("+bgc.returnable().size()+") in boolean statement comparison.");

                    VariableData left = deepReturnable(bgc.returnable(0));
                    VariableData right = deepReturnable(bgc.returnable(1));
                    if(left.type != right.type)//Validate compared types are the same
                        throw new CompilerException("Boolean comparison between two different types ("+left.type+" and " + right.type+") detected");
                    out.append(left.data)
                        .append(bgc.boolOperator().getText())
                        .append(right.data);
                } else if(bgc.boolVariable() != null) {//TRUE/FALSE symbols
                    out.append(" ")
                        .append(bgc.boolVariable().getText().equals("TRUE") ? "True" : "False")
                        .append(" ");
                } else {//Is label of boolean variable
                    String variableLabel = bgc.label().getText();
                    if(getLabelType(variableLabel) == Type.BOOLEAN) {//getLabelType call verifies that variable is declared
                        out.append(" ")
                            .append(variableLabel)
                            .append(" ");
                    } else {//Variable is not of boolean type
                        throw new CompilerException("Specified variable " + variableLabel + " in boolean statement is not of boolean type");
                    }
                }
            }
        }

        return out.toString();
    }

    /**
     * Reduce the current stack scope and apply this to Python
     * @param parseTreeName The context performing this descope
     * @throws CompilerException If descope attempted when scope stack is empty
     */
    private void descope(String parseTreeName) throws CompilerException{
        //Abstract descope action
        getCurrentFunction(true).addAction(new DoneAction());

        //Update scope stack
        if(!stack.isEmpty())stack.pop();
        else throw new CompilerException(parseTreeName + " found with empty scope stack");
    }

    /**
     * Converts reverse polish notation expressions into standard infix expressions for Python
     * @param rpn The input RPN expression
     * @param runContexts Any RUN contexts contained in the RPN expression
     * @return A Python compatible infix expression string
     * @throws CompilerException If the RPN expression is invalid or any RUNs do not return numeric values
     */
    public String normaliseRPN(String rpn, List<CompilerParser.RunContext> runContexts) throws CompilerException {
        //Check any RUN calls will result in a number
        assertRunTypesMatch(runContexts, Type.DECIMAL, Type.INTEGER);

        //Remove any possible whitespace from rpn
        rpn = rpn.replaceAll("[\\s\\r\\n]", "");
        String operators = "-+*/%^";//Operators in reverse precedence
        for(char c : operators.toCharArray()) rpn = rpn.replace(c + "", "," + c);
        String[] elements = rpn.split(",");

        //Begin building infix
        //0 - expression, 1 - operator
        Stack<List<String>> segments = new Stack<>();
        for(String element : elements) {
            if(element.length() == 1 && operators.contains(element)) {//element is an operator
                int precedent = operators.indexOf(element);//get operator precedent

                //Get precedents of left and right operations (max for default)
                List<String> right = segments.pop();
                int rightPrecedent = right.size() > 1 ? operators.indexOf(right.get(1)) : operators.length();
                List<String> left = segments.pop();
                int leftPrecedent = left.size() > 1 ? operators.indexOf(right.get(1)) : operators.length();

                //Bracket where needed
                if(leftPrecedent < precedent || (leftPrecedent == precedent && element.equals("^"))) left.set(0, "(" + left.get(0) + ")");
                if(rightPrecedent < precedent || (rightPrecedent == precedent && !element.equals("^"))) right.set(0, "(" + right.get(0) + ")");

                //Store new segment with operator RHS
                segments.push(Arrays.asList(left.get(0) + element + right.get(0), element));
            } else {//element is not an operator
                segments.push(Arrays.asList(element));
            }
        }

        if(segments.size() != 1) throw new CompilerException("Invalid RPN statement detected");
        return segments.peek().get(0).replace("^", "**");//Converts Scoop power to Python power operator
    }

    /**
     * Assert that the given list of RunContexts return at least one of the given {@link Type}s
     * @param runContexts The RunContexts to check the return types of
     * @param types The valid return types
     * @throws CompilerException If at least one of the RunContexts does not return any of the given types
     */
    private void assertRunTypesMatch(List<CompilerParser.RunContext> runContexts, Type... types) throws CompilerException{
        for(CompilerParser.RunContext rc : runContexts) {
            FunctionScope func = program.scopes.get(rc.label().getText());

            //Check run is actually valid
            assertValidRunCall(rc.label().getText(), extractRunCallVariableData(rc));

            //Check run returns one of the specified types
            boolean matchFound = false;
            for(Type type : types) {
                if(func.returnType == type) {
                    matchFound = true;//It does
                    break;
                }
            }

            if(!matchFound) throw new CompilerException("Invalid scope return type found");
        }
    }
}
