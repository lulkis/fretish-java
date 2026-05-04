import static org.junit.jupiter.api.Assertions.assertEquals;

import de.jfret.parser.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.junit.jupiter.api.Test;

public class FretishToPtLtlTests {

    private String compileToPtLtl(String input) {
        CharStream chars = CharStreams.fromString(input);
        RequirementLexer lexer = new RequirementLexer(chars);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RequirementParser parser = new RequirementParser(tokens);

        ParseTree tree = parser.reqt_body();

        FretishListenerToModel listener = new FretishListenerToModel();
        ParseTreeWalker.DEFAULT.walk(listener, tree);
        ReqModel model = listener.getModel();

        PtLtlGenerator gen = new PtLtlGenerator();
        PtLtl ast = gen.toFormula(model);

        return new PtLtlPrinter().print(ast);
    }

    private static String norm(String s) {
        return s.replaceAll("\\s+", "");
    }

    @Test
    public void testRegularCondition() {
        String in = "when a the sys shall satisfy b";
        String expected = "H(true -> ((a) -> (b)))";
        assertEquals(norm(expected), norm(compileToPtLtl(in)));
    }

    @Test
    public void testInMode() {
        String in = "in cruise mode when a the sys shall satisfy b";
        String expected = "H((cruise) -> ((a) -> (b)))";
        assertEquals(norm(expected), norm(compileToPtLtl(in)));
    }

    @Test
    public void testExceptInMode() {
        String in = "except in cruise mode when a the sys shall satisfy b";
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
    public void testAfterExclusive() {
        String in = "strictly after (p) when a the sys shall satisfy b";
        String expected = "H(((O((p))) & !((p))) -> ((a) -> (b)))";
        assertEquals(norm(expected), norm(compileToPtLtl(in)));
    }

    @Test
    public void testBeforeInclusive() {
        String in = "before (p) when a the sys shall satisfy b";
        String expected = "H((!(O((p)))) -> ((a) -> (b)))";
        assertEquals(norm(expected), norm(compileToPtLtl(in)));
    }
}
