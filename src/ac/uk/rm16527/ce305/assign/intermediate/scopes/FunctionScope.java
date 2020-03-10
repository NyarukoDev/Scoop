package ac.uk.rm16527.ce305.assign.intermediate.scopes;

import ac.uk.rm16527.ce305.assign.intermediate.data.Parameter;
import ac.uk.rm16527.ce305.assign.intermediate.actions.Action;
import ac.uk.rm16527.ce305.assign.intermediate.actions.DoneAction;
import ac.uk.rm16527.ce305.assign.intermediate.data.Type;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionScope extends Scope {
    public final String label;
    public final List<Parameter> parameters;
    public final Type returnType;

    public FunctionScope(String label, List<Parameter> parameters, Type returnType) {
        this.label = label;
        this.parameters = parameters;
        this.returnType = returnType;
    }

    @Override
    public String generatePython() {
        StringBuilder python = new StringBuilder();

        int indents = 1;//Scope indents for python indent-delimited scope
        python.append("def " + label + "(" + parameters.stream().map(p -> p.label).collect(Collectors.joining(", ")) + "):").append("\n");//Function signature

        for(Action action : getActions()) {//Insert all function actions including var assigns
            if(!(action instanceof DoneAction)) {
                python.append(indent(indents));
                python.append(action.generatePython());
                python.append("\n");
            }

            indents += action.controlChange;
        }

        return python.toString();
    }

    private String indent(int n) {
        return Stream.generate(() -> "  ").limit(n).collect(Collectors.joining(""));
    }
}
