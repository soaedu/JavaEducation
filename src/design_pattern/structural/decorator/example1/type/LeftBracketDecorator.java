package design_pattern.structural.decorator.example1.type;

import design_pattern.structural.decorator.example1.Printer;

public class LeftBracketDecorator extends Decorator {
    public LeftBracketDecorator(Printer component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("(");
        super.print();
    }
}

/*public class LeftBracketDecorator implements Printer {
    Printer component;

    public LeftBracketDecorator(Printer component) {
        this.component = component;
    }

    @Override
    public void print() {
        System.out.print("(");
        component.print();
    }
}*/
