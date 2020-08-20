package java_regular.interfaces.functional_interface.example1;

import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * Function which takes in one argument and operates on it.
 * However what distinguishes it from a normal "Function" is that both its argument and return type are the same.
 *
 * Hence this "functional interface" which takes in one generic namely:
 *     "T": denotes the type of the input argument to the operation
 *
 * Hence the "UnaryOperator<T>" overloads the "Function<T, T>" type. So it inherits the following methods from
 * the "Function Interface": *
 *     1. T apply(T t)
 *     2. default <V> Function<T, V> andThen(Function<? super R, ? extends V> after)
 *     3. default <V> Function<V, R> compose(Function<? super V, ? extends T> before)
 *
 * The "lambda expression" assigned to an object of "UnaryOperator" type is used to define its "accept()" which
 * eventually applies the given operation on its argument.
 */
public class UnaryOperatorMain {
    public static void main(String[] args) {
        //  identity() - returns a "UnaryOperator" which takes in one value and returns it.
        //                  The returned "UnaryOperator" does not perform any operation on its only value.
        UnaryOperator<Boolean> unaryOperator1 = UnaryOperator.identity();
        System.out.println("identity(): " +unaryOperator1.apply(true));

        // accept()
        UnaryOperator<Integer> unaryOperator2 = a -> a ^ 1;
        System.out.println("accept(): " +unaryOperator2.apply(2));

        // addThen()
        UnaryOperator<Integer> unaryOperatorXor1 = a -> a ^ 1;
        UnaryOperator<Integer> unaryOperatorAnd1 = a -> a & 1;
        Function<Integer, Integer> compose1 = unaryOperatorXor1.andThen(unaryOperatorAnd1);
        System.out.println("addThen(): " +compose1.apply(2));

        // compose()
        UnaryOperator<Integer> unaryOperatorXor2 = a -> a ^ 1;
        UnaryOperator<Integer> unaryOperatorAnd2 = a -> a & 1;
        Function<Integer, Integer> compose2 = unaryOperatorXor2.compose(unaryOperatorAnd2);
        System.out.println("compose(): " +compose2.apply(231));
    }
}
