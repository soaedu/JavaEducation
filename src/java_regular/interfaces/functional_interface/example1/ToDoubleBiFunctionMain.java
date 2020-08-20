package java_regular.interfaces.functional_interface.example1;

import java.util.function.ToDoubleBiFunction;

/**
 * Function which takes in two arguments of type "T" and "U" and produces a "double-valued" result.
 *
 * This functional interface takes in two generics, namely: *
 *     "T": denotes the type of the first input argument to the operation
 *     "U": denotes the type of the second input argument to the operation
 *
 * The "lambda expression" assigned to an object of "ToDoubleBiFunction" type is used to define its "applyAsDouble()"
 * which eventually applies the given operation on its two arguments.
 *
 * It is similar to using an object of type "BiFunction<T, U, Double>".
 */
public class ToDoubleBiFunctionMain {
    public static void main(String[] args) {
        // applyAsDouble() - accepts two arguments of type "T" and "U" and produces a "double-valued" result.
        ToDoubleBiFunction<Integer, String> toDoubleBiFunction = (a, b) -> a + Integer.parseInt(b) * 3.2;
        System.out.println(toDoubleBiFunction.applyAsDouble(3, "10"));
    }
}
