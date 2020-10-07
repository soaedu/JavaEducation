package design_pattern.behavioral.template.example1;

// Abstract class
public abstract class C {
    void templateMethod() {
        System.out.print("1");
        differ1();
        System.out.print("3");
        differ2();
    }
    abstract void differ1();
    abstract void differ2();
}
