package parser;

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

        assertEquals("[Equal, counter, [Plus, counter, 1]]", o.toString());
    }

    @Test
    @DisplayName("ltl test")
    public void testReal2(){
        String s = "counter=counter+1";
        LTLparser parser = new LTLparser();

        Object o = parser.LTL2AST(s);
        String result = parser.ASTtoLTL(o);

        assertEquals("(counter = (counter + 1))", result);
    }
}
