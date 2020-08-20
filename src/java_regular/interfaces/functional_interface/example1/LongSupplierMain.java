package java_regular.interfaces.functional_interface.example1;

import java.util.function.LongSupplier;

/**
 * Function which does not take in any argument but produces a long value.
 */
public class LongSupplierMain {
    public static void main(String[] args) {
        // getAsLong() - does not take in any value but produces a long-valued result.
        LongSupplier sup = () -> (int)(Math.random() * 10);
        System.out.println(sup.getAsLong());
    }
}
