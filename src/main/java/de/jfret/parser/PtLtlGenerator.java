package de.jfret.parser;

public final class PtLtlGenerator {

    public String toPtLtl(ReqModel r) {
        String M = r.scopeModeExpr;
        String TC = r.preConditionExpr;
        String R  = r.postConditionExpr;
        String SC = r.stopConditionExpr;

        String scopeGuard = switch (r.scopeType) {
            case NONE, GLOBALLY -> "true";
            case IN_MODE, ONLY_IN -> "(" + M + ")";
            default -> "true";
        };

        String timedResponse = applyTiming(r, R);
        String core = "(" + TC + " -> " + timedResponse + ")";

        return "H(" + scopeGuard + " -> " + core + ")";
    }

    private String applyTiming(ReqModel r, String R) {
        return switch (r.timingType) {
            case NONE -> R;
            case IMMEDIATELY -> R;
            case NEXT -> "Y(" + R + ")";
            case FINALLY -> "O(" + R + ")";
            case ALWAYS -> "H(" + R + ")";
            case NEVER -> "H(!(" + R + "))";
            default -> R;
        };
    }

    public PtLtl toFormula(ReqModel r) {
        PtLtl guard = scopeGuard(r);
        PtLtl trigger = (r.preConditionExpr == null) ? PtLtl.atom("true") : PtLtl.atom(r.preConditionExpr);
        PtLtl response = (r.postConditionExpr == null) ? PtLtl.atom("true") : PtLtl.atom(r.postConditionExpr);

        PtLtl core = new PtLtl.Implies(trigger, response);

        return new PtLtl.H(new PtLtl.Implies(guard, core));
    }

    private PtLtl scopeGuard(ReqModel r) {
        PtLtl P = (r.scopeExpr == null) ? PtLtl.atom("true") : PtLtl.atom(r.scopeExpr);

        return switch (r.scopeType) {
            case NONE, GLOBALLY -> PtLtl.atom("true");

            case IN -> P;
            case NOT_IN -> new PtLtl.Not(P);

            case IN_MODE -> null;
            case AFTER -> {
                PtLtl base = new PtLtl.O(P);
                yield r.scopeExclusive ? new PtLtl.And(base, new PtLtl.Not(P)) : base;
            }

            case BEFORE -> {
                PtLtl base = new PtLtl.Not(new PtLtl.O(P));
                yield r.scopeExclusive ? new PtLtl.And(base, new PtLtl.Not(P)) : base;
            }

            case UNHANDLED -> PtLtl.atom("true");
            case ONLY_AFTER -> null;
            case ONLY_BEFORE -> null;
            case ONLY_IN -> null;
        };
    }
}
