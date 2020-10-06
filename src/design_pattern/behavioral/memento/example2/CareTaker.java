package design_pattern.behavioral.memento.example2;

import java.util.ArrayList;
import java.util.List;

// Caretaker
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
