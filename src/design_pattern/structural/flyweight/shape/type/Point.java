package design_pattern.structural.flyweight.shape.type;

import design_pattern.structural.flyweight.shape.Shape;

// Concrete Flyweight
public class Point implements Shape {
    @Override
    public void draw(int x, int y) {
        System.out.println("Draw point: (" +x+ ", " +y+ ")");
    }
}
