package design_pattern.creational.abstract_factory.example2.factory;

import design_pattern.creational.abstract_factory.example2.property.color.Color;
import design_pattern.creational.abstract_factory.example2.property.shape.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
