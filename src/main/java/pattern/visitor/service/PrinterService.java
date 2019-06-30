package pattern.visitor.service;

import pattern.visitor.contract.Visitor;
import pattern.visitor.dsl.Addition;
import pattern.visitor.dsl.Subtraction;
import pattern.visitor.dsl.Number;

public class PrinterService implements Visitor {

    @Override
    public void acceptAddition(Addition addition) {
        System.out.print("(");
        addition.getLeft().accept(this);
        System.out.print("+");
        addition.getRight().accept(this);
        System.out.print(")");
    }

    @Override
    public void acceptNumber(Number number) {
        System.out.print(number.interpret());
    }

    @Override
    public void acceptSubtraction(Subtraction subtraction) {
        System.out.print("(");
        subtraction.getLeft().accept(this);
        System.out.print("-");
        subtraction.getRight().accept(this);
        System.out.print(")");
    }
}
