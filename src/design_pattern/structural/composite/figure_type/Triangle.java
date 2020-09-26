package design_pattern.structural.composite.figure_type;

import design_pattern.structural.composite.Shape;

public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw triangle...");
    }
}
