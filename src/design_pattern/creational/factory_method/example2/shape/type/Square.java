package design_pattern.creational.factory_method.example2.shape.type;

import design_pattern.creational.factory_method.example2.shape.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square :: draw method()");
    }
}
