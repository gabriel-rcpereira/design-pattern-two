package pattern.flyweight;

import pattern.flyweight.contract.Accord;
import pattern.flyweight.service.DoAccord;
import pattern.flyweight.service.MiAccord;
import pattern.flyweight.service.PianoService;
import pattern.flyweight.service.ReAccord;

import java.util.Arrays;
import java.util.List;

public class FlyweightMain {

    public static void main(String[] args){
        List<Accord> accords = Arrays.asList(AccordFlyweight.getAccord(DoAccord.class),
                AccordFlyweight.getAccord(ReAccord.class),
                AccordFlyweight.getAccord(MiAccord.class),
                AccordFlyweight.getAccord(MiAccord.class),
                AccordFlyweight.getAccord(DoAccord.class),
                AccordFlyweight.getAccord(MiAccord.class),
                AccordFlyweight.getAccord(ReAccord.class));

        PianoService pianoService = new PianoService();
        pianoService.play(accords);
    }
}
