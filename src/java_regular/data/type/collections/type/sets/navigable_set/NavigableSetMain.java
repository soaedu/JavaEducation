package java_regular.data.type.collections.type.sets.navigable_set;

import Utils.CollectionHelper;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetMain {
    static NavigableSet<Integer> navigableSet = new TreeSet<>();

    public static void main(String[] args) {
        addNewItems();
        printItems();
    }

    private static void addNewItems() {
        // add()
        System.out.print("\nAdding new items to \"navigableSet\" (add)...");
        while (navigableSet.size() < 7) {
            int item = navigableSet.size() + 1;
            navigableSet.add(item);
        }
        CollectionHelper.printCollection(navigableSet, "NavigableSet");
    }

    private static void printItems() {
        // descendingSet()
        System.out.print("\n\nPrint \"navigableSet\" in a reverse order...");
        NavigableSet<Integer> reversedNavigableSet = navigableSet.descendingSet();
        CollectionHelper.printCollection(reversedNavigableSet, "ReversedNavigableSet");

        // lower(Object), higher(Object), floor(Object), ceiling(Object)
        System.out.println("\n\nNavigableSet item" +
                "\n\tlower(3): " + navigableSet.lower(3) +
                "\n\thigher(3): " + navigableSet.higher(3) +
                "\n\tfloor(3): " + navigableSet.floor(3) +
                "\n\tceiling(3): " + navigableSet.ceiling(3));

        // pollFirst()
        CollectionHelper.printCollection(navigableSet,"NavigableSet");
        System.out.print("\n\npollFirst(): " + navigableSet.pollFirst());

        // pollFirst()
        System.out.println("\npollLast(): " + navigableSet.pollLast());

        // tailSet()
        Integer item = 3;
        NavigableSet<Integer> threeOrMore = navigableSet.tailSet(3, true);
        System.out.println("\nNavigableSet item with value \"" +item+ "\" or more: " + threeOrMore);
    }
}
