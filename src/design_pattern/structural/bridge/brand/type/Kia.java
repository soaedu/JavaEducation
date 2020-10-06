package design_pattern.structural.bridge.brand.type;

import design_pattern.structural.bridge.brand.Brand;

public class Kia implements Brand {
    @Override
    public void setBrand() {
        System.out.println("KIA");
    }
}
