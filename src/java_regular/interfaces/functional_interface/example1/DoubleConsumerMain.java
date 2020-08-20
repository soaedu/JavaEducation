package java_regular.interfaces.functional_interface.example1;

import java.util.function.DoubleConsumer;

public class DoubleConsumerMain {
    public static void main(String[] args) {
        try {
            DoubleConsumer doubleConsumerConvert = a -> System.out.println(a);
            DoubleConsumer doubleConsumerDivide = a -> a /= 10;

            // using addThen() method
            DoubleConsumer composite = doubleConsumerDivide.andThen(doubleConsumerConvert);

            composite.accept(3);
        }
        catch (Exception e) {
            System.out.println("Exception : " + e);
        }
    }
}
