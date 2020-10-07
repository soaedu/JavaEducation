package design_pattern.structural.bridge.example1.brand.type;

import design_pattern.structural.bridge.example1.brand.Brand;

public class Opel implements Brand {
    @Override
    public void setBrand() {
        System.out.println("Opel");
    }
}
