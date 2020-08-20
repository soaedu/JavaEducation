package java_regular.interfaces.functional_interface.example1;

import java.util.function.DoubleUnaryOperator;

public class DoubleUnaryOperatorMain {
    public static void main(String args[]) {
        double x = 12.0;

        // #1
        // identity()
        // This method returns a DoubleUnaryOperator which takes in one double value and returns it.
        // The returned DoubleUnaryOperator does not perform any operation on its only value.
        DoubleUnaryOperator op = DoubleUnaryOperator.identity();
        System.out.println("DoubleUnaryOperator.identity() = " +op.applyAsDouble(x));

        // #2
        // applyAsDouble()
        // This method takes in one double value, performs the given operation and returns a double-valued result.
        DoubleUnaryOperator op1 = a -> 2 * a;
        System.out.println("DoubleUnaryOperator.applyAsDouble(2 * " +x+ ") = " +op1.applyAsDouble(x));

        // #3
        // addThen()
        // It returns a composed DoubleUnaryOperator wherein the parameterized operator will be executed after
        // the first one.
        // If either operation throws an error, it is relayed to the caller of the composed operation.
        DoubleUnaryOperator op2 = a -> 2 * a;
        op2 = op2.andThen(a -> 3 * a);
        System.out.println("DoubleUnaryOperator.applyAsDouble((2 * " +x+ ") * 3) = " +op2.applyAsDouble(x));

        // #4
        // compose()
        // It returns a composed "DoubleUnaryOperator" wherein the parameterized operation will be executed first and
        // then the first one.
        // If either operation throws an error, it is relayed to the caller of the composed operation.
        DoubleUnaryOperator op3 = a -> a / 3;
        op3 = op3.compose(a -> a * 6);
        System.out.println("DoubleUnaryOperator.applyAsDouble((" +x+" / 3) * 6) = " +op3.applyAsDouble(12.0));
    }
}
