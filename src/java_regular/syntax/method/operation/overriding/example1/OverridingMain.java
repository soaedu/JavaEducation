package java_regular.syntax.method.operation.overriding.example1;

public class OverridingMain {
    public static void main(String args[]) {
        Animal b = new Dog();   // Animal reference but Dog object
        b.move();   // runs the method in Dog class
    }
}
