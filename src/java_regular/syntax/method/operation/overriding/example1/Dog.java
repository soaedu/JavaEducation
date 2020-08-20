package java_regular.syntax.method.operation.overriding.example1;

public class Dog extends Animal {
    public void move() {
        super.move();   // invokes the super class method
        System.out.println("Dogs can walk and run");
    }
}
