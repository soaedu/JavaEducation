package design_pattern.creational.bulder.example2.builder;

import design_pattern.creational.bulder.example2.Car;

public class Director {
    CarBuilder builder;

    public void setBuilder(CarBuilder builder) {
        this.builder = builder;
    }

    public Car buildCar() {
        builder.createCar();
        builder.setBrand();
        builder.setTransmission();
        builder.setMaxSpeed();
        return builder.getCar();
    }
}
