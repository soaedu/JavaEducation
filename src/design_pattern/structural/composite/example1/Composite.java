package design_pattern.structural.composite.example1;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Shape {
    private List<Shape> components = new ArrayList<>();

    public void addComponent(Shape component) {
        components.add(component);
    }

    public void removeComponent(Shape component) {
        components.remove(component);
    }

    @Override
    public void draw() {
        for (Shape component: components) {
            component.draw();
        }
    }
}
