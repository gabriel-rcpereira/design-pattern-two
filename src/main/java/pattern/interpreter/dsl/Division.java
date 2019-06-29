package pattern.interpreter.dsl;

import pattern.interpreter.contract.Expression;

public class Division implements Expression {

    private Expression right;
    private Expression left;

    public Division(Expression left, Expression right) {
        this.right = right;
        this.left = left;
    }

    @Override
    public double interpret() {
        return this.right.interpret() / this.left.interpret();
    }
}
