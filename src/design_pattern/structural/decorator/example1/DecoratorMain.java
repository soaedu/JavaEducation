package design_pattern.structural.decorator.example1;

import design_pattern.structural.decorator.example1.type.*;

import java.util.ArrayList;
import java.util.List;

public class DecoratorMain {
    public static void main(String[] args) {
        Printer regularPrinter = new PrinterImpl("Hi");

        List<Printer> printers = new ArrayList<>();
        printers.add(regularPrinter);
        printers.add(new QuotesDecorator(regularPrinter));
        printers.add(new BracketsDecorator(regularPrinter));
        printers.add(new LeftBracketDecorator(new RightBracketDecorator(regularPrinter)));
        printers.add(new LeftBracketDecorator(new RightBracketDecorator(new QuotesDecorator(regularPrinter))));
        printers.add(new QuotesDecorator(new LeftBracketDecorator(new RightBracketDecorator(regularPrinter))));

        for (Printer printer: printers) {
            System.out.println();
            printer.print();
        }
    }
}
