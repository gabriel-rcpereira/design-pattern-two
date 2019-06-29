package pattern.flyweight.service;

import pattern.flyweight.contract.Accord;

import java.util.List;
import java.util.stream.Collectors;

public class PianoService {

    public void play(List<Accord> accords){
        String accordFormatted = accords
                .stream()
                .map(Accord::getAccord)
                .collect(Collectors.joining(","));

        System.out.println(accordFormatted);
    }
}
