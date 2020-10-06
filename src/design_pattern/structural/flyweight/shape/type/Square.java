package design_pattern.structural.flyweight.shape.type;

import design_pattern.structural.flyweight.shape.Shape;

// Concrete Flyweight
public class Square implements Shape {
    int side = 10;

    @Override
    public void draw(int x, int y) {
        System.out.println("Draw Square:" +
                "\n\tcenter: (" +x+ ", " +y+ ")" +
                "\n\tside: " +side);
    }
}
