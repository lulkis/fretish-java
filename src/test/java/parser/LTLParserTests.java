package parser;

import de.jfret.parser.Fret2ptLTL;
import de.jfret.parser.LTLASTAnalyzer;
import de.jfret.parser.LTLParser;
import de.jfret.parser.LTLparser;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LTLParserTests {

    @Test
    @DisplayName("ltl test")
    public void testReal1(){
        String s = "counter=counter+1";
        LTLparser parser = new LTLparser();
        Object o = parser.LTL2AST(s);

        System.out.println(o);

        assertEquals(true, false);
    }
}
