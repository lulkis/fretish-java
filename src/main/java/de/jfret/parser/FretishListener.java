package de.jfret.parser;
// Generated from Fretish.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FretishParser}.
 */
public interface FretishListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FretishParser#reqt_body}.
	 * @param ctx the parse tree
	 */
	void enterReqt_body(FretishParser.Reqt_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FretishParser#reqt_body}.
	 * @param ctx the parse tree
	 */
	void exitReqt_body(FretishParser.Reqt_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FretishParser#freeform}.
	 * @param ctx the parse tree
	 */
	void enterFreeform(FretishParser.FreeformContext ctx);
	/**
	 * Exit a parse tree produced by {@link FretishParser#freeform}.
	 * @param ctx the parse tree
	 */
	void exitFreeform(FretishParser.FreeformContext ctx);
	/**
	 * Enter a parse tree produced by {@link FretishParser#nasa}.
	 * @param ctx the parse tree
	 */
	void enterNasa(FretishParser.NasaContext ctx);
	/**
	 * Exit a parse tree produced by {@link FretishParser#nasa}.
	 * @param ctx the parse tree
	 */
	void exitNasa(FretishParser.NasaContext ctx);
	/**
	 * Enter a parse tree produced by {@link FretishParser#scope}.
	 * @param ctx the parse tree
	 */
	void enterScope(FretishParser.ScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FretishParser#scope}.
	 * @param ctx the parse tree
	 */
	void exitScope(FretishParser.ScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FretishParser#reqt_condition}.
	 * @param ctx the parse tree
	 */
	void enterReqt_condition(FretishParser.Reqt_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FretishParser#reqt_condition}.
	 * @param ctx the parse tree
	 */
	void exitReqt_condition(FretishParser.Reqt_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FretishParser#regular_condition}.
	 * @param ctx the parse tree
	 */
	void enterRegular_condition(FretishParser.Regular_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FretishParser#regular_condition}.
	 * @param ctx the parse tree
	 */
	void exitRegular_condition(FretishParser.Regular_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FretishParser#qualifier_word}.
	 * @param ctx the parse tree
	 */
	void enterQualifier_word(FretishParser.Qualifier_wordContext ctx);
	/**
	 * Exit a parse tree produced by {@link FretishParser#qualifier_word}.
	 * @param ctx the parse tree
	 */
	void exitQualifier_word(FretishParser.Qualifier_wordContext ctx);
	/**
	 * Enter a parse tree produced by {@link FretishParser#qualified_condition1}.
	 * @param ctx the parse tree
	 */
	void enterQualified_condition1(FretishParser.Qualified_condition1Context ctx);
	/**
	 * Exit a parse tree produced by {@link FretishParser#qualified_condition1}.
	 * @param ctx the parse tree
	 */
	void exitQualified_condition1(FretishParser.Qualified_condition1Context ctx);
	/**
	 * Enter a parse tree produced by {@link FretishParser#qualified_condition2}.
	 * @param ctx the parse tree
	 */
	void enterQualified_condition2(FretishParser.Qualified_condition2Context ctx);
	/**
	 * Exit a parse tree produced by {@link FretishParser#qualified_condition2}.
	 * @param ctx the parse tree
	 */
	void exitQualified_condition2(FretishParser.Qualified_condition2Context ctx);
	/**
	 * Enter a parse tree produced by {@link FretishParser#scope_condition}.
	 * @param ctx the parse tree
	 */
	void enterScope_condition(FretishParser.Scope_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FretishParser#scope_condition}.
	 * @param ctx the parse tree
	 */
	void exitScope_condition(FretishParser.Scope_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FretishParser#scope_mode}.
	 * @param ctx the parse tree
	 */
	void enterScope_mode(FretishParser.Scope_modeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FretishParser#scope_mode}.
	 * @param ctx the parse tree
	 */
	void exitScope_mode(FretishParser.Scope_modeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FretishParser#pre_condition}.
	 * @param ctx the parse tree
	 */
	void enterPre_condition(FretishParser.Pre_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FretishParser#pre_condition}.
	 * @param ctx the parse tree
	 */
	void exitPre_condition(FretishParser.Pre_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FretishParser#stop_condition}.
	 * @param ctx the parse tree
	 */
	void enterStop_condition(FretishParser.Stop_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FretishParser#stop_condition}.
	 * @param ctx the parse tree
	 */
	void exitStop_condition(FretishParser.Stop_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FretishParser#component}.
	 * @param ctx the parse tree
	 */
	void enterComponent(FretishParser.ComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FretishParser#component}.
	 * @param ctx the parse tree
	 */
	void exitComponent(FretishParser.ComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FretishParser#response}.
	 * @param ctx the parse tree
	 */
	void enterResponse(FretishParser.ResponseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FretishParser#response}.
	 * @param ctx the parse tree
	 */
	void exitResponse(FretishParser.ResponseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FretishParser#satisfaction}.
	 * @param ctx the parse tree
	 */
	void enterSatisfaction(FretishParser.SatisfactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FretishParser#satisfaction}.
	 * @param ctx the parse tree
	 */
	void exitSatisfaction(FretishParser.SatisfactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FretishParser#probability}.
	 * @param ctx the parse tree
	 */
	void enterProbability(FretishParser.ProbabilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link FretishParser#probability}.
	 * @param ctx the parse tree
	 */
	void exitProbability(FretishParser.ProbabilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link FretishParser#probability_aux}.
	 * @param ctx the parse tree
	 */
	void enterProbability_aux(FretishParser.Probability_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link FretishParser#probability_aux}.
	 * @param ctx the parse tree
	 */
	void exitProbability_aux(FretishParser.Probability_auxContext ctx);
	/**
	 * Enter a parse tree produced by {@link FretishParser#prob_num}.
	 * @param ctx the parse tree
	 */
	void enterProb_num(FretishParser.Prob_numContext ctx);
	/**
	 * Exit a parse tree produced by {@link FretishParser#prob_num}.
	 * @param ctx the parse tree
	 */
	void exitProb_num(FretishParser.Prob_numContext ctx);
	/**
	 * Enter a parse tree produced by {@link FretishParser#timing}.
	 * @param ctx the parse tree
	 */
	void enterTiming(FretishParser.TimingContext ctx);
	/**
	 * Exit a parse tree produced by {@link FretishParser#timing}.
	 * @param ctx the parse tree
	 */
	void exitTiming(FretishParser.TimingContext ctx);
	/**
	 * Enter a parse tree produced by {@link FretishParser#timing_aux}.
	 * @param ctx the parse tree
	 */
	void enterTiming_aux(FretishParser.Timing_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link FretishParser#timing_aux}.
	 * @param ctx the parse tree
	 */
	void exitTiming_aux(FretishParser.Timing_auxContext ctx);
	/**
	 * Enter a parse tree produced by {@link FretishParser#duration_upper}.
	 * @param ctx the parse tree
	 */
	void enterDuration_upper(FretishParser.Duration_upperContext ctx);
	/**
	 * Exit a parse tree produced by {@link FretishParser#duration_upper}.
	 * @param ctx the parse tree
	 */
	void exitDuration_upper(FretishParser.Duration_upperContext ctx);
	/**
	 * Enter a parse tree produced by {@link FretishParser#duration_lower}.
	 * @param ctx the parse tree
	 */
	void enterDuration_lower(FretishParser.Duration_lowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FretishParser#duration_lower}.
	 * @param ctx the parse tree
	 */
	void exitDuration_lower(FretishParser.Duration_lowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FretishParser#component_name}.
	 * @param ctx the parse tree
	 */
	void enterComponent_name(FretishParser.Component_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FretishParser#component_name}.
	 * @param ctx the parse tree
	 */
	void exitComponent_name(FretishParser.Component_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FretishParser#mode_name}.
	 * @param ctx the parse tree
	 */
	void enterMode_name(FretishParser.Mode_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FretishParser#mode_name}.
	 * @param ctx the parse tree
	 */
	void exitMode_name(FretishParser.Mode_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FretishParser#duration}.
	 * @param ctx the parse tree
	 */
	void enterDuration(FretishParser.DurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FretishParser#duration}.
	 * @param ctx the parse tree
	 */
	void exitDuration(FretishParser.DurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FretishParser#timeunit}.
	 * @param ctx the parse tree
	 */
	void enterTimeunit(FretishParser.TimeunitContext ctx);
	/**
	 * Exit a parse tree produced by {@link FretishParser#timeunit}.
	 * @param ctx the parse tree
	 */
	void exitTimeunit(FretishParser.TimeunitContext ctx);
	/**
	 * Enter a parse tree produced by {@link FretishParser#post_condition}.
	 * @param ctx the parse tree
	 */
	void enterPost_condition(FretishParser.Post_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FretishParser#post_condition}.
	 * @param ctx the parse tree
	 */
	void exitPost_condition(FretishParser.Post_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FretishParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr(FretishParser.Bool_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FretishParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr(FretishParser.Bool_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FretishParser#numeric_expr}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_expr(FretishParser.Numeric_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FretishParser#numeric_expr}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_expr(FretishParser.Numeric_exprContext ctx);
}