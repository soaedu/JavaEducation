package java_regular.interfaces.functional_interface.example1;

import java.util.function.IntBinaryOperator;

/**
 * java.util.function.IntBinaryOperator is a functional interface whose functional method is int
 * applyAsInt(int a, int b).
 * The IntBinaryOperator interface represents an operation that takes two arguments of int type and returns a result
 * of int type.
 */
public class IntBinaryOperatorMain {
    public static void main(String[] args) {
        int x = 5;
        int y = 4;

        IntBinaryOperator intBinaryOperatorAddition = (a, b) -> a + b;
        System.out.println(intBinaryOperatorAddition.applyAsInt(x, y));

        IntBinaryOperator intBinaryOperatorSubtraction = (a, b) -> a - b;
        System.out.println(intBinaryOperatorSubtraction.applyAsInt(x, y));

        IntBinaryOperator intBinaryOperatorMultiplication = (a, b) -> a * b;
        System.out.println(intBinaryOperatorMultiplication.applyAsInt(x, y));
    }
}
