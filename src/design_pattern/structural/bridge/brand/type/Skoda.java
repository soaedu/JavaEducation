package design_pattern.structural.bridge.brand.type;

import design_pattern.structural.bridge.brand.Brand;

public class Skoda implements Brand {
    @Override
    public void setBrand() {
        System.out.println("Skoda");
    }
}
