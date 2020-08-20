package java_regular.generics.example1;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class GenericMain {
    public static void main(String[] args) {
        Collection<Integer> ci = Arrays.asList(1, 2, 3, 4);
        int count = Algorithm.countIf(ci, new OddPredicate());
        System.out.println("\nNumber of odd integers = " + count);

        List<Integer> li = Arrays.asList(3, 4, 6, 8, 11, 15, 28, 32);
        Collection<Integer> c = Arrays.asList(7, 18, 19, 25);
        UnaryPredicate<Integer> p = new RelativelyPrimePredicate(c);

        int i = AlgorithmFindFirst.findFirst(li, 0, li.size(), p);

        if (i != -1) {
            System.out.print("\n" +li.get(i) + " is relatively prime to ");
            for (Integer k : c)
                System.out.print(k + " ");
            System.out.println();
        }
    }
}
