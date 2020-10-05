package design_pattern.behavioral.observer;

import design_pattern.behavioral.observer.observers.ChisinauObserver;
import design_pattern.behavioral.observer.observers.MoscowObserver;

public class ObserverMain {
    public static void main(String[] args) {
        MeteoStation meteoStation = new MeteoStation();
        meteoStation.addObserver(new MoscowObserver());
        meteoStation.addObserver(new ChisinauObserver());

        meteoStation.setMeasurements(25, 760);
    }
}
