package design_pattern.creational.factory_method.watch_type;

import design_pattern.creational.factory_method.Watch;
import design_pattern.creational.factory_method.WatchMaker;

public class RomeWatchMaker implements WatchMaker {
    @Override
    public Watch createWatch() {
        return new RomeWatch();
    }
}
