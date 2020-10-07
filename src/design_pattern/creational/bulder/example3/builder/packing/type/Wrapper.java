package design_pattern.creational.bulder.example3.builder.packing.type;

import design_pattern.creational.bulder.example3.builder.packing.Packing;

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
