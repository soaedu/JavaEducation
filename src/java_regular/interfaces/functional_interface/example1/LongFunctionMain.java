package java_regular.interfaces.functional_interface.example1;

import java.util.function.LongFunction;

/**
 * Function which takes in a long-valued argument and produces a result of type "R".
 *
 * This "functional interface" takes in only one generic, namely:
 *     "R"  - denotes the type of the output of this function
 */
public class LongFunctionMain {
    public static void main(String args[]) {
        // apply()  - accepts a long-valued argument and gives a result of type R.
        LongFunction<Double> ob = a -> a / 2.0;
        System.out.println(ob.apply(3));
    }
}
