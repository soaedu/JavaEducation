package design_pattern.structural.bridge.car.type;

import design_pattern.structural.bridge.brand.Brand;
import design_pattern.structural.bridge.car.Car;

public class Sedan extends Car {
    public Sedan(Brand brand) {
        super(brand);
    }

//    @Override
//    public void showDetails() {
//        System.out.println("Sedan");
//        brand.setBrand();
//    }

    @Override
    public void showCarType() {
        System.out.println("Sedan");
    }
}
