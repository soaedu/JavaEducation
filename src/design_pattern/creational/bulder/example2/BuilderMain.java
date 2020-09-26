package design_pattern.creational.bulder.example2;

import design_pattern.creational.bulder.example2.builder.Director;
import design_pattern.creational.bulder.example2.builder.FordMondeoBuilder;

public class BuilderMain {
    public static void main(String[] args) {
        Director director = new Director();

        // изменяемая часть
        director.setBuilder(new FordMondeoBuilder());
        // director.setBuilder(new SubaruBuilder());

        // неизменяемая часть
        Car car = director.buildCar();
        System.out.println(car);
    }
}
