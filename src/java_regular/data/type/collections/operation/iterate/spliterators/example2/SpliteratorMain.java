package java_regular.data.type.collections.operation.iterate.spliterators.example2;


import Utils.CollectionHelper;

import java.util.*;

/**
 * Examples src: https://howtodoinjava.com/java/collections/java-spliterator/
 */
public class SpliteratorMain {
    public static void main(String[] args) {
        // characteristics() - verify the characteristics of Spliterator obtained for ArrayList.
        printCharacteristics();

        // estimateSize(), getExactSizeIfKnown()
        printSize();

        // getComparator()
        printComparatorInfo();

        // trySplit()
        printSplitedList();

        // forEachRemaining()
        printListItems();
    }

    public static void printCharacteristics() {
        ArrayList<String> list = new ArrayList<>();
        Spliterator<String> spliterator = list.spliterator();

        int expected = Spliterator.ORDERED | Spliterator.SIZED | Spliterator.SUBSIZED;
        System.out.println(spliterator.characteristics() == expected);  //true

        if (spliterator.hasCharacteristics(Spliterator.ORDERED)) {
            System.out.println("ORDERED");
        }

        if (spliterator.hasCharacteristics(Spliterator.DISTINCT)) {
            System.out.println("DISTINCT");
        }

        if (spliterator.hasCharacteristics(Spliterator.SORTED)) {
            System.out.println("SORTED");
        }

        if (spliterator.hasCharacteristics(Spliterator.SIZED)) {
            System.out.println("SIZED");
        }

        if (spliterator.hasCharacteristics(Spliterator.CONCURRENT)) {
            System.out.println("CONCURRENT");
        }

        if (spliterator.hasCharacteristics(Spliterator.IMMUTABLE)) {
            System.out.println("IMMUTABLE");
        }

        if (spliterator.hasCharacteristics(Spliterator.NONNULL)) {
            System.out.println("NONNULL");
        }

        if (spliterator.hasCharacteristics(Spliterator.SUBSIZED)) {
            System.out.println("SUBSIZED");
        }
    }

    public static void printSize() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        Spliterator<String> spliterator = list.spliterator();
        System.out.println("\n" +spliterator.estimateSize());
        System.out.println(spliterator.getExactSizeIfKnown());
    }

    public static void printComparatorInfo() {
        SortedSet<String> set = new TreeSet<>( Collections.reverseOrder() );
        set.add("A");
        set.add("D");
        set.add("C");
        set.add("B");

        CollectionHelper.printCollection(set, "Set of letters");
        System.out.println("\n" +set.spliterator().getComparator());
    }

    public static void printSplitedList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");

        CollectionHelper.printCollection(list, "Letters list (before split)");

        Spliterator<String> spliterator1 = list.spliterator();
        Spliterator<String> spliterator2 = spliterator1.trySplit();

        System.out.println();
        spliterator1.forEachRemaining(System.out::println);
        System.out.println("========");
        spliterator2.forEachRemaining(System.out::println);
    }

    public static void printListItems() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println();
        Spliterator<String> spliterator = list.spliterator();
        spliterator.forEachRemaining(System.out::println);
    }
}
