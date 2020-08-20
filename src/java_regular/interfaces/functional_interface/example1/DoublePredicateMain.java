package java_regular.interfaces.functional_interface.example1;

import java.util.function.DoublePredicate;

public class DoublePredicateMain {
    public static void main(String[] args) {
        DoublePredicate predicate = (d) -> d > 0;

        System.out.println(predicate.test(5.6));
        System.out.println(predicate.test(-7.8));
    }
}
