package java_regular.interfaces.functional_interface.example1;

import java.util.function.BiConsumer;

public class BiConsumerMain {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;

        // takes two arguments and returns nothing.
        BiConsumer<Integer, Integer> biConsumerAddition = (x, y) -> System.out.println("BiConsumer: " + a + " + " + b +
                " = " + (a + b));
        biConsumerAddition.accept(a, b);

    }
}
