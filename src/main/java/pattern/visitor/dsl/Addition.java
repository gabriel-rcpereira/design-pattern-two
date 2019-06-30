package pattern.visitor.dsl;

import pattern.visitor.contract.Expression;
import pattern.visitor.contract.Visitor;

public class Addition implements Expression {

    private Expression right;
    private Expression left;

    public Addition(Expression left, Expression right) {
        this.right = right;
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    public Expression getLeft() {
        return left;
    }

    @Override
    public double interpret() {
        return left.interpret() + right.interpret();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
