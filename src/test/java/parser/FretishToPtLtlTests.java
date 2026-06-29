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
    @DisplayName("Example for LIFT 1")
    public void testReal1(){
        String in = "WHEN counter = 0 THE Lift SHALL NEVER SATISFY dec";
        String expected = "(H ((H (! (counter = 0))) | (! dec)))";
        Fret2ptLTL parser = new Fret2ptLTL();

        String processedExpected = norm(expected);
        String processedActual = norm(parser.compileToPtLtl(in));

        assertEquals(processedExpected, processedActual);
    }

    @Test
    @DisplayName("Example for LIFT 2")
    public void testReal2(){
        String in = "WHEN inc THE Lift SHALL AT THE NEXT TIMEPOINT SATISFY counter = counter + 1";
        String expected = "(H ((Y (inc & (Z (! inc)))) -> ((counter = (counter + 1)) | (Z FALSE))))";
        Fret2ptLTL parser = new Fret2ptLTL();

        String processedExpected = norm(expected);
        String processedActual = norm(parser.compileToPtLtl(in));

        assertEquals(processedExpected, processedActual);
    }
}
