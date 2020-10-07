package design_pattern.creational.abstract_factory.example2.property.shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle :: draw() method.");
    }
}
