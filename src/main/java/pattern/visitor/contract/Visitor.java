package pattern.visitor.contract;

import pattern.visitor.dsl.Addition;
import pattern.visitor.dsl.Subtraction;
import pattern.visitor.dsl.Number;

public interface Visitor {
    void acceptAddition(Addition addition);
    void acceptNumber(Number number);
    void acceptSubtraction(Subtraction subtraction);
}
