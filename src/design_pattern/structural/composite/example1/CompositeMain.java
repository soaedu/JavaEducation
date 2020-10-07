package design_pattern.structural.composite.example1;

import design_pattern.structural.composite.example1.figure_type.Circle;
import design_pattern.structural.composite.example1.figure_type.Square;
import design_pattern.structural.composite.example1.figure_type.Triangle;

public class CompositeMain {
    public static void main(String[] args) {
        Composite composite1 = new Composite();
        composite1.addComponent(new Square());
        composite1.addComponent(new Square());
        composite1.addComponent(new Triangle());

        Composite composite2 = new Composite();
        composite2.addComponent(new Square());
        composite2.addComponent(new Circle());
        composite2.addComponent(new Circle());
        composite2.addComponent(new Circle());

        Composite composite3 = new Composite();
        composite3.addComponent(composite1);
        composite3.addComponent(composite2);

        composite3.draw();
    }
}
