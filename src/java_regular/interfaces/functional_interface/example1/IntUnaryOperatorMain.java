package java_regular.interfaces.functional_interface.example1;

import java.util.function.IntUnaryOperator;

/**
 * Function which takes in one argument and operates on it.
 *
 * Both its argument and return type are of "int" java_regular.data type. It is very similar to using an object of type
 * "UnaryOperator<Integer>".
 */
public class IntUnaryOperatorMain {
    public static void main(String args[]) {
        int x = 12;

        // #1
        // identity() - returns an "IntUnaryOperator" which takes in one int value and returns it.
        //              The returned "IntUnaryOperator" does not perform any operation on its only value.
        IntUnaryOperator intUnaryOperator1 = IntUnaryOperator.identity();
        System.out.println(intUnaryOperator1.applyAsInt(x));

        // 2
        // applyAsInt() - takes in one "int" value, performs the given operation and returns an "int-valued" result.
        IntUnaryOperator intUnaryOperator2 = a -> 2 * a;
        System.out.println(intUnaryOperator2.applyAsInt(x));

        // #3
        // addThen() - returns a composed "IntUnaryOperator" wherein the parameterized operator will be executed after
        //              the first one. If either operation throws an error, it is relayed to the caller of the
        //              composed operation.
        IntUnaryOperator intUnaryOperator3 = a -> 2 * a;
        intUnaryOperator3 = intUnaryOperator3.andThen(a -> 3 * a);
        System.out.println(intUnaryOperator3.applyAsInt(x));

        // #4
        // compose() - returns a composed "IntUnaryOperator" wherein the parameterized operation will be executed
        //              first and then the first one.
        //              If either operation throws an error, it is relayed to the caller of the composed operation.
        IntUnaryOperator intUnaryOperator4 = a -> a / 3;
        intUnaryOperator4 = intUnaryOperator4.compose(a -> a * 6);
        System.out.println(intUnaryOperator4.applyAsInt(x));
    }
}
