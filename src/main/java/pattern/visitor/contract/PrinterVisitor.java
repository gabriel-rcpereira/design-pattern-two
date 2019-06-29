package pattern.visitor.contract;

import pattern.visitor.dsl.Addition;
import pattern.visitor.dsl.Subtraction;
import pattern.visitor.dsl.Number;

public interface PrinterVisitor {
    void printAddition(Addition addition);
    void printNumber(Number number);
    void printSubtraction(Subtraction subtraction);
}
