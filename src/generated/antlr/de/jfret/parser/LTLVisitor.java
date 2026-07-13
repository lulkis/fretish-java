// Generated from LTL.g4 by ANTLR 4.13.1
package de.jfret.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LTLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LTLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code arithGroup}
	 * labeled alternative in {@link LTLParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithGroup(LTLParser.ArithGroupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithBinary}
	 * labeled alternative in {@link LTLParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithBinary(LTLParser.ArithBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithUnary}
	 * labeled alternative in {@link LTLParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithUnary(LTLParser.ArithUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithTerm}
	 * labeled alternative in {@link LTLParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithTerm(LTLParser.ArithTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithNumber}
	 * labeled alternative in {@link LTLParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithNumber(LTLParser.ArithNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolUnary}
	 * labeled alternative in {@link LTLParser#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolUnary(LTLParser.BoolUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolConst}
	 * labeled alternative in {@link LTLParser#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolConst(LTLParser.BoolConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolTimedUnaryLTL}
	 * labeled alternative in {@link LTLParser#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolTimedUnaryLTL(LTLParser.BoolTimedUnaryLTLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolPred}
	 * labeled alternative in {@link LTLParser#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolPred(LTLParser.BoolPredContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolCompare}
	 * labeled alternative in {@link LTLParser#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolCompare(LTLParser.BoolCompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolGroup}
	 * labeled alternative in {@link LTLParser#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolGroup(LTLParser.BoolGroupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolUnaryLTL}
	 * labeled alternative in {@link LTLParser#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolUnaryLTL(LTLParser.BoolUnaryLTLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolBinary}
	 * labeled alternative in {@link LTLParser#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolBinary(LTLParser.BoolBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolOcc}
	 * labeled alternative in {@link LTLParser#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolOcc(LTLParser.BoolOccContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolBinaryLTL}
	 * labeled alternative in {@link LTLParser#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolBinaryLTL(LTLParser.BoolBinaryLTLContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTLParser#timedUnaryLTLOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimedUnaryLTLOp(LTLParser.TimedUnaryLTLOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTLParser#unaryLTLOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryLTLOp(LTLParser.UnaryLTLOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTLParser#binaryLTLOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryLTLOp(LTLParser.BinaryLTLOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTLParser#comparisonOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOp(LTLParser.ComparisonOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTLParser#bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBound(LTLParser.BoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTLParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(LTLParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTLParser#saltBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSaltBound(LTLParser.SaltBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTLParser#lp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLp(LTLParser.LpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTLParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRp(LTLParser.RpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTLParser#expt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpt(LTLParser.ExptContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTLParser#mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(LTLParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTLParser#div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(LTLParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTLParser#mod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod(LTLParser.ModContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTLParser#plus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(LTLParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTLParser#minus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(LTLParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTLParser#negate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegate(LTLParser.NegateContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTLParser#not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(LTLParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTLParser#and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(LTLParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTLParser#or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(LTLParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTLParser#xor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor(LTLParser.XorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTLParser#implies}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplies(LTLParser.ImpliesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTLParser#equiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquiv(LTLParser.EquivContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTLParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF(LTLParser.FContext ctx);
	/**
	 * Visit a parse tree produced by {@link LTLParser#t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT(LTLParser.TContext ctx);
}