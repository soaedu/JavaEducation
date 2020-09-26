package design_pattern.structural.decorator.type;

import design_pattern.structural.decorator.Printer;

public class RightBracketDecorator extends Decorator {
    public RightBracketDecorator(Printer component) {
        super(component);
    }

    @Override
    public void print() {
        super.print();
        System.out.print(")");
    }
}


/*public class RightBracketDecorator implements Printer {
    Printer component;

    public RightBracketDecorator(Printer component) {
        this.component = component;
    }

    @Override
    public void print() {
        component.print();
        System.out.print(")");
    }
}*/
