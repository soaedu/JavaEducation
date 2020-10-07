package design_pattern.structural.decorator.example2;

import design_pattern.structural.decorator.example2.decorator.Circle;
import design_pattern.structural.decorator.example2.decorator.Rectangle;
import design_pattern.structural.decorator.example2.decorator.RedShapeDecorator;
import design_pattern.structural.decorator.example2.decorator.Shape;

public class DecoratorMain {
    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println("Circle with normal border");
        circle.draw();

        Shape redCircle = new RedShapeDecorator(new Circle());
        System.out.println("\nCircle of red border");
        redCircle.draw();

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
