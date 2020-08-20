package java_regular.syntax.method.operation.overloading.example3;

public class ConcatenationClass {
    void operator(String str1, String str2) {
        String s = str1 + str2;
        System.out.println("Concatenated String: " + s);
    }

    void operator(int a, int b) {
        int c = a + b;
        System.out.println("Sum = " + c);
    }
}
