package design_pattern.structural.bridge.car.type;

import design_pattern.structural.bridge.brand.Brand;
import design_pattern.structural.bridge.car.Car;

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
