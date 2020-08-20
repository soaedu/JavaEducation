package java_regular.data.type.collections.type.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListMain {
    public static void main(String[] args) {
        // #1
        List<Integer> intList = null;

        // #2
        // List<Integer> intList = List.of(1, 2, 3, 4, 5);

        System.out.println("\nList: " + Objects.requireNonNullElse(intList, new ArrayList<>()));
    }
}
