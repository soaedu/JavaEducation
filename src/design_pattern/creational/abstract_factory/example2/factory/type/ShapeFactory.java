package design_pattern.creational.abstract_factory.example2.factory.type;

import design_pattern.creational.abstract_factory.example2.factory.AbstractFactory;
import design_pattern.creational.abstract_factory.example2.CONST;
import design_pattern.creational.abstract_factory.example2.property.shape.Circle;
import design_pattern.creational.abstract_factory.example2.property.shape.Rectangle;
import design_pattern.creational.abstract_factory.example2.property.shape.Shape;
import design_pattern.creational.abstract_factory.example2.property.shape.Square;
import design_pattern.creational.abstract_factory.example2.property.color.Color;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if(null == shapeType) {
            return null;
        }

        if(shapeType.equalsIgnoreCase(CONST.ShapeType.CIRCLE.toString())) {
            return new Circle();
        } else if(shapeType.equalsIgnoreCase(CONST.ShapeType.RECTANGLE.toString())) {
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase(CONST.ShapeType.SQUARE.toString())) {
            return new Square();
        }

        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
