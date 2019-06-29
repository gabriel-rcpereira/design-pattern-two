package pattern.interpreter.dsl;

import pattern.interpreter.contract.Expression;

public class Number implements Expression {

    private int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public double interpret() {
        return number;
    }
}
