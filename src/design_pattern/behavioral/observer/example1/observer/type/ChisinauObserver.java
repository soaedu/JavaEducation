package design_pattern.behavioral.observer.example1.observer.type;

import design_pattern.behavioral.observer.example1.observer.Observer;

public class ChisinauObserver implements Observer {
    @Override
    public void handleEvent(int temperature, int pressure) {
        System.out.println("ChisinauObserver" +
                "\n\tThe weather changed: " +
                "\n\t\ttemperature: " +temperature+
                "\n\t\tpressure: " +pressure);
    }
}
