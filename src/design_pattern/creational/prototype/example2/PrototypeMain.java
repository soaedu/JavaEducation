package design_pattern.creational.prototype.example2;

import design_pattern.creational.prototype.example2.shape.Shape;
import design_pattern.creational.prototype.example2.shape.ShapeFactory;

public class PrototypeMain {
    public static void main(String[] args) {
        ShapeFactory.loadCache();

        Shape shapeClone1 = (Shape) ShapeFactory.getShape("1");
        System.out.println("Shape : " +shapeClone1.getType());

        Shape shapeClone2 = (Shape) ShapeFactory.getShape("2");
        System.out.println("Shape : " +shapeClone2.getType());

        Shape shapeClone3 = (Shape) ShapeFactory.getShape("3");
        System.out.println("Shape : " +shapeClone3.getType());
    }
}
