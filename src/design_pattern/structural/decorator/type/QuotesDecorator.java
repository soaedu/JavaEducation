package design_pattern.structural.decorator.type;

import design_pattern.structural.decorator.Printer;

public class QuotesDecorator extends Decorator {
    public QuotesDecorator(Printer component) {
        super(component);
    }

    @Override
    public void print() {
        printQuote();
        super.print();
        printQuote();
    }

    private void printQuote() {
        System.out.print("\"");
    }
}

/*public class QuotesDecorator implements Printer {
    Printer component;

    public QuotesDecorator(Printer component) {
        this.component = component;
    }

    @Override
    public void print() {
        printQuote();
        component.print();
        printQuote();
    }

    private void printQuote() {
        System.out.print("\"");
    }
}*/
