package java_regular.interfaces.functional_interface.example1;

import java.util.function.ToLongBiFunction;

/**
 * Function which takes in two arguments of type "T" and "U" and produces an "long-valued" result.
 *
 * This "functional interface" takes in two generics, namely:
 *     "T": denotes the type of the first input argument to the operation
 *     "U": denotes the type of the second input argument to the operation
 *
 * The "lambda expression" assigned to an object of "ToLongBiFunction" type is used to define its "applyAsLong()"
 * which eventually applies the given operation on its two arguments.
 *
 * It is similar to using an object of type "BiFunction<T, U, Long>".
 */
public class ToLongBiFunctionMain {
    public static void main(String[] args) {
        // applyAsLong() - accepts two arguments of type "T" and "U" and produces a "long-valued" result.
        ToLongBiFunction<Integer, String> toLongBiFunction = (a, b) -> a + Integer.parseInt(b) * 1000000;
        System.out.println(toLongBiFunction.applyAsLong(3, "10"));
    }
}
