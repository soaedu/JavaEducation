package java_regular.data.type.classes.type.optional;

import java.util.Optional;

/*
    Example source: https://www.tutorialspoint.com/java8/java8_optional_class.htm
 */
public class OptionalClassMain {
    public static void main(String[] args) {
        OptionalClassMain main = new OptionalClassMain();

        Integer value1 = null;
        Integer value2 = new Integer(10);

        // Optional.ofNullable - allows passed parameter to be null.
        Optional<Integer> a = Optional.ofNullable(value1);

        // Optional.of - throws NullPointerException if passed parameter is null
        Optional<Integer> b = Optional.of(value2);

        System.out.println("" +a.orElse(0)+ " + " +b.orElse(0)+ " = " +main.sum(a, b));
    }

    private Integer sum(Optional<Integer> a, Optional<Integer> b) {
        // Optional.isPresent - checks the value is present or not
        System.out.println("First parameter is present: " +a.isPresent());
        System.out.println("Second parameter is present: " +b.isPresent());

        // Optional.orElse - returns:
        //   * if present -> the value
        //   * if not present -> returns the default value passed.
        Integer value1 = a.orElse(new Integer(0));

        // Optional.get - gets the value, value should be present
        Integer value2 = b.get();

        return value1 + value2;
    }
}
