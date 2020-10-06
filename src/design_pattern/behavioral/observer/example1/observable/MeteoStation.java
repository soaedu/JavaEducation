package design_pattern.behavioral.observer.example1.observable;

import design_pattern.behavioral.observer.example1.observer.Observer;

import java.util.ArrayList;
import java.util.List;

// Concrete Observable
public class MeteoStation implements Observed {
    int temperature;
    int pressure;

    List<Observer> observers = new ArrayList<Observer>();

    public void setMeasurements(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.handleEvent(temperature, pressure);
        }
    }
}
