package design_pattern.structural.flyweight.example1.shape.type;

import design_pattern.structural.flyweight.example1.shape.Shape;

// Concrete Flyweight
public class Circle implements Shape {
    int radius = 5;

    @Override
    public void draw(int x, int y) {
        System.out.println("Draw circle:" +
                "\n\tcenter: (" +x+ ", " +y+ ")" +
                "\n\tradius: " +radius);
    }
}
