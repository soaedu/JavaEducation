package design_pattern.creational.abstract_factory.example2.factory.type;

import design_pattern.creational.abstract_factory.example2.factory.AbstractFactory;
import design_pattern.creational.abstract_factory.example2.CONST;
import design_pattern.creational.abstract_factory.example2.property.color.Blue;
import design_pattern.creational.abstract_factory.example2.property.color.Green;
import design_pattern.creational.abstract_factory.example2.property.color.Red;
import design_pattern.creational.abstract_factory.example2.property.color.Color;
import design_pattern.creational.abstract_factory.example2.property.shape.Shape;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {

        if(null == color) {
            return null;
        }

        if(color.equalsIgnoreCase(CONST.Color.RED.toString())) {
            return new Red();
        } else if(color.equalsIgnoreCase(CONST.Color.GREEN.toString())) {
            return new Green();
        } else if(color.equalsIgnoreCase(CONST.Color.BLUE.toString())) {
            return new Blue();
        }

        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
