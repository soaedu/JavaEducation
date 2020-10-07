package design_pattern.creational.bulder.example1;

public class CarBuilder {
    String brand = "Unspecified";
    Transmission transmission = Transmission.MANUAL;
    int maxSpeed = 120;

    CarBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    CarBuilder setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    CarBuilder setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }

    Car build() {
        Car car = new Car();
        car.setBrand(brand);
        car.setTransmission(transmission);
        car.setMaxSpeed(maxSpeed);
        return car;
    }
}
