// Generated from Requirement.g4 by ANTLR 4.13.1
package de.jfret.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RequirementParser}.
 */
public interface RequirementListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RequirementParser#reqt_body}.
	 * @param ctx the parse tree
	 */
	void enterReqt_body(RequirementParser.Reqt_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RequirementParser#reqt_body}.
	 * @param ctx the parse tree
	 */
	void exitReqt_body(RequirementParser.Reqt_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RequirementParser#freeform}.
	 * @param ctx the parse tree
	 */
	void enterFreeform(RequirementParser.FreeformContext ctx);
	/**
	 * Exit a parse tree produced by {@link RequirementParser#freeform}.
	 * @param ctx the parse tree
	 */
	void exitFreeform(RequirementParser.FreeformContext ctx);
	/**
	 * Enter a parse tree produced by {@link RequirementParser#nasa}.
	 * @param ctx the parse tree
	 */
	void enterNasa(RequirementParser.NasaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RequirementParser#nasa}.
	 * @param ctx the parse tree
	 */
	void exitNasa(RequirementParser.NasaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RequirementParser#scope}.
	 * @param ctx the parse tree
	 */
	void enterScope(RequirementParser.ScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RequirementParser#scope}.
	 * @param ctx the parse tree
	 */
	void exitScope(RequirementParser.ScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RequirementParser#reqt_condition}.
	 * @param ctx the parse tree
	 */
	void enterReqt_condition(RequirementParser.Reqt_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RequirementParser#reqt_condition}.
	 * @param ctx the parse tree
	 */
	void exitReqt_condition(RequirementParser.Reqt_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RequirementParser#regular_condition}.
	 * @param ctx the parse tree
	 */
	void enterRegular_condition(RequirementParser.Regular_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RequirementParser#regular_condition}.
	 * @param ctx the parse tree
	 */
	void exitRegular_condition(RequirementParser.Regular_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RequirementParser#qualifier_word}.
	 * @param ctx the parse tree
	 */
	void enterQualifier_word(RequirementParser.Qualifier_wordContext ctx);
	/**
	 * Exit a parse tree produced by {@link RequirementParser#qualifier_word}.
	 * @param ctx the parse tree
	 */
	void exitQualifier_word(RequirementParser.Qualifier_wordContext ctx);
	/**
	 * Enter a parse tree produced by {@link RequirementParser#qualified_condition1}.
	 * @param ctx the parse tree
	 */
	void enterQualified_condition1(RequirementParser.Qualified_condition1Context ctx);
	/**
	 * Exit a parse tree produced by {@link RequirementParser#qualified_condition1}.
	 * @param ctx the parse tree
	 */
	void exitQualified_condition1(RequirementParser.Qualified_condition1Context ctx);
	/**
	 * Enter a parse tree produced by {@link RequirementParser#qualified_condition2}.
	 * @param ctx the parse tree
	 */
	void enterQualified_condition2(RequirementParser.Qualified_condition2Context ctx);
	/**
	 * Exit a parse tree produced by {@link RequirementParser#qualified_condition2}.
	 * @param ctx the parse tree
	 */
	void exitQualified_condition2(RequirementParser.Qualified_condition2Context ctx);
	/**
	 * Enter a parse tree produced by {@link RequirementParser#scope_condition}.
	 * @param ctx the parse tree
	 */
	void enterScope_condition(RequirementParser.Scope_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RequirementParser#scope_condition}.
	 * @param ctx the parse tree
	 */
	void exitScope_condition(RequirementParser.Scope_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RequirementParser#scope_mode}.
	 * @param ctx the parse tree
	 */
	void enterScope_mode(RequirementParser.Scope_modeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RequirementParser#scope_mode}.
	 * @param ctx the parse tree
	 */
	void exitScope_mode(RequirementParser.Scope_modeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RequirementParser#pre_condition}.
	 * @param ctx the parse tree
	 */
	void enterPre_condition(RequirementParser.Pre_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RequirementParser#pre_condition}.
	 * @param ctx the parse tree
	 */
	void exitPre_condition(RequirementParser.Pre_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RequirementParser#stop_condition}.
	 * @param ctx the parse tree
	 */
	void enterStop_condition(RequirementParser.Stop_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RequirementParser#stop_condition}.
	 * @param ctx the parse tree
	 */
	void exitStop_condition(RequirementParser.Stop_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RequirementParser#component}.
	 * @param ctx the parse tree
	 */
	void enterComponent(RequirementParser.ComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RequirementParser#component}.
	 * @param ctx the parse tree
	 */
	void exitComponent(RequirementParser.ComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RequirementParser#response}.
	 * @param ctx the parse tree
	 */
	void enterResponse(RequirementParser.ResponseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RequirementParser#response}.
	 * @param ctx the parse tree
	 */
	void exitResponse(RequirementParser.ResponseContext ctx);
	/**
	 * Enter a parse tree produced by {@link RequirementParser#satisfaction}.
	 * @param ctx the parse tree
	 */
	void enterSatisfaction(RequirementParser.SatisfactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RequirementParser#satisfaction}.
	 * @param ctx the parse tree
	 */
	void exitSatisfaction(RequirementParser.SatisfactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RequirementParser#probability}.
	 * @param ctx the parse tree
	 */
	void enterProbability(RequirementParser.ProbabilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link RequirementParser#probability}.
	 * @param ctx the parse tree
	 */
	void exitProbability(RequirementParser.ProbabilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link RequirementParser#probability_aux}.
	 * @param ctx the parse tree
	 */
	void enterProbability_aux(RequirementParser.Probability_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link RequirementParser#probability_aux}.
	 * @param ctx the parse tree
	 */
	void exitProbability_aux(RequirementParser.Probability_auxContext ctx);
	/**
	 * Enter a parse tree produced by {@link RequirementParser#prob_num}.
	 * @param ctx the parse tree
	 */
	void enterProb_num(RequirementParser.Prob_numContext ctx);
	/**
	 * Exit a parse tree produced by {@link RequirementParser#prob_num}.
	 * @param ctx the parse tree
	 */
	void exitProb_num(RequirementParser.Prob_numContext ctx);
	/**
	 * Enter a parse tree produced by {@link RequirementParser#timing}.
	 * @param ctx the parse tree
	 */
	void enterTiming(RequirementParser.TimingContext ctx);
	/**
	 * Exit a parse tree produced by {@link RequirementParser#timing}.
	 * @param ctx the parse tree
	 */
	void exitTiming(RequirementParser.TimingContext ctx);
	/**
	 * Enter a parse tree produced by {@link RequirementParser#timing_aux}.
	 * @param ctx the parse tree
	 */
	void enterTiming_aux(RequirementParser.Timing_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link RequirementParser#timing_aux}.
	 * @param ctx the parse tree
	 */
	void exitTiming_aux(RequirementParser.Timing_auxContext ctx);
	/**
	 * Enter a parse tree produced by {@link RequirementParser#duration_upper}.
	 * @param ctx the parse tree
	 */
	void enterDuration_upper(RequirementParser.Duration_upperContext ctx);
	/**
	 * Exit a parse tree produced by {@link RequirementParser#duration_upper}.
	 * @param ctx the parse tree
	 */
	void exitDuration_upper(RequirementParser.Duration_upperContext ctx);
	/**
	 * Enter a parse tree produced by {@link RequirementParser#duration_lower}.
	 * @param ctx the parse tree
	 */
	void enterDuration_lower(RequirementParser.Duration_lowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link RequirementParser#duration_lower}.
	 * @param ctx the parse tree
	 */
	void exitDuration_lower(RequirementParser.Duration_lowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link RequirementParser#component_name}.
	 * @param ctx the parse tree
	 */
	void enterComponent_name(RequirementParser.Component_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RequirementParser#component_name}.
	 * @param ctx the parse tree
	 */
	void exitComponent_name(RequirementParser.Component_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link RequirementParser#mode_name}.
	 * @param ctx the parse tree
	 */
	void enterMode_name(RequirementParser.Mode_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RequirementParser#mode_name}.
	 * @param ctx the parse tree
	 */
	void exitMode_name(RequirementParser.Mode_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link RequirementParser#duration}.
	 * @param ctx the parse tree
	 */
	void enterDuration(RequirementParser.DurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RequirementParser#duration}.
	 * @param ctx the parse tree
	 */
	void exitDuration(RequirementParser.DurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RequirementParser#timeunit}.
	 * @param ctx the parse tree
	 */
	void enterTimeunit(RequirementParser.TimeunitContext ctx);
	/**
	 * Exit a parse tree produced by {@link RequirementParser#timeunit}.
	 * @param ctx the parse tree
	 */
	void exitTimeunit(RequirementParser.TimeunitContext ctx);
	/**
	 * Enter a parse tree produced by {@link RequirementParser#post_condition}.
	 * @param ctx the parse tree
	 */
	void enterPost_condition(RequirementParser.Post_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RequirementParser#post_condition}.
	 * @param ctx the parse tree
	 */
	void exitPost_condition(RequirementParser.Post_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RequirementParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr(RequirementParser.Bool_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RequirementParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr(RequirementParser.Bool_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RequirementParser#numeric_expr}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_expr(RequirementParser.Numeric_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RequirementParser#numeric_expr}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_expr(RequirementParser.Numeric_exprContext ctx);
}