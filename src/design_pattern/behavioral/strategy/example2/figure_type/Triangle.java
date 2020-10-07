package design_pattern.behavioral.strategy.example2.figure_type;

import design_pattern.behavioral.strategy.example2.Graphics;

// Concrete strategy
public class Triangle implements Graphics {
    @Override
    public void draw() {
        System.out.println("Draw triangle...");
    }
}
