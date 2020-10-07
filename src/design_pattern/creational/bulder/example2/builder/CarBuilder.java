package design_pattern.creational.bulder.example2.builder;

import design_pattern.creational.bulder.example2.Car;

public abstract class CarBuilder {
    Car car;

    void createCar() {
        car = new Car();
    }

    abstract void setBrand();
    abstract void setTransmission();
    abstract void setMaxSpeed();

    Car getCar() { return car;}
}
