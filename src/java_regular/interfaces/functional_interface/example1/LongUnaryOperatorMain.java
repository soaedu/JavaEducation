package java_regular.interfaces.functional_interface.example1;

import java.util.function.LongUnaryOperator;

/**
 * Function which takes in one argument and operates on it.
 * Both its argument and return type are of "long" java_regular.data type.
 *
 * It is very similar to using an object of type "UnaryOperator<Long>".
 *
 * The "lambda expression" assigned to an object of "UnaryOperator" type is used to define its "applyAsLong()" which
 * eventually applies the given operation on its argument.
 */
public class LongUnaryOperatorMain {
    public static void main(String[] args) {
        long x = 12;

        // identity() - returns a "LongUnaryOperator" which takes in one "long" value and returns it.
        //              The returned "LongUnaryOperator" does not perform any operation on its only value.
        LongUnaryOperator longUnaryOperator1 = LongUnaryOperator.identity();
        System.out.println(longUnaryOperator1.applyAsLong(x));

        // applyAsLong() - takes in one "long" value, performs the given operation and returns a "long-valued" result.
        LongUnaryOperator longUnaryOperator2 = a -> 2 * a;
        System.out.println(longUnaryOperator2.applyAsLong(x));

        // addThen() - returns a composed "LongUnaryOperator" wherein the parameterized operator will be executed after
        //              the first one. If either operation throws an error, it is relayed to the caller of the
        //              composed operation.
        LongUnaryOperator longUnaryOperator3 = a -> 2 * a;
        longUnaryOperator3 = longUnaryOperator3.andThen(a -> 3 * a);
        System.out.println(longUnaryOperator3.applyAsLong(x));

        // compose() - returns a composed "LongUnaryOperator" wherein the parameterized operation will be executed
        //              first and then the first one. If either operation throws an error, it is relayed to the caller
        //              of the composed operation.
        LongUnaryOperator longUnaryOperator4 = a -> a / 3;
        longUnaryOperator4 = longUnaryOperator4.compose(a -> a * 6);
        System.out.println(longUnaryOperator4.applyAsLong(x));
    }
}
