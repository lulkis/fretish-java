package de.jfret.parser;

public final class ReqModel {

    public enum ScopeType { NONE, GLOBALLY, IN, IN_MODE, AFTER, BEFORE, ONLY_AFTER, ONLY_BEFORE, ONLY_IN, NOT_IN, UNHANDLED }
    public enum ConditionType { NONE, REGULAR, HOLDING }
    public enum TimingType { NONE, WITHIN, FOR, AFTER, UNTIL, BEFORE, IMMEDIATELY, NEXT, FINALLY, ALWAYS, NEVER }

    public String scopeModeExpr;

    public ConditionType conditionType = ConditionType.NONE;
    public String preConditionExpr;
    public String stopConditionExpr;

    public TimingType timingType = TimingType.NONE;
    public String duration;

    public String postConditionExpr;


    public boolean scopeExclusive = false;

    public ScopeType scopeType = ScopeType.NONE;
    public String scopeExpr;
}
