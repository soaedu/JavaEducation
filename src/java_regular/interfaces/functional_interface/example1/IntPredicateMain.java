package java_regular.interfaces.functional_interface.example1;

import java.util.function.IntPredicate;

/**
 *  It operates on an integer value and returns a predicate value based on a condition.
 *
 *  It is a functional interface and thus can be used in "lambda expression" also.
 *  Methods: *
 *     * test():    This function evaluates a conditional check on the int value, and returns a boolean value
 *                  denoting the outcome.
 *                      boolean test(int value)
 *     * and():     This function applies the "AND" operation on the current object and the object received as argument,
 *                  and returns the newly formed predicate. This method has a default implementation. *
 *                      default IntPredicate and(IntPredicate other)
 *     * negate():  This function returns the inverse of the current predicate i.e reverses the test condition.
 *                  This method has a default implementation.
 *                      default IntPredicate negate()
 *     *  or():     This function applies the "OR" operation on the current object and the object received as argument,
 *                  and returns the newly formed predicate. This method has a default implementation.
 *                      default IntPredicate or(IntPredicate other)
 */
public class IntPredicateMain {
    public static void main(String[] args) {
        final int VALUE = 544331;

        // Predicate to check a value is less than 544331
        IntPredicate lessOrEqualPredicate = (x) -> {
            if (x <= VALUE)
                return true;
            return false;
        };

        System.out.println("" +VALUE+ " is less or equal to " +VALUE+ " : " + lessOrEqualPredicate.test(VALUE));

        // Predicate to check a value is equal to 544331
        IntPredicate equalPredicate = (x) -> {
            if (x == VALUE)
                return true;
            return false;
        };

        System.out.println("" +VALUE+ " is equal to " +VALUE+ " : " +equalPredicate.test(VALUE));

        // ORing the two predicates
        IntPredicate intPredicate1 = lessOrEqualPredicate.or(equalPredicate);
        System.out.println("" +VALUE+ " is less than equal to " +VALUE+ " : " + intPredicate1.test(VALUE));

        // ANDing the two predicates
        intPredicate1 = lessOrEqualPredicate.and(equalPredicate);
        System.out.println("" +VALUE+ " is equal to " +VALUE+ " : " + intPredicate1.test(VALUE));

        // Negating the predicate
        intPredicate1 = lessOrEqualPredicate.negate();
        System.out.println("" +VALUE+ " is greater than " +VALUE+ " : " + intPredicate1.test(VALUE));
    }
}
