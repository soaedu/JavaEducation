package java_regular.interfaces.functional_interface.example1;

import java.util.function.LongBinaryOperator;

/**
 * Operation on two long values and returns the result as a long value.
 *
 * It is a "functional interface" and thus can be used as a "lambda expression" or in a "method reference".
 * It is mostly used when the operation needs to be encapsulated from the user.
 *
 * Methods: *
 *      * applyAsLong(): takes two long values, performs the required operation and returns the result as a long.
 *          public long applyAsLong(long val1, long val2)
 *      *
 */
public class LongBinaryOperatorMain {
    public static void main(String[] args) {
        long a = 343666;
        long b = 547477;

        LongBinaryOperator longBinaryOperatorAddition = (x, y) -> {
            return x + y;
        };
        System.out.println("" +a+ " + " +b+ " = " +longBinaryOperatorAddition.applyAsLong(a, b));

        LongBinaryOperator longBinaryOperatorMultiplication = (x, y) -> {
            return x * y;
        };
        System.out.println("" +a+ " * " +b+ " = " +longBinaryOperatorMultiplication.applyAsLong(a, b));
    }
}
