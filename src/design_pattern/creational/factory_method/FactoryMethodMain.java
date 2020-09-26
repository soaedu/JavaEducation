package design_pattern.creational.factory_method;

import design_pattern.creational.factory_method.watch_type.DigitalWatchMaker;
import design_pattern.creational.factory_method.watch_type.RomeWatchMaker;

public class FactoryMethodMain {
    public static void main(String[] args) {
        // можем менять фабрику
        // WatchFactory watchFactory = new DigitalWatchFactory();
        // WatchFactory watchFactory = new RomeWatchFactory();

        WatchMaker watchMaker = getWatchFactoryByWatchType("digital");
        // WatchFactory watchFactory = getWatchFactoryByWatchType("rome");
        // WatchFactory watchFactory = getWatchFactoryByWatchType("123");

        // неизменные строки
        Watch watch = watchMaker.createWatch();
        watch.showTime();
    }

    public static WatchMaker getWatchFactoryByWatchType(String watchType) {
        return switch (watchType) {
            case "digital" -> new DigitalWatchMaker();
            case "rome" -> new RomeWatchMaker();
            default -> throw new RuntimeException("Not supported watch type: " + watchType);
        };
    }
}

