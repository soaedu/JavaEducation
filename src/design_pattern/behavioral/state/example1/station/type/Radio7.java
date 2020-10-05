package design_pattern.behavioral.state.example1.station.type;

import design_pattern.behavioral.state.example1.station.Station;

// Concrete state
public class Radio7 implements Station {
    @Override
    public void play() {
        System.out.println("Radio7 is playing...");
    }
}
