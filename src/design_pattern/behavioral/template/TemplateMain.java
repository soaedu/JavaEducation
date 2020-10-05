package design_pattern.behavioral.template;

public class TemplateMain {
    public static void main(String[] args) {
        A a = new A();
        a.templateMethod();

        System.out.println();

        B b = new B();
        b.templateMethod();
    }
}
