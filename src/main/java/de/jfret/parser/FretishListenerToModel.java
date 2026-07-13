package de.jfret.parser;

import java.util.Arrays;
import java.util.HashMap;

public final class FretishListenerToModel extends RequirementBaseListener {

    AntlrUtilities antlrUtilities =  new AntlrUtilities();
    private final ReqModel model = new ReqModel();

    public ReqModel getModel() { return model; }

    @Override
    public void enterScope(RequirementParser.ScopeContext ctx) {
        String t = ctx.getText().toLowerCase();
        model.scopeExclusive = t.contains("strictly");

        boolean hasAfter = t.contains("after");
        boolean hasBefore = t.contains("before");
        boolean hasExcept = t.startsWith("except") || t.contains("except");
        boolean hasNot = t.contains(" not ");

        String expr = null;
        if (ctx.scope_mode() != null) expr = ExprNorm.normalize(ctx.scope_mode().getText());
        else if (ctx.scope_condition() != null) expr = ExprNorm.normalize(ctx.scope_condition().getText());

        model.scopeExpr = expr;

        if (t.startsWith("globally")) model.scopeType = ReqModel.ScopeType.GLOBALLY;
        else if (hasAfter) model.scopeType = ReqModel.ScopeType.AFTER;
        else if (hasBefore) model.scopeType = ReqModel.ScopeType.BEFORE;
        else if (hasExcept || hasNot) model.scopeType = ReqModel.ScopeType.NOT_IN;
        else model.scopeType = ReqModel.ScopeType.IN;
    }
    @Override
    public void enterScope_mode(RequirementParser.Scope_modeContext ctx) {
        model.scopeModeExpr = ExprNorm.normalize(ctx.getText());
    }

    @Override
    public void enterScope_condition(RequirementParser.Scope_conditionContext ctx) {
        model.scopeModeExpr = ExprNorm.normalize(ctx.getText());
    }

    @Override
    public void enterQualifier_word(RequirementParser.Qualifier_wordContext ctx) {
        String q = ctx.getText().trim().toLowerCase();
        if (q.equals("whenever")) model.conditionType = ReqModel.ConditionType.HOLDING;
        else model.conditionType = ReqModel.ConditionType.REGULAR;
    }

    @Override
    public void enterPre_condition(RequirementParser.Pre_conditionContext ctx) {
        model.preConditionExpr = ExprNorm.normalize(ctx.getText());
    }

    @Override
    public void enterStop_condition(RequirementParser.Stop_conditionContext ctx) {
        model.stopConditionExpr = ExprNorm.normalize(ctx.getText());
    }

    @Override
    public void enterDuration(RequirementParser.DurationContext ctx) {
        String text = antlrUtilities.getText(ctx).trim();

        java.util.regex.Matcher matcher =
                java.util.regex.Pattern
                        .compile("\\d+(?:\\.\\d+)?")
                        .matcher(text);

        if (matcher.find()) {
            model.duration = matcher.group();
        }
    }

    @Override
    public void enterTiming(RequirementParser.TimingContext ctx) {
        String[] words = antlrUtilities.getText(ctx).trim().toLowerCase().split("\\s+");
        String text = words[0];

        if (text.equals("at")) {
            String mid = words[2];
            switch (mid) {
                case "first", "same" -> model.timingType = ReqModel.TimingType.IMMEDIATELY;
                case "next" -> model.timingType = ReqModel.TimingType.NEXT;
                case "last" -> model.timingType = ReqModel.TimingType.FINALLY;
            }

        } else {
            if (text.equals("initially")) {
                model.timingType = ReqModel.TimingType.IMMEDIATELY;
            } else {
                switch (text) {
                    case "always" -> model.timingType = ReqModel.TimingType.ALWAYS;
                    case "within" -> model.timingType = ReqModel.TimingType.WITHIN;
                    case "never" -> model.timingType = ReqModel.TimingType.NEVER;
                }
                System.out.println(text);
            }
        }

        System.out.println(model.timingType);
    }

    /*
    @Override
    public void exitTiming(RequirementParser.TimingContext ctx) {
        System.out.println(ctx.start.getText());
        System.out.println(ctx.stop.getText());
        model.timingTextRange = new TimingTextRange(Integer.parseInt(ctx.start.getText()), Integer.parseInt(ctx.stop.getText()));
    }

     */

    @Override
    public void enterPost_condition(RequirementParser.Post_conditionContext ctx) {
        model.postConditionExpr = ExprNorm.normalize(ctx.getText());
    }

    @Override
    public void enterSatisfaction(RequirementParser.SatisfactionContext ctx) {
        if (model.responseType != ReqModel.ResponseType.ORDER && model.responseType != ReqModel.ResponseType.NOT_ORDER) {
            model.responseType = ReqModel.ResponseType.SATISFACTION;
        }
    }
}
