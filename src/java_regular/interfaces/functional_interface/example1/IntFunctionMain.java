package java_regular.interfaces.functional_interface.example1;

import java.util.function.IntFunction;

/**
 * It represents a function which takes in an int-valued argument and produces a result of type "R".
 *
 * This functional interface takes in only one generic, namely:
 *      R: denotes the type of the output of this function
 *
 * The "lambda expression" assigned to an object of "IntFunction" type is used to define its "apply()" which
 * eventually applies the given operation on its only argument.
 *
 * It is similar to using an object of type "Function<Integer, R>".
 */
public class IntFunctionMain {
    public static void main(String args[]) {
        int x = 3;

        // apply() - This method accepts an int-valued argument and gives a result of type R.
        IntFunction<Double> ob = a -> a / 2.0;
        System.out.println(ob.apply(x));
    }
}
