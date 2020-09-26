package design_pattern.creational.bulder.example2;

import design_pattern.creational.bulder.example1.Transmission;

public class Car {
    String brand;
    Transmission transmission;
    int maxSpeed;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", transmission=" + transmission +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
