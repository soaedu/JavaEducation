package java_regular.interfaces.functional_interface.example1;

import java.util.function.IntConsumer;

/**
 * It represents a function which takes in one int-valued argument but does not return any value.
 *
 * The "lambda expression" assigned to an object of "IntConsumer" type is used to define its "accept()" which
 * eventually applies the given operation on its only argument.
 *
 * It is similar to using an object of type "Consumer<Integer>"
 */
public class IntConsumerMain {
    public static void main(String args[]){
        int x = 3;

        // 1
        // accept()
        // This method accepts one value and performs the operation on its only argument.
        IntConsumer intConsumer1 = a -> System.out.println(a * 10);
        intConsumer1.accept(x);

        // 2
        // andThen()
        // It returns a composed "IntConsumer" wherein the parameterized "IntConsumer" will be executed after the
        // first one.
        // If the evaluation of either operation throws an error, it is relayed to the caller of the composed operation.
        IntConsumer intConsumer2 = a -> System.out.println(a * 10);
        IntConsumer intConsumer2Multiply = a -> a *= 100;
        IntConsumer composite = intConsumer2Multiply.andThen(intConsumer2);
        composite.accept(x);
    }
}

