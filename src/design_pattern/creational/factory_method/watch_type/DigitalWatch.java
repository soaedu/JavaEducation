package design_pattern.creational.factory_method.watch_type;

import design_pattern.creational.factory_method.Watch;

import java.util.Date;

public class DigitalWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println(new Date());
    }
}
