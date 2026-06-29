package de.jfret.parser;

import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

public class AntlrUtilities {

    public List<String> getTokens(ParseTree ctx) {
        List<String> tokens = new ArrayList<>();
        getTokensRecursive(tokens, ctx);
        return tokens;
    }

    private void getTokensRecursive(List<String> tokens, ParseTree ctx) {

        if (ctx == null) return;

        int childCount = ctx.getChildCount();

        if (childCount == 0) {
            // leaf node
            String text = ctx.getText();
            if (text != null) {
                tokens.add(text);
            }
            return;
        }

        for (int i = 0; i < childCount; i++) {
            ParseTree child = ctx.getChild(i);
            getTokensRecursive(tokens, child);
        }
    }

    public String getText(ParseTree ctx) {
        List<String> tokens = getTokens(ctx);
        return String.join(" ", tokens);
    }
}
