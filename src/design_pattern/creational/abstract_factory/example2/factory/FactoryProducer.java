package design_pattern.creational.abstract_factory.example2.factory;

import design_pattern.creational.abstract_factory.example2.CONST;
import design_pattern.creational.abstract_factory.example2.factory.type.ColorFactory;
import design_pattern.creational.abstract_factory.example2.factory.type.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if(choice.equalsIgnoreCase(CONST.FactoryType.SHAPE.toString())) {
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase(CONST.FactoryType.COLOR.toString())) {
            return new ColorFactory();
        }

        return null;
    }
}
