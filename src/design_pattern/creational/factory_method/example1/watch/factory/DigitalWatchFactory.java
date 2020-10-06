package design_pattern.creational.factory_method.example1.watch.factory;

import design_pattern.creational.factory_method.example1.watch.Watch;
import design_pattern.creational.factory_method.example1.watch.type.DigitalWatch;

public class DigitalWatchFactory implements WatchFactory {
    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}
