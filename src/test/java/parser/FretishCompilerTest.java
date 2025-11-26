package parser;

import de.jfret.parser.FretishCompiler;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class FretishCompilerTest {

    @Test
    public void goodTest1(){
        String statement = "In landing mode the system shall satisfy speed = 0. (-> eventually)";
        FretishCompiler compiler = new FretishCompiler();
        ArrayList<String> errors;

        errors = compiler.compileFretish(statement);

        assert errors.isEmpty();
    }

    @Test
    public void goodTest2(){
        String statement = "in roll_hold mode RollAutopilot shall always satisfy autopilot_engaged & no_other_lateral_mode";
        FretishCompiler compiler = new FretishCompiler();
        ArrayList<String> errors;

        errors = compiler.compileFretish(statement);
        assert errors.isEmpty();
    }

    @Test
    public void goodTest3(){
        String statement = "After boot mode the system shall immediately satisfy prompt_for_password";
        FretishCompiler compiler = new FretishCompiler();
        ArrayList<String> errors;

        errors = compiler.compileFretish(statement);

        assert errors.isEmpty();
    }

    @Test
    public void badTest(){
        String statement = "Das sollte nicht gehen, wäre komisch wenn schon";
        FretishCompiler compiler = new FretishCompiler();
        ArrayList<String> errors;

        errors = compiler.compileFretish(statement);

        assert !errors.isEmpty();
    }
}
