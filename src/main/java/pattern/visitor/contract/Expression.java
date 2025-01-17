package pattern.visitor.contract;

public interface Expression {

    double interpret();
    void accept(Visitor visitor);
}
