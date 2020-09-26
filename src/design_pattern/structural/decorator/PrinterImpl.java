package design_pattern.structural.decorator;

public class PrinterImpl implements Printer {
    String value;

    public PrinterImpl(String value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.print(value);
    }
}
