package java_regular.interfaces.functional_interface.example1;

import java.util.function.IntSupplier;

/**
 * It represents a function which does not take any argument but produces an int value.
 *
 * The "lambda expression" assigned to an object of "IntSupplier" type is used to define its "getAsInt()" which
 * eventually applies the given operation on its argument.
 *
 * It is similar to using an object of type "Supplier<Integer>".
 */
public class IntSupplierMain {
    public static void main(String args[]) {
        // getAsInt() - This method does not take in any value but produces an int-valued result.
        IntSupplier sup = () -> (int)(Math.random() * 10);
        System.out.println(sup.getAsInt());
    }
}
