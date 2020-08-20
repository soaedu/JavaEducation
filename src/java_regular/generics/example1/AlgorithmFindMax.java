package java_regular.generics.example1;

import java.util.List;

public final class AlgorithmFindMax {
    public static <T extends Object & Comparable<? super T>> T max(List<? extends T> list, int begin, int end) {
        T maxElem = list.get(begin);

        for (++begin; begin < end; ++begin)
            if (maxElem.compareTo(list.get(begin)) < 0)
                maxElem = list.get(begin);

        return maxElem;
    }
}
