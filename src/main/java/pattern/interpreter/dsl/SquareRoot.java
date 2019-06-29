package pattern.interpreter.dsl;

import pattern.interpreter.contract.Expression;

public class SquareRoot implements Expression{

    private Expression number;

    public SquareRoot(Expression number) {
        this.number = number;
    }

    @Override
    public double interpret() {
        return Math.sqrt(number.interpret());
    }
}
