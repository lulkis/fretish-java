package de.jfret.ltlparser;

import de.jfret.parser.LTLLexer;
import de.jfret.parser.LTLParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.List;
import java.util.Map;

public class LTLparser {

    public String rewriteLTL(String input) {
        return ASTtoLTL(LTL2AST(input));
    }

    public Object LTL2AST(String ltl){
        CharStream chars = CharStreams.fromString(ltl.replaceAll("=>", "->"));
        LTLLexer lexer = new LTLLexer(chars);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LTLParser parser = new LTLParser(tokens);
        parser.setBuildParseTree(true);
        LTLParser.Bool_exprContext tree = parser.bool_expr();

        LTLASTAnalyzer analyzer = new LTLASTAnalyzer();
        return analyzer.visit(tree);
    }

    private final Map<String, String> prefix = Map.ofEntries(
            Map.entry("Not", "!"),
            Map.entry("Nxt", "X"),
            Map.entry("Globally", "G"),
            Map.entry("Future", "F"),
            Map.entry("Historically", "H"),
            Map.entry("Once", "O"),
            Map.entry("PrevFalse", "Y"),
            Map.entry("PrevTrue", "Z")
    );

    private final Map<String, String> infix = Map.ofEntries(
            Map.entry("And", "&"),
            Map.entry("Or", "|"),
            Map.entry("Implies", "->"),
            Map.entry("Equiv", "<->"),
            Map.entry("ExclusiveOr", "xor"),

            Map.entry("Plus", "+"),
            Map.entry("Minus", "-"),
            Map.entry("Mult", "*"),
            Map.entry("Divide", "/"),
            Map.entry("Mod", "mod"),
            Map.entry("Expt", "^"),

            Map.entry("LessThan", "<"),
            Map.entry("LessThanOrEqual", "<="),
            Map.entry("NotEqual", "!="),
            Map.entry("Equal", "="),
            Map.entry("GreaterThan", ">"),
            Map.entry("GreaterThanOrEqual", ">="),

            Map.entry("Since", "S"),
            Map.entry("Until", "U"),
            Map.entry("Releases", "R"),
            Map.entry("Triggers", "T")
    );


    public String boundToString(Object range) {
        if (range instanceof String) {
            return (String) range;
        }

        List<?> list = (List<?>) range;

        String firstInfix = infix.get(list.get(0));

        String r;

        if (firstInfix == null) {
            r = list.stream()
                    .map(this::ASTtoLTL)
                    .reduce((a, b) -> a + "," + b)
                    .orElse("");
        } else {
            r = firstInfix + succinctRange(ASTtoLTL(list.get(1)));
        }

        return "[" + r + "]";
    }


    public String succinctRange(String arithExpr) {
        return arithExpr.replaceAll("[()\\s]", "");
    }


    public String ASTtoLTL(Object ast) {
        String result = "";

        if (ast instanceof Boolean) {
            result = (Boolean) ast ? "TRUE" : "FALSE";
        }

        else if (ast instanceof String) {
            result = ast.toString();
        }

        else if (ast instanceof List<?>) {

            List<?> list = (List<?>) ast;

            if (list.get(0) instanceof List<?>) {
                List<?> timedOp = (List<?>) list.get(0);
                String op = timedOp.get(0).toString();
                String pre = prefix.get(op);

                if (pre != null) {
                    result ="("
                            + pre
                            + boundToString(timedOp.get(1))
                            + " "
                            + ASTtoLTL(list.get(1))
                            + ")";
                } else
                {
                    String infixChar = infix.get(op);
                    if (infixChar != null) {
                        result = "("
                                + ASTtoLTL(list.get(1))
                                + " "
                                + infixChar
                                + boundToString(timedOp.get(1))
                                + " "
                                + ASTtoLTL(list.get(2))
                                + ")";
                    }
                }
            }

            else {
                String op = list.get(0).toString();
                String prefixChar = prefix.get(op);

                if (prefixChar != null) {
                    result = "("
                            + prefixChar
                            + " "
                            + ASTtoLTL(list.get(1))
                            + ")";
                } else {
                    String infixChar = infix.get(op);

                    if (infixChar != null) {
                        result = "("
                                + ASTtoLTL(list.get(1))
                                + " "
                                + infixChar
                                + " "
                                + ASTtoLTL(list.get(2))
                                + ")";
                    } else {
                        StringBuilder args = new StringBuilder();
                        for (int i = 1; i < list.size(); i++) {
                            if (i > 1) {
                                args.append(",");
                            }
                            args.append(ASTtoLTL(list.get(i)));
                        }

                        result = op
                                + "("
                                + args
                                + ")";
                    }
                }
            }
        }
        return result;
    }
}
