package design_pattern.creational.factory_method.example2.shape.type;

import design_pattern.creational.factory_method.example2.shape.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle :: draw() method");
    }
}
