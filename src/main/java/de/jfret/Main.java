package de.jfret;

import de.jfret.parser.FretishCompiler;
import de.jfret.parser.FretishLexer;
import de.jfret.parser.FretishParser;
import de.jfret.parser.ParserErrorListener;
import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.automata.ATNPrinter;
import org.antlr.v4.runtime.*;

import javax.xml.transform.ErrorListener;
import java.util.ArrayList;

public class Main {

    static void main() {
        //String statement = "I dunno, sollte nicht parsen weil dumm";
        String statementGood = "After boot mode the system shall immediately satisfy prompt_for_password";

        FretishCompiler compiler = new FretishCompiler();

        System.out.println(compiler.compileFretish(statementGood).size());
    }
}
