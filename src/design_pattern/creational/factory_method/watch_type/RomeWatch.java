package design_pattern.creational.factory_method.watch_type;

import design_pattern.creational.factory_method.Watch;

public class RomeWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println("VII-XX");
    }
}
