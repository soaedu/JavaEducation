package design_pattern.structural.bridge.example1.car.type;

import design_pattern.structural.bridge.example1.brand.Brand;
import design_pattern.structural.bridge.example1.car.Car;

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
