package design_pattern.behavioral.template;

// Concrete class
public class B extends C {
    /*void method() {
        System.out.println("Class B");
        System.out.print("1");
        System.out.print("4");
        System.out.print("3");
    }*/

    @Override
    void differ1() {
        System.out.print("4");
    }

    @Override
    void differ2() { }
}
