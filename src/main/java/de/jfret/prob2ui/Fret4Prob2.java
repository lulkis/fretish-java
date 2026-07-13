package de.jfret.prob2ui;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Fret4Prob2 {

    public static String getProb2Formula(String formula){
        String result = formula;

        result = result.replace("FALSE", "false");
        result = result.replace("TRUE", "true");
        result = result.replace("->", "=>");
        result = removeWeakYesterday(result);

        return result;
    }

    public static String removeWeakYesterday(String formula) {
        String patternStr = "Z\\s*(\\([^()]+\\)|[a-zA-Z0-9_!&|=+-><]+)";
        Pattern pattern = Pattern.compile(patternStr);

        String currentFormula = formula;
        boolean replaced;

        do {
            Matcher matcher = pattern.matcher(currentFormula);
            replaced = false;

            StringBuilder sb = new StringBuilder();
            while (matcher.find()) {
                String innerExpression = matcher.group(1);

                if (innerExpression.startsWith("(") && innerExpression.endsWith(")")) {
                    innerExpression = innerExpression.substring(1, innerExpression.length() - 1);
                }

                String replacement = "(!Y(! (" + innerExpression + ")))";
                matcher.appendReplacement(sb, Matcher.quoteReplacement(replacement));
                replaced = true;
            }
            matcher.appendTail(sb);
            currentFormula = sb.toString();

        } while (replaced); // Wiederholen, falls geschachtelte Z-Operatoren existieren

        return currentFormula;
    }
}
