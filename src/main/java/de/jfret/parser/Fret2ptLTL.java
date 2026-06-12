package de.jfret.parser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Fret2ptLTL {

    public String compileToPtLtl(String input) {
        CharStream chars = CharStreams.fromString(input);
        RequirementLexer lexer = new RequirementLexer(chars);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RequirementParser parser = new RequirementParser(tokens);

        ParseTree tree = parser.reqt_body();

        FretishListenerToModel listener = new FretishListenerToModel();
        ParseTreeWalker.DEFAULT.walk(listener, tree);
        ReqModel model = listener.getModel();

        TypeConverter type = new TypeConverter();
        String tableLookUp = type.getScopeStringFromType(model.scopeType) + "," +
                type.getConditionStringFromType(model.conditionType) + "," +
                type.getTimingStringFromType(model.timingType) + "," +
                type.getResponseStringFromType(model.responseType);


        TemplateManager manager = new TemplateManager();
        String ptTemplate = manager.getPastTimeTemplate(tableLookUp);
        System.out.println(ptTemplate);

        ptTemplate = ptTemplate.replace("$regular_condition$", wrapComplexExpression(model.preConditionExpr));
        ptTemplate = ptTemplate.replace("$post_condition$", wrapComplexExpression(model.postConditionExpr));

        return ptTemplate;
    }

    private String wrapComplexExpression(String expr) {
        if (expr == null) return "";
        expr = expr.trim();

        if (expr.startsWith("(") && expr.endsWith(")")) {
            return expr;
        }

        if (expr.contains("=") || expr.contains("<") || expr.contains(">") ||
                expr.contains("&") || expr.contains("|") || expr.contains("+") || expr.contains("-")) {
            return "(" + expr + ")";
        }

        return expr;
    }
}
