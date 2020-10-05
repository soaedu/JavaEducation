package design_pattern.behavioral.observer.observers;

import design_pattern.behavioral.observer.Observer;

public class MoscowObserver implements Observer {
    @Override
    public void handleEvent(int temperature, int pressure) {
        System.out.println("MoscowObserver" +
                "\n\tThe weather changed: " +
                "\n\t\ttemperature: " +temperature+
                "\n\t\tpressure: " +pressure);
    }
}
