package pattern.flyweight.accord;

import pattern.flyweight.contract.Accord;

public class DoAccord implements Accord {
    @Override
    public String getAccord() {
        return "DO";
    }
}
