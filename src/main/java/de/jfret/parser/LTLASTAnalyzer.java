package de.jfret.parser;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.Objects;

public class LTLASTAnalyzer extends LTLBaseVisitor<Object>{

    AntlrUtilities utils =  new AntlrUtilities();

    public LTLASTAnalyzer() {
        super();
    }

    public String symbolToOpMap(String symbol) {
        return switch (symbol) {
            case "Y" -> "PrevFalse";
            case "Z" -> "PrevTrue";
            case "H" -> "Historically";
            case "O" -> "Once";
            case "S" -> "Since";
            case "T" -> "Triggers";
            case "SI" -> "SinceInclusive";
            case "UI" -> "UntilInclusive";
            case "X" -> "Nxt";
            case "G" -> "Globally";
            case "F" -> "Future";
            case "U" -> "Untl";
            case "V" -> "Releases";
            case "R" -> "Releases";
            case "<|" -> "LookingBackwards";
            case "|>" -> "LookingForwards";
            case "!" -> "Not";
            case "&" -> "And";
            case "|" -> "Or";
            case "->" -> "Implies";
            case "<->" -> "Equiv";
            case "xor" -> "ExclusiveOr";
            case "+" -> "Plus";
            case "-" -> "Minus";
            case "/" -> "Divide";
            case "*" -> "Mult";
            case "mod" -> "Mod";
            case "^" -> "Expt";
            case "<" -> "LessThan";
            case "<=" -> "LessThanOrEqual";
            case "!=" -> "NotEqual";
            case "=" -> "Equal";
            case ">" -> "GreaterThan";
            case ">=" -> "GreaterThanOrEqual";
            default -> symbol;
        };
    }

    public String symbolToOp(String symbolIn, boolean isTimed) {
        String symbol = symbolIn.trim().replaceAll("(?i)mod", "mod").replaceAll("(?i)xor", "xor");
        String op = symbolToOpMap(symbol) + (isTimed ? "Timed" : "");
        return op;
    }

    @Override
    public Object visitArithGroup(LTLParser.ArithGroupContext ctx) {
        return visit(ctx.arithmetic_expr());
    }

    @Override
    public Object visitArithBinary(LTLParser.ArithBinaryContext ctx) {
        String opSym = ctx.getChild(1).getText();

        String op = symbolToOp(opSym, false);

        if (op == null) {
            System.out.println("!! visitArithBinary: unknown op " + opSym);
        }

        Object operand1 = visit(ctx.arithmetic_expr(0));
        Object operand2 = visit(ctx.arithmetic_expr(1));

        return List.of(op, operand1, operand2);
    }

    @Override
    public Object visitArithUnary(LTLParser.ArithUnaryContext ctx) {
        return List.of(
                "Negate",
                visit(ctx.arithmetic_expr())
        );
    }

    @Override
    public Object visitArithNumber(LTLParser.ArithNumberContext ctx) {
        return ctx.getText();
    }

    @Override
    public Object visitBoolUnary(LTLParser.BoolUnaryContext ctx) {
        return List.of(
                "Not",
                visit(ctx.bool_expr())
        );
    }

    @Override
    public Object visitBoolTimedUnaryLTL(LTLParser.BoolTimedUnaryLTLContext ctx) {
        Object operator = visit(ctx.timedUnaryLTLOp());
        Object bound = visit(ctx.bound());
        Object expr = visit(ctx.bool_expr());

        return List.of(
                List.of(operator, bound),
                expr
        );
    }

    @Override
    public Object visitBoolPred(LTLParser.BoolPredContext ctx) {
        String functor = ctx.getChild(0).getText();

        if (ctx.getChildCount() == 1) {
            return functor;
        }

        List<Object> result = new ArrayList<>();
        result.add(functor);

        for (int i = 0; i < ctx.getChildCount(); i++) {
            Object child = visit(ctx.getChild(i));

            if (child != null) {
                result.add(child);
            }
        }

        return result;
    }

    @Override
    public Object visitArithTerm(LTLParser.ArithTermContext ctx) {
        String functor = ctx.getChild(0).getText();

        if (ctx.getChildCount() == 1) {
            return functor;
        }

        List<Object> result = new ArrayList<>();
        result.add(functor);

        for (int i = 0; i < ctx.getChildCount(); i++) {
            Object child = visit(ctx.getChild(i));

            if (child != null) {
                result.add(child);
            }
        }

        return result;
    }

