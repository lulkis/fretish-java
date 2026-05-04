package de.jfret.parser;

public final class ExprNorm {
    private ExprNorm() {}

    public static String normalize(String raw) {
        if (raw == null) return null;
        String s = raw.trim();

        if (!s.startsWith("(")) s = "(" + s + ")";

        s = s.replaceAll("(?i)\\s+then\\s+", " -> ");

        s = s.replaceAll("(?i)(\\(|\\s)if\\s+", "$1");

        return s;
    }
}
