package design_pattern.creational.factory_method.example1;

import design_pattern.creational.factory_method.example1.watch.factory.WatchFactory;
import design_pattern.creational.factory_method.example1.watch.Watch;
import design_pattern.creational.factory_method.example1.watch.factory.DigitalWatchFactory;
import design_pattern.creational.factory_method.example1.watch.factory.RomeWatchFactory;

public class FactoryMethodMain {
    public static void main(String[] args) {
        // можем менять фабрику
        // WatchFactory watchFactory = new DigitalWatchFactory();
        // WatchFactory watchFactory = new RomeWatchFactory();

        WatchFactory watchFactory = getWatchFactoryByWatchType("digital");
        // WatchFactory watchFactory = getWatchFactoryByWatchType("rome");
        // WatchFactory watchFactory = getWatchFactoryByWatchType("123");

        // неизменные строки
        Watch watch = watchFactory.createWatch();
        watch.showTime();
    }

    public static WatchFactory getWatchFactoryByWatchType(String watchType) {
        return switch (watchType) {
            case "digital" -> new DigitalWatchFactory();
            case "rome" -> new RomeWatchFactory();
            default -> throw new RuntimeException("Not supported watch type: " + watchType);
        };
    }
}

