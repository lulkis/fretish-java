package parser;

import static org.junit.jupiter.api.Assertions.assertEquals;
import de.jfret.fretparser.Fret2LtlCLI;
import de.jfret.Fret2ptLTL;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Objects;
import java.util.stream.Stream;

public class FretishToPtLtlAutomaticTests {

    private static String norm(String s) {
        return s.replaceAll("\\s+", "");
    }

    private static Stream<String> formulas() {
        return Stream.of(
                "WHEN counter = 0 THE Lift SHALL NEVER SATISFY dec",
                "IN landing_mode WHEN altitude < 50 gear SHALL WITHIN 2 SECONDS SATISFY deployed",
                "WHEN inc THE Lift SHALL AT THE NEXT TIMEPOINT SATISFY counter = counter + 1",
                "flight_computer SHALL SATISFY active",
                "BEFORE cruise_mode, target_altitude SHALL SATISFY reached",
                "the System shall satisfy (x + y) * 2 >= threshold",
                "unless in State1 mode, the System shall satisfy output1",
                "while (x > 0), the System shall satisfy output1",
                "the System shall after 2 minutes satisfy output1",
                "the System shall, with probability = 0.5, within 10 seconds satisfy output1",
                "the System shall satisfy (a => b) & (c <=> d)",
                "the System shall satisfy x mod 4 = 0",
                "unless in cruise mode, upon altitude_drop, the System shall, with probability >= 0.9, satisfy alert_triggered"
        );
    }

    @ParameterizedTest(name = "[{index}] {0}")
    @MethodSource("formulas")
    public void testFretishToPtLtlAutomatic(String formel) {
        Fret2ptLTL parser = new Fret2ptLTL();
        String expected = norm(parser.compileToPtLtl(formel));
        String actual = norm(Objects.requireNonNull(Fret2LtlCLI.toLtlWithFretCli(formel)));

        System.out.println(actual);
        System.out.println(expected);

        assertEquals(expected, actual);
    }
}
