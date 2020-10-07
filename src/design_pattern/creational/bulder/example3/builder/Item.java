package design_pattern.creational.bulder.example3.builder;

import design_pattern.creational.bulder.example3.builder.packing.Packing;

public interface Item {
    String name();
    float price();
    Packing packing();
}
