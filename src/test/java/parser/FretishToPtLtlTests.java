package parser;

import static org.junit.jupiter.api.Assertions.assertEquals;

import de.jfret.Fret2ptLTL;
import de.jfret.prob2ui.Fret4Prob2;
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

        System.out.println(Fret4Prob2.getProb2Formula(norm(expected)));

        Fret2ptLTL parser = new Fret2ptLTL();

        String processedExpected = norm(expected);
        String processedActual = norm(parser.compileToPtLtl(in));

        assertEquals(processedExpected, processedActual);
    }

    @Test
    @DisplayName("Example for LIFT 3")
    public void testReal3(){
        String in = "THE Lift SHALL ALWAYS SATISFY counter >= 0 & counter <= 100";
        String expected = "((H (counter >= 0)) & (H (counter <= 100)))";
        Fret2ptLTL parser = new Fret2ptLTL();

        String processedExpected = norm(expected);
        String processedActual = norm(parser.compileToPtLtl(in));

        assertEquals(processedExpected, processedActual);
    }

    @Test
    @DisplayName("Basic test")
    public void testReal5(){
        String in = "flight_computer SHALL SATISFY active";
        String expected = "(O active)";
        Fret2ptLTL parser = new Fret2ptLTL();

        String processedExpected = norm(expected);
        String processedActual = norm(parser.compileToPtLtl(in));

        assertEquals(processedExpected, processedActual);
    }

    @Test
    @DisplayName("Example for fret 1")
    public void testReal4(){
        String in = "IN landing_mode WHEN altitude < 50 gear SHALL WITHIN 2 SECONDS SATISFY deployed";
        String expected = "((H (((! landing_mode) & (Y landing_mode)) -> (Y (((O[2,2] (((altitude < 50) & ((Y (! (altitude < 50))) | (landing_mode & (Z (! landing_mode))))) & (! deployed))) -> (O[0,1] ((landing_mode & (Z (! landing_mode))) | deployed))) S (((O[2,2] (((altitude < 50) & ((Y (! (altitude < 50))) | (landing_mode & (Z (! landing_mode))))) & (! deployed))) -> (O[0,1] ((landing_mode & (Z (! landing_mode))) | deployed))) & (landing_mode & (Z (! landing_mode)))))))) & (((! ((! landing_mode) & (Y landing_mode))) S ((! ((! landing_mode) & (Y landing_mode))) & (landing_mode & (Z (! landing_mode))))) -> (((O[2,2] (((altitude < 50) & ((Y (! (altitude < 50))) | (landing_mode & (Z (! landing_mode))))) & (! deployed))) -> (O[0,1] ((landing_mode & (Z (! landing_mode))) | deployed))) S (((O[2,2] (((altitude < 50) & ((Y (! (altitude < 50))) | (landing_mode & (Z (! landing_mode))))) & (! deployed))) -> (O[0,1] ((landing_mode & (Z (! landing_mode))) | deployed))) & (landing_mode & (Z (! landing_mode)))))))";
        Fret2ptLTL parser = new Fret2ptLTL();

        String processedExpected = norm(expected);
        String processedActual = norm(parser.compileToPtLtl(in));

        assertEquals(processedExpected, processedActual);
    }

    @Test
    @DisplayName("Ex")
    public void testReal5_1(){
        String in = "BEFORE cruise_mode, target_altitude SHALL SATISFY reached";
        String expected = "((H ((((cruise_mode & (Z (! cruise_mode))) & (Z (H (! cruise_mode)))) & (Y TRUE)) -> (Y (O reached)))) & ((H (! ((cruise_mode & (Z (! cruise_mode))) & (Z (H (! cruise_mode)))))) -> (O reached)))";
        Fret2ptLTL parser = new Fret2ptLTL();

        String processedExpected = norm(expected);
        String processedActual = norm(parser.compileToPtLtl(in));

        assertEquals(processedExpected, processedActual);
    }

    @Test
    @DisplayName("Ex")
    public void testReal5_2(){
        String in = "the System shall satisfy (x + y) * 2 >= threshold";
        String expected = "(O (((x + y) * 2) >= threshold))";
        Fret2ptLTL parser = new Fret2ptLTL();

        String processedExpected = norm(expected);
        String processedActual = norm(parser.compileToPtLtl(in));

        assertEquals(processedExpected, processedActual);
    }
}
