package design_pattern.structural.bridge.example1.car.type;

import design_pattern.structural.bridge.example1.brand.Brand;
import design_pattern.structural.bridge.example1.car.Car;

public class Hatchback extends Car {
    public Hatchback(Brand brand) {
        super(brand);
    }

//    @Override
//    public void showDetails() {
//        System.out.println("Hatchback");
//        brand.setBrand();
//    }

    @Override
    public void showCarType() {
        System.out.println("Hatchback");
    }
}
