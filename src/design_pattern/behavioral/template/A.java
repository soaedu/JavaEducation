package design_pattern.behavioral.template;

// Concrete class
public class A extends C {
/*    void method() {
        System.out.println("Class A");
        System.out.print("1");
        System.out.print("2");
        System.out.print("3");
    }*/

    @Override
    void differ1() {
        System.out.print("2");
    }

    @Override
    void differ2() {
        System.out.print("5");
    }
}
