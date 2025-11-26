package de.jfret.parser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;

import java.util.ArrayList;

public class FretishCompiler {

    public ArrayList<String> compileFretish(String prompt){
        ArrayList<String> errorList = new ArrayList<>();

        CharStream cs = CharStreams.fromString(prompt);
        Lexer lexer = new FretishLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        FretishParser parser = new FretishParser(tokens);
        ParserErrorListener errorListener = new ParserErrorListener(errorList);

        lexer.removeErrorListeners();
        lexer.addErrorListener(errorListener);
        parser.removeErrorListeners();
        parser.addErrorListener(errorListener);

        parser.reqt_body();
        return errorList;
    }
}
