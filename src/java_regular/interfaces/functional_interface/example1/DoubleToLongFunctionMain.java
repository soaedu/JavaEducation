package java_regular.interfaces.functional_interface.example1;

import java.util.function.DoubleToLongFunction;

public class DoubleToLongFunctionMain {
    public static void main(String args[]) {
        // Declare the DoubleToLongFunction
        DoubleToLongFunction truncate = a -> (long)a;

        // Apply the function to get the result as long
        // using applyAsLong()
        System.out.println(truncate.applyAsLong(10.6));
    }
}
