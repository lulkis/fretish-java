package de.jfret;

import de.jfret.parser.FretishCompiler;
import org.antlr.v4.runtime.*;

public class Main {

    static void main() {
        String statementGood = "After boot mode the system shall immediately satisfy prompt_for_password";

        FretishCompiler compiler = new FretishCompiler();

        System.out.println(compiler.compileFretish(statementGood).size());
    }
}
