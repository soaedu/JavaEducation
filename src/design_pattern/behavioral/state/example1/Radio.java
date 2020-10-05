package design_pattern.behavioral.state.example1;

import design_pattern.behavioral.state.example1.station.Station;
import design_pattern.behavioral.state.example1.station.type.Radio7;
import design_pattern.behavioral.state.example1.station.type.RadioDFM;
import design_pattern.behavioral.state.example1.station.type.RadioVestiFM;

// Context
public class Radio {
    Station station;

    void setStation(Station station) {
        this.station = station;
    }

    void nextStation() {
        if (station instanceof Radio7) {
            setStation(new RadioDFM());
        } else if (station instanceof RadioDFM) {
            setStation(new RadioVestiFM());
        } else if (station instanceof RadioVestiFM) {
            setStation(new Radio7());
        }
    }

    void play() {
        station.play();
    }
}
