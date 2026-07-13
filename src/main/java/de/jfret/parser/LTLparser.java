package de.jfret.parser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class LTLparser {

    public Object LTL2AST(String ltl){
        CharStream chars = CharStreams.fromString(ltl.replaceAll("=>", "->"));
        LTLLexer lexer = new LTLLexer(chars);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LTLParser parser = new LTLParser(tokens);
        parser.setBuildParseTree(true);
        LTLParser.Bool_exprContext tree = parser.bool_expr();

        LTLASTAnalyzer analyzer = new LTLASTAnalyzer();
        return analyzer.visit(tree);
    }
}
