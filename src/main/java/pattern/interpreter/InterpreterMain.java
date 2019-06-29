package pattern.interpreter;

import pattern.interpreter.contract.Expression;
import pattern.interpreter.dsl.Addition;
import pattern.interpreter.dsl.Number;
import pattern.interpreter.dsl.Subtraction;

public class InterpreterMain {

    public static void main(String[] args){
        Expression addition = new Addition(new Number(9), new Number(10));
        Subtraction subtraction = new Subtraction(new Number(10), new Number(9));

        Addition finalResult = new Addition(addition, subtraction);
        System.out.println(finalResult.interpret());
    }
}
