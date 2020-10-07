package design_pattern.creational.factory_method.example1.watch.factory;

import design_pattern.creational.factory_method.example1.watch.Watch;
import design_pattern.creational.factory_method.example1.watch.type.RomeWatch;

public class RomeWatchFactory implements WatchFactory {
    @Override
    public Watch createWatch() {
        return new RomeWatch();
    }
}
