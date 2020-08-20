package java_regular.generics.example1;

import java.util.Collection;

public final class Algorithm {
    public static <T> int countIf(Collection<T> c, UnaryPredicate<T> p) {
        int count = 0;

        for (T elem : c)
            if (p.test(elem))
                ++count;

        return count;
    }
}

class OddPredicate implements UnaryPredicate<Integer> {
    public boolean test(Integer i) { return i % 2 != 0; }
}
