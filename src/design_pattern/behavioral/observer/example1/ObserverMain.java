package design_pattern.behavioral.observer.example1;

import design_pattern.behavioral.observer.example1.observable.MeteoStation;
import design_pattern.behavioral.observer.example1.observer.type.ChisinauObserver;
import design_pattern.behavioral.observer.example1.observer.type.MoscowObserver;

public class ObserverMain {
    public static void main(String[] args) {
        MeteoStation meteoStation = new MeteoStation();
        meteoStation.addObserver(new MoscowObserver());
        meteoStation.addObserver(new ChisinauObserver());

        meteoStation.setMeasurements(25, 760);
    }
}
