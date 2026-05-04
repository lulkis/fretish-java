package de.jfret.parser;

public sealed interface PtLtl permits PtLtl.Atom, PtLtl.Not, PtLtl.And, PtLtl.Or, PtLtl.Implies,
        PtLtl.H, PtLtl.O, PtLtl.Y, PtLtl.Since {

    record Atom(String text) implements PtLtl {}

    record Not(PtLtl a) implements PtLtl {}
    record And(PtLtl a, PtLtl b) implements PtLtl {}
    record Or(PtLtl a, PtLtl b) implements PtLtl {}
    record Implies(PtLtl a, PtLtl b) implements PtLtl {}

    record H(PtLtl a) implements PtLtl {}
    record O(PtLtl a) implements PtLtl {}
    record Y(PtLtl a) implements PtLtl {}
    record Since(PtLtl a, PtLtl b) implements PtLtl {}

    static PtLtl atom(String s) { return new Atom(s.trim()); }
}
