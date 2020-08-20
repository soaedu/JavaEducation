package java_regular.interfaces.functional_interface.example1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * This "functional interface":
 *      * improves manageability of code,
 *      * helps in unit-testing them separately,
 *      * contain some methods like: *
 *          1. isEqual(Object targetRef)    - returns a predicate that tests if two arguments are equal according to
 *                                              Objects.equals(Object, Object).
 *          2. and(Predicate other)         - returns a composed predicate that represents a
 *                                              "short-circuiting logical AND" of this predicate and another.
 *          3. negate()                     - returns a predicate that represents the "logical negation" of this
 *                                              predicate.
 *          4. or(Predicate other)          - returns a composed predicate that represents a
 *                                              "short-circuiting logical OR" of this predicate and another.
 *          5. test(T t)                    - evaluates this predicate on the given
 *                                                  argument.boolean test(T t)
 */
public class PredicateMain {
    public static Predicate<String> hasLengthMoreThan10 = new Predicate<String>() {
        @Override
        public boolean test(String t){
            return t.length() > 10;
        }
    };

    public static void main(String[] args) {
        // Simple Predicate
        Predicate<Integer> lessThan = i -> (i < 18);
        System.out.println("Simple Predicate");
        System.out.println(lessThan.test(10));

        // Predicate Chaining
        Predicate<Integer> greaterThanTen = (i) -> i > 10;
        Predicate<Integer> lowerThanTwenty = (i) -> i < 20;
        boolean result = greaterThanTen.and(lowerThanTwenty).test(15);
        System.out.println("\nPredicate Chaining");
        System.out.println(result);
        boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(15);
        System.out.println(result2);

        //  Predicate into Function
        System.out.println("\nPredicate into Function");
        usePredicate(10, (i) -> i > 7);

        // Predicate OR
        System.out.println("\nPredicate OR");
        useOrPredicate();

        //
        System.out.println("\nPrint number if predicate returns \"true\": ");
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.print("\tall numbers: ");
        printNumberIfTrue(list, n->true);

        System.out.print("\n\teven numbers: ");
        printNumberIfTrue(list, n-> n%2 == 0 );

        System.out.print("\n\tnumbers greater than 3: ");
        printNumberIfTrue(list, n-> n > 3 );
    }

    static void usePredicate(int number, Predicate<Integer> predicate){
        if (predicate.test(number)) {
            System.out.println("Number " + number);
        }
    }

    public static void useOrPredicate() {
        Predicate<String> containsLetterA = p -> p.contains("A");
        // String testString = "123456789";     // false
        // String testString = "123456789nd";   // true
        String testString = "And";              // true
        boolean outcome = hasLengthMoreThan10.or(containsLetterA).test(testString);
        System.out.println(outcome);
    }

    public static void printNumberIfTrue(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer num: list) {
            if (predicate.test(num)) {
                System.out.print(num + "\t ");
            }
        }
    }
}
