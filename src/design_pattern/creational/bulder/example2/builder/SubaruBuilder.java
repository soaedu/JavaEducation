package design_pattern.creational.bulder.example2.builder;

import design_pattern.creational.bulder.example1.Transmission;

public class SubaruBuilder extends CarBuilder {
    @Override
    public void setBrand() {
        car.setBrand("Subaru");
    }

    @Override
    public void setTransmission() {
        car.setTransmission(Transmission.MANUAL);
    }

    @Override
    public void setMaxSpeed() {
        car.setMaxSpeed(320);
    }
}
