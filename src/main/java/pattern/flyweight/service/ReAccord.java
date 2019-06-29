package pattern.flyweight.service;

import pattern.flyweight.contract.Accord;

public class ReAccord implements Accord {

    @Override
    public String getAccord() {
        return "RE";
    }
}
