package design_pattern.creational.factory_method.example1.watch.type;

import design_pattern.creational.factory_method.example1.watch.Watch;

public class RomeWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println("VII-XX");
    }
}
