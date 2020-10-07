package design_pattern.creational.prototype.example2.shape.type;

import design_pattern.creational.prototype.example2.shape.Shape;

public class Square extends Shape {
    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square :: draw() method");
    }
}
