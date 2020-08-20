package java_regular.interfaces.functional_interface.example1;

import java.util.function.IntToLongFunction;

/**
 * Function which takes in an int-valued argument and gives a long-valued result.
 *
 * The "lambda expression" assigned to an object of "IntToLongFunction" type is used to define its "applyAsLong()"
 * which eventually applies the given operation on its only argument.
 *
 * It is similar to using an object of type "Function<Integer, Long>".
 */
public class IntToLongFunctionMain {
    public static void main(String args[]) {
        final long MULTIPLIER = 1000000;
        int x = 2;

        IntToLongFunction func = a -> MULTIPLIER * a;
        System.out.println(func.applyAsLong(x));
    }
}
