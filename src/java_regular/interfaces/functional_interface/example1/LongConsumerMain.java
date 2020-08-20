package java_regular.interfaces.functional_interface.example1;

import java.util.function.LongConsumer;

/**
 * Function which takes in one long-valued argument but does not return any value.
 *
 * The lambda expression assigned to an object of "LongConsumer" type is used to define its "accept()" which eventually
 * applies the given operation on its only argument.
 *
 * It is similar to using an object of type "Consumer<Long>".
 */
public class LongConsumerMain {
    public static void main(String args[]) {
        long x = 3;

        // #1
        // accept() - accepts one value and performs the operation on its only argument.
        LongConsumer longConsumer1 = a -> System.out.println(a * 100);
        longConsumer1.accept(x);

        // #2
        // andThen() - returns a composed "LongConsumer" wherein the parameterized "LongConsumer" will be executed
        //              after the first one.
        //              If the evaluation of either operation throws an error, it is relayed to the caller of the
        //              composed operation.
        //              Note: The operation being passed as the argument should be of type "LongConsumer".
        LongConsumer longConsumer2 = a -> System.out.println(a * 10);
        LongConsumer mul = a -> a *= 100;
        LongConsumer composite = mul.andThen(longConsumer2);
        composite.accept(x);
    }
}
