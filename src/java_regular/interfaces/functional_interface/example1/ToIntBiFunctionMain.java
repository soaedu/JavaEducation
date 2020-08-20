package java_regular.interfaces.functional_interface.example1;

import java.util.function.ToIntBiFunction;

/**
 * Function which takes in two arguments of type "T" and "U" and produces an int-valued result.
 *
 * This "functional interface" takes in two generics, namely:
 *     "T": denotes the type of the first input argument to the operation
 *     "U": denotes the type of the second input argument to the operation
 *
 * The "lambda expression" assigned to an object of "ToIntBiFunction" type is used to define its "applyAsInt()" which
 * eventually applies the given operation on its two arguments.
 *
 * It is similar to using an object of type "BiFunction<T, U, Integer>".
 */
public class ToIntBiFunctionMain {
    public static void main(String[] args) {
        // applyAsInt() - accepts two arguments of type "T" and "U" and produces an "int-valued" result.
        ToIntBiFunction<Integer, String> toIntBiFunction = (a, b) -> a + Integer.parseInt(b) * 3;
        System.out.println(toIntBiFunction.applyAsInt(3, "10"));
    }
}
