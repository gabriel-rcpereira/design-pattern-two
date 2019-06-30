package pattern.visitor;

import pattern.visitor.dsl.Addition;
import pattern.visitor.dsl.Number;
import pattern.visitor.dsl.Subtraction;
import pattern.visitor.service.PrinterService;

public class VisitorMain {

    public static void main(String[] args) {
        Addition addition = new Addition(new Number(10), new Subtraction(new Number(5), new Number(1)));
        addition.accept(new PrinterService());
        System.out.println(addition.interpret());
    }
}
