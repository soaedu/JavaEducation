package design_pattern.behavioral.strategy.example2;

// Strategy Client
public class Painter {
    Graphics figure;

    public void setGraphics(Graphics figure) {
        this.figure = figure;
    }

    public void draw() {
        if (figure != null) {
            figure.draw();
        }
    }
}
