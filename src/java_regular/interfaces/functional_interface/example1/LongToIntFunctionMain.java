package java_regular.interfaces.functional_interface.example1;

import java.util.function.LongToIntFunction;

/**
 * Function which takes in a "long-valued" argument and gives an "int-valued" result.
 *
 * The "lambda expression" assigned to an object of "DoubleToLongFunction" type is used to define its "applyAsInt()"
 * which eventually applies the given operation on its only argument.
 *
 * It is similar to using an object of type "Function<Long, Integer>".
 */
public class LongToIntFunctionMain {
    public static void main(String[] args) {
        // applyAsInt() - accepts a "long-valued" argument and gives an "int-valued" result.
        LongToIntFunction ob = a -> (int)a * 100000;
        System.out.println(ob.applyAsInt(2));
    }
}
