// Generated from Requirement.g4 by ANTLR 4.13.1
package de.jfret.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RequirementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RequirementVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RequirementParser#reqt_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReqt_body(RequirementParser.Reqt_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link RequirementParser#freeform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFreeform(RequirementParser.FreeformContext ctx);
	/**
	 * Visit a parse tree produced by {@link RequirementParser#nasa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNasa(RequirementParser.NasaContext ctx);
	/**
	 * Visit a parse tree produced by {@link RequirementParser#scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScope(RequirementParser.ScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link RequirementParser#reqt_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReqt_condition(RequirementParser.Reqt_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RequirementParser#regular_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegular_condition(RequirementParser.Regular_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RequirementParser#qualifier_word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifier_word(RequirementParser.Qualifier_wordContext ctx);
	/**
	 * Visit a parse tree produced by {@link RequirementParser#qualified_condition1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_condition1(RequirementParser.Qualified_condition1Context ctx);
	/**
	 * Visit a parse tree produced by {@link RequirementParser#qualified_condition2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_condition2(RequirementParser.Qualified_condition2Context ctx);
	/**
	 * Visit a parse tree produced by {@link RequirementParser#scope_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScope_condition(RequirementParser.Scope_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RequirementParser#scope_mode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScope_mode(RequirementParser.Scope_modeContext ctx);
	/**
	 * Visit a parse tree produced by {@link RequirementParser#pre_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPre_condition(RequirementParser.Pre_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RequirementParser#stop_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStop_condition(RequirementParser.Stop_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RequirementParser#component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent(RequirementParser.ComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link RequirementParser#response}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResponse(RequirementParser.ResponseContext ctx);
	/**
	 * Visit a parse tree produced by {@link RequirementParser#satisfaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSatisfaction(RequirementParser.SatisfactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RequirementParser#probability}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProbability(RequirementParser.ProbabilityContext ctx);
	/**
	 * Visit a parse tree produced by {@link RequirementParser#probability_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProbability_aux(RequirementParser.Probability_auxContext ctx);
	/**
	 * Visit a parse tree produced by {@link RequirementParser#prob_num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProb_num(RequirementParser.Prob_numContext ctx);
	/**
	 * Visit a parse tree produced by {@link RequirementParser#timing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTiming(RequirementParser.TimingContext ctx);
	/**
	 * Visit a parse tree produced by {@link RequirementParser#timing_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTiming_aux(RequirementParser.Timing_auxContext ctx);
	/**
	 * Visit a parse tree produced by {@link RequirementParser#duration_upper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDuration_upper(RequirementParser.Duration_upperContext ctx);
	/**
	 * Visit a parse tree produced by {@link RequirementParser#duration_lower}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDuration_lower(RequirementParser.Duration_lowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link RequirementParser#component_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent_name(RequirementParser.Component_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link RequirementParser#mode_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMode_name(RequirementParser.Mode_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link RequirementParser#duration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDuration(RequirementParser.DurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link RequirementParser#timeunit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeunit(RequirementParser.TimeunitContext ctx);
	/**
	 * Visit a parse tree produced by {@link RequirementParser#post_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPost_condition(RequirementParser.Post_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RequirementParser#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr(RequirementParser.Bool_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link RequirementParser#numeric_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_expr(RequirementParser.Numeric_exprContext ctx);
}