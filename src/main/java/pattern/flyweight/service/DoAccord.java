package pattern.flyweight.service;

import pattern.flyweight.contract.Accord;

public class DoAccord implements Accord {
    @Override
    public String getAccord() {
        return "DO";
    }
}
