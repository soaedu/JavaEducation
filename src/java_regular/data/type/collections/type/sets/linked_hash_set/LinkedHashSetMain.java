package java_regular.data.type.collections.type.sets.linked_hash_set;

import Utils.CollectionHelper;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetMain {
    static LinkedHashSet<String> linkedHashSet = new LinkedHashSet();

    public static void main(String[] args) {
        addItems();
        printWithIterator();

        tryToAddDuplicates();
    }

    public static void addItems() {
        linkedHashSet.clear();

        // add()
        linkedHashSet.add("One");
        linkedHashSet.add("Two");
        linkedHashSet.add("Three");
        linkedHashSet.add("Four");
        linkedHashSet.add("Five");
    }

    public static void printWithIterator() {
        Iterator<String> iterator = linkedHashSet.iterator();
        CollectionHelper.printCollection(iterator, "LinkedHashSet");
    }

    private static void tryToAddDuplicates() {
        System.out.print("\n\nTrying to add duplicates...");
        linkedHashSet.add("One");
        linkedHashSet.add("Four");
        linkedHashSet.add("Six");
        CollectionHelper.printCollection(linkedHashSet, "LinkedHashSet");
    }
}
