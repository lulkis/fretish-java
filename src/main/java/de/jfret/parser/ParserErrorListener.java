package de.jfret.parser;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.ArrayList;

public class ParserErrorListener extends BaseErrorListener {

    private ArrayList<String> errorList = new ArrayList<>();

    public ParserErrorListener(ArrayList<String> errorList){
        this.errorList = errorList;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        String error = ("Error: " + line + ":" + charPositionInLine + ": " + msg);
        errorList.add(error);
    }
}
