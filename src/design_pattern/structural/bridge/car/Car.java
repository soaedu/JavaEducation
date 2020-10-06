package design_pattern.structural.bridge.car;

import design_pattern.structural.bridge.brand.Brand;

public abstract class Car {
    public Brand brand;

    public Car(Brand brand) {
        this.brand = brand;
    }

//    public abstract void showDetails();

    public void showDetails() {
        showCarType();
        brand.setBrand();
    }

    public abstract void showCarType();
}
