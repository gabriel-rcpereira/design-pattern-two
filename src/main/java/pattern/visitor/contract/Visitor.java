package pattern.visitor.contract;

import pattern.visitor.dsl.Addition;
import pattern.visitor.dsl.Subtraction;
import pattern.visitor.dsl.Number;

public interface Visitor {
    void visitor(Addition addition);
    void visitor(Number number);
    void visitor(Subtraction subtraction);
}
