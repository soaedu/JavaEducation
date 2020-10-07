package design_pattern.creational.bulder.example3.builder;

import design_pattern.creational.bulder.example3.builder.meal.type.drink.Coke;
import design_pattern.creational.bulder.example3.builder.meal.type.drink.Pepsi;
import design_pattern.creational.bulder.example3.builder.meal.type.food.ChickenBurger;
import design_pattern.creational.bulder.example3.builder.meal.type.food.VegBurger;
import design_pattern.creational.bulder.example3.builder.meal.Meal;

public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());

        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());

        return meal;
    }
}
