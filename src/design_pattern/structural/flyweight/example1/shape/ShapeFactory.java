package design_pattern.structural.flyweight.example1.shape;

import design_pattern.structural.flyweight.example1.shape.type.Circle;
import design_pattern.structural.flyweight.example1.shape.type.Point;
import design_pattern.structural.flyweight.example1.shape.type.Square;

import java.util.HashMap;
import java.util.Map;

// Flyweight Factory
public class ShapeFactory {
    private static final Map<ShapeType, Shape> shapes = new HashMap<>();

    public Shape getShape(ShapeType shapeType) {
        Shape shape = shapes.get(shapeType);
        if (shape == null) {
            switch (shapeType) {
                case POINT -> shape = new Point();
                case CIRCLE -> shape = new Circle();
                case SQUARE -> shape = new Square();
                default -> throw new RuntimeException("");
            }
            shapes.put(shapeType, shape);
        }
        return shape;
    }
}
