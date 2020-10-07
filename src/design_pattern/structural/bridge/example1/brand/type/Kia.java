package design_pattern.structural.bridge.example1.brand.type;

import design_pattern.structural.bridge.example1.brand.Brand;

public class Kia implements Brand {
    @Override
    public void setBrand() {
        System.out.println("KIA");
    }
}
