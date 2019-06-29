package pattern.interpreter.dsl;

import pattern.interpreter.contract.Expression;

public class Addition implements Expression {

    private Expression right;
    private Expression left;

    public Addition(Expression left, Expression right) {
        this.right = right;
        this.left = left;
    }

    @Override
    public double interpret() {
        return left.interpret() + right.interpret();
    }
}
