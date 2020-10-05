package design_pattern.behavioral.state.example1;

import design_pattern.behavioral.state.example1.station.Station;
import design_pattern.behavioral.state.example1.station.type.RadioDFM;

public class StateMain {
    public static void main(String[] args) {
        Station dfm = new RadioDFM();

        Radio radio = new Radio();
        radio.setStation(dfm);

        for (int i=0; i<10; i++) {
            radio.play();
            radio.nextStation();
        }
    }
}
