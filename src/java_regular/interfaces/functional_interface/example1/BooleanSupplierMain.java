package java_regular.interfaces.functional_interface.example1;

import java.util.function.BooleanSupplier;

public class BooleanSupplierMain {
    public static void main(String[] args) {
        BooleanSupplier booleanSupplier1 = () -> (false);
        System.out.println(booleanSupplier1.getAsBoolean());

        BooleanSupplier booleanSupplier2 = () -> "Java".equals("Java");
        System.out.println(booleanSupplier2.getAsBoolean());
    }
}
