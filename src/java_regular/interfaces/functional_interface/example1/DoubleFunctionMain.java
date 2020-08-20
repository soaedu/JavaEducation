package java_regular.interfaces.functional_interface.example1;

import java.util.function.DoubleFunction;

public class DoubleFunctionMain {
    public static void main(String[] args) {
        DoubleFunction<String> doubleFunction = (number) -> number + " is a part of this String";

        System.out.println(doubleFunction.apply(12.56));
    }
}
