package pattern.interpreter.dsl;

import pattern.interpreter.contract.Expression;

public class Subtraction implements Expression {

    private Expression right;
    private Expression left;

    public Subtraction(Expression left, Expression right) {
        this.right = right;
        this.left = left;
    }

    @Override
    public double interpret() {
        return right.interpret() - left.interpret();
    }
}
