package java_regular.interfaces.functional_interface.example1;

import java.util.function.ToLongFunction;

/**
 * Function which takes in an argument of type "T" and produces a "long-valued" result.
 *
 * This "functional interface" takes in only one generic, namely:
 *     "T": denotes the type of the input argument to the operation
 *
 * The "lambda expression" assigned to an object of "ToLongFunction" type is used to define its "applyAsLong()"
 * which eventually applies the given operation on its only argument.
 *
 * It is similar to using an object of type "Function<T, Long>".
 */
public class ToLongFunctionMain {
    public static void main(String[] args) {
        // applyAsLong() - accepts an argument of type "T" and gives a "long-valued" result.
        ToLongFunction<Integer> ob = a -> a * 10000;
        System.out.println(ob.applyAsLong(3));
    }
}
