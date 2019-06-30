package pattern.visitor.contract;

import pattern.visitor.dsl.Addition;
import pattern.visitor.dsl.Subtraction;
import pattern.visitor.dsl.Number;

public interface Visitor {
    void visit(Addition addition);
    void visit(Number number);
    void visit(Subtraction subtraction);
}
