package java_regular.interfaces.functional_interface.example1;

import java.util.function.LongToDoubleFunction;

/**
 * Function which takes in a "long-valued" argument and gives a "double-valued" result.
 *
 * The "lambda expression" assigned to an object of "LongToDoubleFunction" type is used to define its
 * "applyAsDouble()" which eventually applies the given operation on its only argument.
 *
 * It is similar to using an object of type "Function<Long, Double>".
 */
public class LongToDoubleFunctionMain {
    public static void main(String[] args) {
        // applyAsDouble() - accepts a long-valued argument and gives a double-valued result.
        LongToDoubleFunction ob = a -> a / 2;
        System.out.println(ob.applyAsDouble(3));
    }
}
