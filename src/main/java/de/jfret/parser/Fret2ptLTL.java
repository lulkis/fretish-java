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

        System.out.println(tableLookUp);

        TemplateManager manager = new TemplateManager();
        String ptTemplate = manager.getPastTimeTemplate(tableLookUp);
        System.out.println(ptTemplate);

        System.out.println(model.postConditionExpr);
        //ptTemplate = ptTemplate.replace("$regular_condition$", wrapComplexExpression(model.preConditionExpr));
        //ptTemplate = ptTemplate.replace("$post_condition$", wrapComplexExpression(model.postConditionExpr));

        LTLparser ltLparser = new LTLparser();

        if(model.preConditionExpr != null) {
            ptTemplate = ptTemplate.replace("$regular_condition$", ltLparser.rewriteLTL(model.preConditionExpr));
        }

        if(model.postConditionExpr != null) {
            ptTemplate = ptTemplate.replace("$post_condition$", ltLparser.rewriteLTL(model.postConditionExpr));
        }

        return ptTemplate;
    }
}
