package design_pattern.creational.abstract_factory.example2;

import design_pattern.creational.abstract_factory.example2.factory.AbstractFactory;
import design_pattern.creational.abstract_factory.example2.factory.FactoryProducer;
import design_pattern.creational.abstract_factory.example2.property.color.Color;
import design_pattern.creational.abstract_factory.example2.property.shape.Shape;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        // get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory(CONST.FactoryType.SHAPE.toString());
        if(null != shapeFactory) {
            // get an object of Shape Circle
            Shape shapeCircle = shapeFactory.getShape(CONST.ShapeType.CIRCLE.toString());
            // call draw method of Shape Circle
            shapeCircle.draw();

            // get an object of Shape Rectangle
            Shape shapeRectangle = shapeFactory.getShape(CONST.ShapeType.RECTANGLE.toString());
            // call draw method of Shape Rectangle
            shapeRectangle.draw();

            // get an object of Shape Square
            Shape shapeSquare = shapeFactory.getShape(CONST.ShapeType.SQUARE.toString());
            // call draw method of Shape Square
            shapeSquare.draw();
        }

        // get color factory
        AbstractFactory colorFactory = FactoryProducer.getFactory(CONST.FactoryType.COLOR.toString());
        if(null != colorFactory) {

            // get an object of Color Red
            Color colorRed = colorFactory.getColor(CONST.Color.RED.toString());
            // call fill method of Red
            colorRed.fill();

            // get an object of Color Green
            Color colorGreen = colorFactory.getColor(CONST.Color.GREEN.toString());
            // call fill method of Green
            colorGreen.fill();

            // get an object of Color Blue
            Color colorBlue = colorFactory.getColor(CONST.Color.BLUE.toString());
            // call fill method of Blue
            colorBlue.fill();
        }
    }
}
