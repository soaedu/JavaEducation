package java_regular.syntax.method.operation.overloading.example2;

public class MultiplicationClass {
    // Method with 2 parameter
    static int multiply(int a, int b) {
        return a * b;
    }

    // Method with the same name but 3 parameter
    static int multiply(int a, int b, int c) {
        return a * b * c;
    }
}
