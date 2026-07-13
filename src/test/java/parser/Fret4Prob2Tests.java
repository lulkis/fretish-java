package parser;

import static org.junit.jupiter.api.Assertions.assertEquals;
import de.jfret.prob2ui.Fret4Prob2;
import org.junit.jupiter.api.Test;

public class Fret4Prob2Tests {

    private static String norm(String s) {
        return s.replaceAll("\\s+", "");
    }

    @Test
    public void testFret4Prob2() {
        String expected = "(H ((Y (inc & ((! Y (! (! inc)))))) => ((counter = (counter + 1)) | ((!Y (! (false)))))))";
        String formula = "(H ((Y (inc & (Z (! inc)))) -> ((counter = (counter + 1)) | (Z FALSE))))";
        String result = Fret4Prob2.getProb2Formula(formula);

        System.out.println(result);

        assertEquals(norm(expected), norm(result));
    }
}
