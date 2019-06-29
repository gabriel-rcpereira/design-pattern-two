package pattern.flyweight.accord;

import pattern.flyweight.contract.Accord;

public class MiAccord implements Accord {
    @Override
    public String getAccord() {
        return "MI";
    }
}
