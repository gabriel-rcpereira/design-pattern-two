package pattern.memento.model;

import java.util.ArrayList;
import java.util.List;

public class Historical {

    private List<State> states;

    public Historical() {
        this.states = new ArrayList<>();
    }

    public void add(State state){
        this.states.add(state);
    }

    public State getState(int index){
        return this.states.get(index);
    }
}
