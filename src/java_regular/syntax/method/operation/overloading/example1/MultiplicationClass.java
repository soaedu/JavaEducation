package java_regular.syntax.method.operation.overloading.example1;

public class MultiplicationClass {
    // Method with 2 parameter
    static int multiply(int a, int b) {
        return a * b;
    }

    // Method with the same name but 2 double parameter
    static double multiply(double a, double b) {
        return a * b;
    }
}
