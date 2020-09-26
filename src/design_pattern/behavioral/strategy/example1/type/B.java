package design_pattern.behavioral.strategy.example1.type;

public class B {
    A delegateTo = new A();

    public void print() {
        delegateTo.print();
    }
}
