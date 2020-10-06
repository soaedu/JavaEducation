package design_pattern.structural.facade.example2.facade;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
