package design_pattern.behavioral.strategy.example2;

import design_pattern.behavioral.strategy.example2.figure_type.Circle;
import design_pattern.behavioral.strategy.example2.figure_type.Square;
import design_pattern.behavioral.strategy.example2.figure_type.Triangle;

public class PainterMain {
    public static void main(String[] args) {
        Painter painter = new Painter();

        painter.setGraphics(new Triangle());
        painter.draw();

        painter.setGraphics(new Square());
        painter.draw();

        painter.setGraphics(new Circle());
        painter.draw();
    }
}

