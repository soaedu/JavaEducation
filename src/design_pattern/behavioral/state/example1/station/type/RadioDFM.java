package design_pattern.behavioral.state.example1.station.type;

import design_pattern.behavioral.state.example1.station.Station;

// Concrete state
public class RadioDFM implements Station {
    @Override
    public void play() {
        System.out.println("RadioDFM is playing...");
    }
}
