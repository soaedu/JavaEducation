package design_pattern.creational.bulder.example3.builder.meal.type.drink;

import design_pattern.creational.bulder.example3.builder.Item;
import design_pattern.creational.bulder.example3.builder.packing.Packing;
import design_pattern.creational.bulder.example3.builder.packing.type.Bottle;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
