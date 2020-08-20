package java_regular.interfaces.functional_interface.example1;

import java.util.function.IntToDoubleFunction;

/**
 * Function which takes in an int-valued argument and gives a double-valued result.
 *
 * The "lambda expression" assigned to an object of "IntToDoubleFunction" type is used to define its
 *      * applyAsDouble()"  - eventually applies the given operation on its only argument.
 *
 * It is similar to using an object of type "Function<Integer, Double>".
 */
public class IntToDoubleFunctionMain {
    public static void main(String args[]) {
        double multiplier = 3.12;
        int x = 2;

        IntToDoubleFunction intToDoubleFunction = a -> (multiplier * a);
        System.out.println(intToDoubleFunction.applyAsDouble(x));
    }
}
