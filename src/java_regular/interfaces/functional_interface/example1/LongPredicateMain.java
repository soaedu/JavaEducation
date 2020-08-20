package java_regular.interfaces.functional_interface.example1;

import java.util.function.LongPredicate;

/**
 * Operates on a long value and returns a predicate value based on a condition.
 * It is a "functional interface" and thus can be used in "lambda expression" also.
 *      public interface LongPredicate
 *
 * Methods:
 *     * test(): evaluates a conditional check on the long value, and returns a boolean value denoting the outcome.
 *                  boolean test(long value) *
 *     * and(): applies the "AND" operation on the current object and the object received as argument,
 *              and returns the newly formed predicate. This method has a default implementation.
 *                  default LongPredicate and(LongPredicate other)*
 *     * negate(): returns the inverse of the current predicate i.e reverses the test condition.
 *                  This method has a default implementation.
 *                      default LongPredicate negate()
 *     * or(): applies the "OR" operation on the current object and the object received as argument, and returns
 *              the newly formed predicate. This method has a default implementation.
 *                  default LongPredicate or(LongPredicate other)
 */
public class LongPredicateMain {
    public static void main(String[] args) {
        long a = 499999;
        long b = 500000;
        long c = 500001;

        // Predicate to check for equal to 500000
        LongPredicate longPredicate = (x) -> {
            return (x == b);
        };
        System.out.println("" +a+ " is equal to " +b+ " : "+ longPredicate.test(a));

        // Predicate to check for less than equal to 500000
        LongPredicate longPredicate1 = (x) -> {
            return (x <= b);
        };
        System.out.println("" +a+ " is less than equal to " +b+ " : " +longPredicate1.test(a));

        // ANDing the two predicates
        LongPredicate longPredicate2 = longPredicate.and(longPredicate1);
        System.out.println("" +b+ " is equal to " +b+ " : " +longPredicate2.test(b));

        // ORing the two predicates
        longPredicate2 = longPredicate.or(longPredicate1);
        System.out.println("" +c+ " is less than equal to " +b+ " : " +longPredicate2.test(c));

        // Negating the predicate
        longPredicate2 = longPredicate1.negate();
        System.out.println("" +a+ " is greater than " +b+ " : " +longPredicate2.test(a));
    }
}
