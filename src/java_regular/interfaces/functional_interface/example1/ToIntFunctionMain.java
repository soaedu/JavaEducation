package java_regular.interfaces.functional_interface.example1;

import java.util.function.ToIntFunction;

/**
 * Function which takes in an argument of type "T" and produces an "int-valued" result.
 *
 * This functional interface takes in only one generic, namely:
 *     "T": denotes the type of the input argument to the operation
 *
 * The "lambda expression" assigned to an object of "ToIntFunction" type is used to define its "applyAsInt()" which
 * eventually applies the given operation on its only argument.
 *
 * It is similar to using an object of type "Function<T, Integer>".
 */
public class ToIntFunctionMain {
    public static void main(String[] args) {
        // applyAsInt() - accepts an argument of type "T" and gives an "int-valued" result.
        ToIntFunction<Double> ob = a -> (int)(a * 10);
        System.out.println(ob.applyAsInt(3.2));
    }
}
