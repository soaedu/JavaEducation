package design_pattern.creational.prototype.example2.shape.type;

import design_pattern.creational.prototype.example2.shape.Shape;

public class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle :: draw() method");
    }
}
