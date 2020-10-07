package design_pattern.creational.abstract_factory.example1.device.keyboard;

public class RuKeyboard implements Keyboard {
    @Override
    public void print() {
        System.out.println("Печатаем строку");
    }

    @Override
    public void println() {
        System.out.println("Печатаем строку с переводом строки");
    }
}
