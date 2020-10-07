package design_pattern.creational.prototype.example2.shape.type;

import design_pattern.creational.prototype.example2.shape.Shape;

public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle :: draw() method");
    }
}
