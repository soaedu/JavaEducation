package design_pattern.structural.flyweight;

import design_pattern.structural.flyweight.shape.Shape;
import design_pattern.structural.flyweight.shape.ShapeFactory;
import design_pattern.structural.flyweight.shape.ShapeType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FlyweightMain {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(factory.getShape(ShapeType.POINT));
        shapeList.add(factory.getShape(ShapeType.SQUARE));
        shapeList.add(factory.getShape(ShapeType.POINT));
        shapeList.add(factory.getShape(ShapeType.CIRCLE));
        shapeList.add(factory.getShape(ShapeType.SQUARE));
        shapeList.add(factory.getShape(ShapeType.SQUARE));
        shapeList.add(factory.getShape(ShapeType.POINT));
        shapeList.add(factory.getShape(ShapeType.POINT));
        shapeList.add(factory.getShape(ShapeType.CIRCLE));
        shapeList.add(factory.getShape(ShapeType.CIRCLE));

        Random random = new Random();
        for (Shape shape: shapeList) {
            int x = random.nextInt(100);
            int y = random.nextInt(100);
            shape.draw(x, y);
            System.out.println();
        }
    }
}
