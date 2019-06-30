package pattern.visitor.dsl;

import pattern.visitor.contract.Expression;
import pattern.visitor.contract.Visitor;

public class Number implements Expression {

    private int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public double interpret() {
        return number;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
