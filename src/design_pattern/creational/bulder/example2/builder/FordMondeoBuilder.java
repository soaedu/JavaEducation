package design_pattern.creational.bulder.example2.builder;

import design_pattern.creational.bulder.example1.Transmission;

public class FordMondeoBuilder extends CarBuilder {
    @Override
    public void setBrand() {
        car.setBrand("Ford Mondeo");
    }

    @Override
    public void setTransmission() {
        car.setTransmission(Transmission.AUTO);
    }

    @Override
    public void setMaxSpeed() {
        car.setMaxSpeed(260);
    }
}
