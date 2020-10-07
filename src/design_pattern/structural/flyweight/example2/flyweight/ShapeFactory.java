package design_pattern.structural.flyweight.example2.flyweight;

import java.util.HashMap;

public class ShapeFactory {
    // Uncomment the compiler directive line and
    // javac *.java will compile properly.
    // @SuppressWarnings("unchecked")
    private static final HashMap circleMap = new HashMap();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if(null == circle) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
