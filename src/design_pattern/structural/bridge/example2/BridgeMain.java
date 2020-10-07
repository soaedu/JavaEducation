package design_pattern.structural.bridge.example2;

import design_pattern.structural.bridge.example2.bridge.Circle;
import design_pattern.structural.bridge.example2.bridge.Shape;
import design_pattern.structural.bridge.example2.bridge.circle.GreenCircle;
import design_pattern.structural.bridge.example2.bridge.circle.RedCircle;

public class BridgeMain {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        redCircle.draw();

        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());
        greenCircle.draw();
    }
}
