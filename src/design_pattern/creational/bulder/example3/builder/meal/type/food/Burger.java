package design_pattern.creational.bulder.example3.builder.meal.type.food;

import design_pattern.creational.bulder.example3.builder.Item;
import design_pattern.creational.bulder.example3.builder.packing.Packing;
import design_pattern.creational.bulder.example3.builder.packing.type.Wrapper;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
