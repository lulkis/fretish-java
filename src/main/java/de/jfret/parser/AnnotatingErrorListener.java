package de.jfret.parser;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.List;

public class AnnotatingErrorListener extends BaseErrorListener {
    private final List<Annotation> annotations;

    public AnnotatingErrorListener(List<Annotation> annotations) {
        this.annotations = annotations;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e) {
        annotations.add(new Annotation(line, charPositionInLine, msg));
    }
}
