package design_pattern.structural.decorator.example1.type;

import design_pattern.structural.decorator.example1.Printer;

public class BracketsDecorator extends Decorator {
    public BracketsDecorator(Printer component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("(");
        super.print();
        System.out.print(")");
    }
}

/*public class BracketsDecorator implements Printer {
    Printer component;

    public BracketsDecorator(Printer component) {
        this.component = component;
    }

    @Override
    public void print() {
        System.out.print("\n(");
        component.print();
        System.out.print(")");
    }
}*/
