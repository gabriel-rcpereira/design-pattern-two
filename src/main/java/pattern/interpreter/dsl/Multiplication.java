package pattern.interpreter.dsl;

import pattern.interpreter.contract.Expression;

public class Multiplication implements Expression {

    private Expression right;
    private Expression left;

    public Multiplication(Expression right, Expression left) {
        this.right = right;
        this.left = left;
    }

    @Override
    public double interpret() {
        return right.interpret() * left.interpret();
    }
}
