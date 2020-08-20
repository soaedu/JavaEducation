package java_regular.interfaces.functional_interface.example1;

import java.util.function.DoubleToIntFunction;

public class DoubleToIntFunctionMain {
    public static void main(String args[]) {
        // Create a DoubleToIntFunction
        DoubleToIntFunction truncate = a -> (int)a;

        // Apply the function using applyAsInt()
        System.out.println(truncate.applyAsInt(10.6));
    }
}
