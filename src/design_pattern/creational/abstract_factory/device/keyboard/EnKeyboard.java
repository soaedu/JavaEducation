package design_pattern.creational.abstract_factory.device.keyboard;

public class EnKeyboard implements Keyboard {
    @Override
    public void print() {
        System.out.println("Print a line");
    }

    @Override
    public void println() {
        System.out.println("Print a line with line break");
    }
}
