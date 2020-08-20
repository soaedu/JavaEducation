package java_regular.syntax.method.operation.overloading.example3;

/**
 * Java program for Operator overloading
 */
public class OperatorOverloadMain {
    public static void main(String[] args) {
        ConcatenationClass concatenationClass = new ConcatenationClass();
        concatenationClass.operator(2, 3);
        concatenationClass.operator("joe", "now");
    }
}
