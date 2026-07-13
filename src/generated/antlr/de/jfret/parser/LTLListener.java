// Generated from LTL.g4 by ANTLR 4.13.1
package de.jfret.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LTLParser}.
 */
public interface LTLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code arithGroup}
	 * labeled alternative in {@link LTLParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithGroup(LTLParser.ArithGroupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithGroup}
	 * labeled alternative in {@link LTLParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithGroup(LTLParser.ArithGroupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithBinary}
	 * labeled alternative in {@link LTLParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithBinary(LTLParser.ArithBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithBinary}
	 * labeled alternative in {@link LTLParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithBinary(LTLParser.ArithBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithUnary}
	 * labeled alternative in {@link LTLParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithUnary(LTLParser.ArithUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithUnary}
	 * labeled alternative in {@link LTLParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithUnary(LTLParser.ArithUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithTerm}
	 * labeled alternative in {@link LTLParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithTerm(LTLParser.ArithTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithTerm}
	 * labeled alternative in {@link LTLParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithTerm(LTLParser.ArithTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithNumber}
	 * labeled alternative in {@link LTLParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithNumber(LTLParser.ArithNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithNumber}
	 * labeled alternative in {@link LTLParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithNumber(LTLParser.ArithNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolUnary}
	 * labeled alternative in {@link LTLParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolUnary(LTLParser.BoolUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolUnary}
	 * labeled alternative in {@link LTLParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolUnary(LTLParser.BoolUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolConst}
	 * labeled alternative in {@link LTLParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolConst(LTLParser.BoolConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolConst}
	 * labeled alternative in {@link LTLParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolConst(LTLParser.BoolConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolTimedUnaryLTL}
	 * labeled alternative in {@link LTLParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolTimedUnaryLTL(LTLParser.BoolTimedUnaryLTLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolTimedUnaryLTL}
	 * labeled alternative in {@link LTLParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolTimedUnaryLTL(LTLParser.BoolTimedUnaryLTLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolPred}
	 * labeled alternative in {@link LTLParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolPred(LTLParser.BoolPredContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolPred}
	 * labeled alternative in {@link LTLParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolPred(LTLParser.BoolPredContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolCompare}
	 * labeled alternative in {@link LTLParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolCompare(LTLParser.BoolCompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolCompare}
	 * labeled alternative in {@link LTLParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolCompare(LTLParser.BoolCompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolGroup}
	 * labeled alternative in {@link LTLParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolGroup(LTLParser.BoolGroupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolGroup}
	 * labeled alternative in {@link LTLParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolGroup(LTLParser.BoolGroupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolUnaryLTL}
	 * labeled alternative in {@link LTLParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolUnaryLTL(LTLParser.BoolUnaryLTLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolUnaryLTL}
	 * labeled alternative in {@link LTLParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolUnaryLTL(LTLParser.BoolUnaryLTLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolBinary}
	 * labeled alternative in {@link LTLParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolBinary(LTLParser.BoolBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolBinary}
	 * labeled alternative in {@link LTLParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolBinary(LTLParser.BoolBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolOcc}
	 * labeled alternative in {@link LTLParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolOcc(LTLParser.BoolOccContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolOcc}
	 * labeled alternative in {@link LTLParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolOcc(LTLParser.BoolOccContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolBinaryLTL}
	 * labeled alternative in {@link LTLParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolBinaryLTL(LTLParser.BoolBinaryLTLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolBinaryLTL}
	 * labeled alternative in {@link LTLParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolBinaryLTL(LTLParser.BoolBinaryLTLContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLParser#timedUnaryLTLOp}.
	 * @param ctx the parse tree
	 */
	void enterTimedUnaryLTLOp(LTLParser.TimedUnaryLTLOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLParser#timedUnaryLTLOp}.
	 * @param ctx the parse tree
	 */
	void exitTimedUnaryLTLOp(LTLParser.TimedUnaryLTLOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLParser#unaryLTLOp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryLTLOp(LTLParser.UnaryLTLOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLParser#unaryLTLOp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryLTLOp(LTLParser.UnaryLTLOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLParser#binaryLTLOp}.
	 * @param ctx the parse tree
	 */
	void enterBinaryLTLOp(LTLParser.BinaryLTLOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLParser#binaryLTLOp}.
	 * @param ctx the parse tree
	 */
	void exitBinaryLTLOp(LTLParser.BinaryLTLOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLParser#comparisonOp}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOp(LTLParser.ComparisonOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLParser#comparisonOp}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOp(LTLParser.ComparisonOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLParser#bound}.
	 * @param ctx the parse tree
	 */
	void enterBound(LTLParser.BoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLParser#bound}.
	 * @param ctx the parse tree
	 */
	void exitBound(LTLParser.BoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(LTLParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(LTLParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLParser#saltBound}.
	 * @param ctx the parse tree
	 */
	void enterSaltBound(LTLParser.SaltBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLParser#saltBound}.
	 * @param ctx the parse tree
	 */
	void exitSaltBound(LTLParser.SaltBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLParser#lp}.
	 * @param ctx the parse tree
	 */
	void enterLp(LTLParser.LpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLParser#lp}.
	 * @param ctx the parse tree
	 */
	void exitLp(LTLParser.LpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp(LTLParser.RpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp(LTLParser.RpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLParser#expt}.
	 * @param ctx the parse tree
	 */
	void enterExpt(LTLParser.ExptContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLParser#expt}.
	 * @param ctx the parse tree
	 */
	void exitExpt(LTLParser.ExptContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLParser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(LTLParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLParser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(LTLParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(LTLParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(LTLParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLParser#mod}.
	 * @param ctx the parse tree
	 */
	void enterMod(LTLParser.ModContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLParser#mod}.
	 * @param ctx the parse tree
	 */
	void exitMod(LTLParser.ModContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLParser#plus}.
	 * @param ctx the parse tree
	 */
	void enterPlus(LTLParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLParser#plus}.
	 * @param ctx the parse tree
	 */
	void exitPlus(LTLParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLParser#minus}.
	 * @param ctx the parse tree
	 */
	void enterMinus(LTLParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLParser#minus}.
	 * @param ctx the parse tree
	 */
	void exitMinus(LTLParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLParser#negate}.
	 * @param ctx the parse tree
	 */
	void enterNegate(LTLParser.NegateContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLParser#negate}.
	 * @param ctx the parse tree
	 */
	void exitNegate(LTLParser.NegateContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLParser#not}.
	 * @param ctx the parse tree
	 */
	void enterNot(LTLParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLParser#not}.
	 * @param ctx the parse tree
	 */
	void exitNot(LTLParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(LTLParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(LTLParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(LTLParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(LTLParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLParser#xor}.
	 * @param ctx the parse tree
	 */
	void enterXor(LTLParser.XorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLParser#xor}.
	 * @param ctx the parse tree
	 */
	void exitXor(LTLParser.XorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLParser#implies}.
	 * @param ctx the parse tree
	 */
	void enterImplies(LTLParser.ImpliesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLParser#implies}.
	 * @param ctx the parse tree
	 */
	void exitImplies(LTLParser.ImpliesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLParser#equiv}.
	 * @param ctx the parse tree
	 */
	void enterEquiv(LTLParser.EquivContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLParser#equiv}.
	 * @param ctx the parse tree
	 */
	void exitEquiv(LTLParser.EquivContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLParser#f}.
	 * @param ctx the parse tree
	 */
	void enterF(LTLParser.FContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLParser#f}.
	 * @param ctx the parse tree
	 */
	void exitF(LTLParser.FContext ctx);
	/**
	 * Enter a parse tree produced by {@link LTLParser#t}.
	 * @param ctx the parse tree
	 */
	void enterT(LTLParser.TContext ctx);
	/**
	 * Exit a parse tree produced by {@link LTLParser#t}.
	 * @param ctx the parse tree
	 */
	void exitT(LTLParser.TContext ctx);
}