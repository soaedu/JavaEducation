package design_pattern.structural.facade.example2;

import design_pattern.structural.facade.example2.facade.ShapeMaker;

public class FacadeMain {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawRectangle();
        shapeMaker.drawCircle();
        shapeMaker.drawSquare();
    }
}
