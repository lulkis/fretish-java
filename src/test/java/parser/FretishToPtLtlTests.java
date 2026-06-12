package parser;

import static org.junit.jupiter.api.Assertions.assertEquals;

import de.jfret.parser.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FretishToPtLtlTests {

    private static String norm(String s) {
        return s.replaceAll("\\s+", "");
    }

    @Test
    @DisplayName("Example for LIFT")
    public void testReal(){
        String in = "WHEN counter = 0 THE Lift SHALL NEVER SATISFY dec";
        String expected = "(H ((H (! (counter = 0))) | (! dec)))";
        Fret2ptLTL parser = new Fret2ptLTL();

        String processedExpected = norm(expected);
        String processedActual = norm(parser.compileToPtLtl(in));

        assertEquals(processedExpected, processedActual);
    }

    /*
    @Test
    public void testRegularCondition() {
        String in = "when a the sys shall satisfy b";
        String expected = "H(true -> ((a) -> (b)))";
        assertEquals(norm(expected), norm(compileToPtLtl(in)));
    }

    @Test
    public void testInMode() {
        String in = "in cruise when a the sys shall satisfy b";
        String expected = "H((cruise) -> ((a) -> (b)))";
        assertEquals(norm(expected), norm(compileToPtLtl(in)));
    }

    @Test
    public void testExceptInMode() {
        String in = "except in cruise when a the sys shall satisfy b";
        String expected = "H((!(cruise)) -> ((a) -> (b)))";
        assertEquals(norm(expected), norm(compileToPtLtl(in)));
    }

    @Test
    public void testAfterInclusive() {
        String in = "after (p) when a the sys shall satisfy b";
        String expected = "H((O((p))) -> ((a) -> (b)))";
        assertEquals(norm(expected), norm(compileToPtLtl(in)));
    }

    @Test
    public void testBeforeInclusive() {
        String in = "before (p) when a the sys shall satisfy b";
        String expected = "H((!(O((p)))) -> ((a) -> (b)))";
        assertEquals(norm(expected), norm(compileToPtLtl(in)));
    }
     */
}
