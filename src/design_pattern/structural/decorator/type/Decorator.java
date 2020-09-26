package design_pattern.structural.decorator.type;

import design_pattern.structural.decorator.Printer;

public abstract class Decorator implements Printer {
    Printer component;
    public Decorator(Printer component) {
        this.component = component;
    }

    public void print() {
        component.print();
    }
}
