package design_pattern.creational.factory_method.example1.watch.type;

import design_pattern.creational.factory_method.example1.watch.Watch;

import java.util.Date;

public class DigitalWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println(new Date());
    }
}
