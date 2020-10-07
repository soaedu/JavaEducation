package design_pattern.structural.decorator.example1.type;

import design_pattern.structural.decorator.example1.Printer;

public abstract class Decorator implements Printer {
    Printer component;
    public Decorator(Printer component) {
        this.component = component;
    }

    public void print() {
        component.print();
    }
}
