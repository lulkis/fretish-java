package de.jfret.parser;

public final class PtLtlPrinter {
    public String print(PtLtl f) {
        return switch (f) {
            case PtLtl.Atom a -> a.text();
            case PtLtl.Not n -> "!(" + print(n.a()) + ")";
            case PtLtl.And a -> "(" + print(a.a()) + " & " + print(a.b()) + ")";
            case PtLtl.Or o -> "(" + print(o.a()) + " | " + print(o.b()) + ")";
            case PtLtl.Implies i -> "(" + print(i.a()) + " -> " + print(i.b()) + ")";
            case PtLtl.H h -> "H(" + print(h.a()) + ")";
            case PtLtl.O o -> "O(" + print(o.a()) + ")";
            case PtLtl.Y y -> "Y(" + print(y.a()) + ")";
            case PtLtl.Since s -> "(" + print(s.a()) + " S " + print(s.b()) + ")";
        };
    }
}
