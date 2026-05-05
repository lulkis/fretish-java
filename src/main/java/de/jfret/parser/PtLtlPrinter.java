package de.jfret.parser;

public final class PtLtlPrinter {
    public String print(PtLtl f) {
        return switch (f) {
            case PtLtl.Atom a -> {
                String t = a.text();
                if (t.equals("true") || t.equals("false")) yield t;
                if (t.startsWith("(") && t.endsWith(")")) yield t;
                yield "(" + t + ")";
            }
            case PtLtl.Not n -> "(!(" + printInner(n.a()) + "))";
            case PtLtl.And a -> "(" + print(a.a()) + " & " + print(a.b()) + ")";
            case PtLtl.Or o -> "(" + print(o.a()) + " | " + print(o.b()) + ")";
            case PtLtl.Implies i -> "(" + print(i.a()) + " -> " + print(i.b()) + ")";
            case PtLtl.H h -> "H(" + printUnary(h.a()) + ")";
            case PtLtl.O o -> "(O(" + print(o.a()) + "))";
            case PtLtl.Y y -> "(Y(" + print(y.a()) + "))";
            case PtLtl.Since s -> "(" + print(s.a()) + " S " + print(s.b()) + ")";
        };
    }

    private String printUnary(PtLtl f) {
        if (f instanceof PtLtl.Implies i) {
            return print(i.a()) + " -> " + print(i.b());
        }
        return print(f);
    }

    private String printInner(PtLtl f) {
        String s = print(f);
        if (s.startsWith("(") && s.endsWith(")")) {
            return s.substring(1, s.length() - 1);
        }
        return s;
    }
}
