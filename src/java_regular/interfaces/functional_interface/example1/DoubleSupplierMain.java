package java_regular.interfaces.functional_interface.example1;

import java.util.function.DoubleSupplier;

public class DoubleSupplierMain {
    public static void main(String[] args) {
        DoubleSupplier pi = () -> { return 3.14d; };
        System.out.println(pi.getAsDouble());
    }
}
