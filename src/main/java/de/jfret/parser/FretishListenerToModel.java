package de.jfret.parser;

public final class FretishListenerToModel extends RequirementBaseListener {

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
        model.duration = ctx.NUMBER().getText();
    }

    @Override
    public void enterTiming(RequirementParser.TimingContext ctx) {
        String t = ctx.getText().trim().toLowerCase();
        if (t.startsWith("within")) model.timingType = ReqModel.TimingType.WITHIN;
        else if (t.startsWith("for")) model.timingType = ReqModel.TimingType.FOR;
        else if (t.startsWith("after")) model.timingType = ReqModel.TimingType.AFTER;
        else if (t.startsWith("until")) model.timingType = ReqModel.TimingType.UNTIL;
        else if (t.startsWith("before")) model.timingType = ReqModel.TimingType.BEFORE;
        else if (t.startsWith("initially") || t.startsWith("immediately")) model.timingType = ReqModel.TimingType.IMMEDIATELY;
        else if (t.startsWith("finally")) model.timingType = ReqModel.TimingType.FINALLY;
        else if (t.startsWith("eventually")) model.timingType = ReqModel.TimingType.FINALLY;
        else if (t.startsWith("always")) model.timingType = ReqModel.TimingType.ALWAYS;
        else if (t.startsWith("never")) model.timingType = ReqModel.TimingType.NEVER;
    }

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
