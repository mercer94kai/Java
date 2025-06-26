package Training102023;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class amzProb4 {
    public static void main(String[] args) {

        String input = "(5 + 3) * 2 / (7 - 1)";
        System.out.println("Is valid? " + isValidExpression(input));
    }

    private static boolean isValidExpression(String input)  {
        ScriptEngine engine=new ScriptEngineManager().getEngineByName("JavaScript");

        try {
            engine.eval(input);
            return true;
        }catch (ScriptException e){
            return false;
        }
    }
}
