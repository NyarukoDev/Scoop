// Generated from F:/Users/Richie5000/Desktop/CE305/a2/src/ac/uk/rm16527/ce305/assign\Compiler.g4 by ANTLR 4.8
package ac.uk.rm16527.ce305.assign.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CompilerParser}.
 */
public interface CompilerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CompilerParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(CompilerParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(CompilerParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(CompilerParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(CompilerParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#operatorAssign}.
	 * @param ctx the parse tree
	 */
	void enterOperatorAssign(CompilerParser.OperatorAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#operatorAssign}.
	 * @param ctx the parse tree
	 */
	void exitOperatorAssign(CompilerParser.OperatorAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#scope}.
	 * @param ctx the parse tree
	 */
	void enterScope(CompilerParser.ScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#scope}.
	 * @param ctx the parse tree
	 */
	void exitScope(CompilerParser.ScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#iterate}.
	 * @param ctx the parse tree
	 */
	void enterIterate(CompilerParser.IterateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#iterate}.
	 * @param ctx the parse tree
	 */
	void exitIterate(CompilerParser.IterateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#run}.
	 * @param ctx the parse tree
	 */
	void enterRun(CompilerParser.RunContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#run}.
	 * @param ctx the parse tree
	 */
	void exitRun(CompilerParser.RunContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(CompilerParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(CompilerParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(CompilerParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(CompilerParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(CompilerParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(CompilerParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#elif}.
	 * @param ctx the parse tree
	 */
	void enterElif(CompilerParser.ElifContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#elif}.
	 * @param ctx the parse tree
	 */
	void exitElif(CompilerParser.ElifContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(CompilerParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(CompilerParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#safe}.
	 * @param ctx the parse tree
	 */
	void enterSafe(CompilerParser.SafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#safe}.
	 * @param ctx the parse tree
	 */
	void exitSafe(CompilerParser.SafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#onFail}.
	 * @param ctx the parse tree
	 */
	void enterOnFail(CompilerParser.OnFailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#onFail}.
	 * @param ctx the parse tree
	 */
	void exitOnFail(CompilerParser.OnFailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(CompilerParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(CompilerParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#done}.
	 * @param ctx the parse tree
	 */
	void enterDone(CompilerParser.DoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#done}.
	 * @param ctx the parse tree
	 */
	void exitDone(CompilerParser.DoneContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#boolJoiner}.
	 * @param ctx the parse tree
	 */
	void enterBoolJoiner(CompilerParser.BoolJoinerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#boolJoiner}.
	 * @param ctx the parse tree
	 */
	void exitBoolJoiner(CompilerParser.BoolJoinerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#boolOperator}.
	 * @param ctx the parse tree
	 */
	void enterBoolOperator(CompilerParser.BoolOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#boolOperator}.
	 * @param ctx the parse tree
	 */
	void exitBoolOperator(CompilerParser.BoolOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#boolVariable}.
	 * @param ctx the parse tree
	 */
	void enterBoolVariable(CompilerParser.BoolVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#boolVariable}.
	 * @param ctx the parse tree
	 */
	void exitBoolVariable(CompilerParser.BoolVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#allTypes}.
	 * @param ctx the parse tree
	 */
	void enterAllTypes(CompilerParser.AllTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#allTypes}.
	 * @param ctx the parse tree
	 */
	void exitAllTypes(CompilerParser.AllTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(CompilerParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(CompilerParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(CompilerParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(CompilerParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#real}.
	 * @param ctx the parse tree
	 */
	void enterReal(CompilerParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#real}.
	 * @param ctx the parse tree
	 */
	void exitReal(CompilerParser.RealContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(CompilerParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(CompilerParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#stringValidContent}.
	 * @param ctx the parse tree
	 */
	void enterStringValidContent(CompilerParser.StringValidContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#stringValidContent}.
	 * @param ctx the parse tree
	 */
	void exitStringValidContent(CompilerParser.StringValidContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(CompilerParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(CompilerParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#calc}.
	 * @param ctx the parse tree
	 */
	void enterCalc(CompilerParser.CalcContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#calc}.
	 * @param ctx the parse tree
	 */
	void exitCalc(CompilerParser.CalcContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#returnable}.
	 * @param ctx the parse tree
	 */
	void enterReturnable(CompilerParser.ReturnableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#returnable}.
	 * @param ctx the parse tree
	 */
	void exitReturnable(CompilerParser.ReturnableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(CompilerParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(CompilerParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#booleanStatement}.
	 * @param ctx the parse tree
	 */
	void enterBooleanStatement(CompilerParser.BooleanStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#booleanStatement}.
	 * @param ctx the parse tree
	 */
	void exitBooleanStatement(CompilerParser.BooleanStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#boolGroups}.
	 * @param ctx the parse tree
	 */
	void enterBoolGroups(CompilerParser.BoolGroupsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#boolGroups}.
	 * @param ctx the parse tree
	 */
	void exitBoolGroups(CompilerParser.BoolGroupsContext ctx);
}