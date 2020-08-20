package java_regular.interfaces.functional_interface.example1;

import java.util.function.ToDoubleFunction;

/**
 * Function which takes in an argument of type "T" and produces a "double-valued" result.
 *
 * This "functional interface" takes in only one generic, namely:
 *     "T": denotes the type of the input argument to the operation
 *
 * The "lambda expression" assigned to an object of "ToDoubleFunction" type is used to define its "applyAsDouble()"
 * which eventually applies the given operation on its only argument.
 *
 * It is similar to using an object of type "Function<T, Double>".
 */
public class ToDoubleFunctionMain {
    public static void main(String[] args) {
        // applyAsDouble() - accepts an argument of type "T" and gives a "double-valued" result.
        ToDoubleFunction<Integer> ob = a -> a / 2;
        System.out.println(ob.applyAsDouble(3));
    }
}
