// Generated from F:/Users/Richie5000/Desktop/CE305/a2/src/ac/uk/rm16527/ce305/assign\Compiler.g4 by ANTLR 4.8
package io.nyaruko.scoop.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CompilerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CompilerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CompilerParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(CompilerParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(CompilerParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#operatorAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorAssign(CompilerParser.OperatorAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScope(CompilerParser.ScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#iterate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterate(CompilerParser.IterateContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#run}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRun(CompilerParser.RunContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(CompilerParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(CompilerParser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(CompilerParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#elif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElif(CompilerParser.ElifContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(CompilerParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#safe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSafe(CompilerParser.SafeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#onFail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnFail(CompilerParser.OnFailContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(CompilerParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#done}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDone(CompilerParser.DoneContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#boolJoiner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolJoiner(CompilerParser.BoolJoinerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#boolOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolOperator(CompilerParser.BoolOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#boolVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolVariable(CompilerParser.BoolVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#allTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllTypes(CompilerParser.AllTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(CompilerParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(CompilerParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#real}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal(CompilerParser.RealContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(CompilerParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#stringValidContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringValidContent(CompilerParser.StringValidContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(CompilerParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#calc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalc(CompilerParser.CalcContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#returnable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnable(CompilerParser.ReturnableContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(CompilerParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#booleanStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanStatement(CompilerParser.BooleanStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#boolGroups}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolGroups(CompilerParser.BoolGroupsContext ctx);
}