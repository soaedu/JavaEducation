package java_regular.interfaces.functional_interface.example1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * Function which does not take in any argument but produces a value of type "T".
 *
 * Hence this "functional interface" takes in only one generic namely:
 *     "T": denotes the type of the result
 *
 * The "lambda expression" assigned to an object of "Supplier" type is used to define its "get()" which eventually
 * produces a value.
 *
 * Suppliers are useful when we don’t need to supply any value and obtain a result at the same time.
 */
public class SupplierMain {
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        // #1
        // get() - does not take in any argument but produces a value of type "T".
        System.out.print("Random number: ");
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());

        // 2
        System.out.print("\nLocal date and time: ");
        Supplier<LocalDateTime> s = () -> LocalDateTime.now();
        LocalDateTime time = s.get();
        System.out.println(time);

        System.out.print("Local date and time (formatted): ");
        Supplier<String> s1 = () -> dtf.format(LocalDateTime.now());
        String time2 = s1.get();
        System.out.println(time2);

        // return a Supplier
        System.out.print("\nGet supplier from method: ");
        List<String> list = new SupplierMain().supplier().get();
        System.out.println(list);
    }

    public Supplier<List<String>> supplier() {
        // lambda
        // return () -> new ArrayList<>();

        // constructor reference
        return ArrayList::new;
    }
}