    @Override
    public Object visitBoolConst(LTLParser.BoolConstContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public Object visitBoolCompare(LTLParser.BoolCompareContext ctx) {
        Object left = visit(ctx.getChild(0));
        Object op = visit(ctx.getChild(1));
        Object right = visit(ctx.getChild(2));

        return List.of(op, left, right);
    }

    @Override
    public Object visitBoolGroup(LTLParser.BoolGroupContext ctx) {
        return this.visit(ctx.getChild(1));
    }

    @Override
    public Object visitBoolUnaryLTL(LTLParser.BoolUnaryLTLContext ctx) {
        String operator = utils.getText(ctx.unaryLTLOp());
        return List.of(
                symbolToOp(operator, false),
                visit(ctx.bool_expr())
        );
    }

    @Override
    public Object visitBoolBinary(LTLParser.BoolBinaryContext ctx) {
        String opSym = ctx.getChild(1).getText();

        String op = symbolToOp(opSym, false);

        if (op == null) {
            System.out.println("!! visitBoolBinary: unknown op " + opSym);
        }

        Object operand1 = visit(ctx.bool_expr(0));
        Object operand2 = visit(ctx.bool_expr(1));

        return List.of(op, operand1, operand2);
    }

    @Override
    public Object visitBoolOcc(LTLParser.BoolOccContext ctx) {
        String tense = ctx.getChild(2).getText();

        String op;
        switch (tense) {
            case "previous":
                op = "prevOcc";
                break;
            case "next":
                op = "nextOcc";
                break;
            default:
                op = tense;
        }

        Object operand1 = visit(ctx.bool_expr(0));
        Object operand2 = visit(ctx.bool_expr(1));

        return List.of(op, operand1, operand2);
    }

    @Override
    public Object visitBoolBinaryLTL(LTLParser.BoolBinaryLTLContext ctx) {
        List<Object> children = new ArrayList<>();

        for (int i = 0; i < ctx.getChildCount(); i++) {
            Object result = visit(ctx.getChild(i));
            if (result != null) {
                children.add(result);
            }
        }

        if (children.size() == 4) {
            Object bnd = children.get(2);
            String op = symbolToOp((String) children.get(1), true);

            return List.of(
                    List.of(op, bnd),
                    children.get(0),
                    children.get(3)
            );
        }

        return List.of(
                symbolToOp((String) children.get(1), false),
                children.get(0),
                children.get(2)
        );
    }

    @Override
    public String visitTimedUnaryLTLOp(LTLParser.TimedUnaryLTLOpContext ctx) {
        return symbolToOp(utils.getText(ctx), true);
    }

    @Override
    public String visitUnaryLTLOp(LTLParser.UnaryLTLOpContext ctx) {
        return symbolToOp(utils.getText(ctx), false);
    }

    @Override
    public String visitBinaryLTLOp(LTLParser.BinaryLTLOpContext ctx) {
        return utils.getText(ctx);
    }

    @Override
    public Object visitComparisonOp(LTLParser.ComparisonOpContext ctx) {
        return symbolToOp(utils.getText(ctx), false);
    }

    @Override
    public Object visitBound(LTLParser.BoundContext ctx) {
        return this.visit(ctx.getChild(1));
    }

    @Override
    public List<Object> visitRange(LTLParser.RangeContext ctx) {
        List<Object> children = new ArrayList<>();

        for (int i = 0; i < ctx.getChildCount(); i++) {
            Object result = visit(ctx.getChild(i));
            if (result != null) {
                children.add(result);
            }
        }

        return children;
    }

    @Override
    public Object visitSaltBound(LTLParser.SaltBoundContext ctx) {
        return this.visitChildren(ctx);
    }

    @Override
    public Boolean visitLp(LTLParser.LpContext ctx) {
        return null;
    }

    @Override
    public Boolean visitRp(LTLParser.RpContext ctx) {
        return null;
    }

    @Override
    public Boolean visitF(LTLParser.FContext ctx) {
        return false;
    }

    @Override
    public Boolean visitT(LTLParser.TContext ctx) {
        return true;
    }
}
