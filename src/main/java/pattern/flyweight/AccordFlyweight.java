package pattern.flyweight;

import pattern.flyweight.contract.Accord;

import java.util.HashMap;
import java.util.Map;

public class AccordFlyweight {

    private static Map<Class<? extends Accord>, Accord> accords;

    static {
        accords = new HashMap<>();
    }

    public static Accord getAccord(Class<? extends Accord> clazz) {
        Accord accordSelected = accords.get(clazz);
        if (accordSelected == null) {
            try {
                accordSelected = clazz.newInstance();
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
            accords.put(clazz, accordSelected);
        }
        return accordSelected;
    }
}
