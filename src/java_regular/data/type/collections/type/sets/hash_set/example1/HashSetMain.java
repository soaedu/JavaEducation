package java_regular.data.type.collections.type.sets.hash_set.example1;

import Utils.CollectionHelper;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetMain {
    static HashSet<String> hashSet = new HashSet();
    static HashSet<String> hashSet1 = new HashSet<>();

    public static void main(String args[]) {
        addItems();
        addAllItems();
        printWithIterator();

        cloneCollection();

        tryToAddDuplicates();
        removeItems();
        removeAllItems();
    }

    public static void addItems() {
        hashSet.clear();

        // add()
        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Three");
        hashSet.add("Four");
        hashSet.add("Five");
    }

    private static void addAllItems() {
        hashSet1.add("Apple");
        hashSet1.add("Mango");

        // addAll()
        hashSet.addAll(hashSet1);
    }

    public static void printWithIterator() {
        Iterator<String> iterator = hashSet.iterator();
        CollectionHelper.printCollection(iterator, "HashSet");
    }

    public static void cloneCollection() {
        // clone()
        System.out.print("\n\nCloning the \"hashSet\" collection...");
        HashSet<String> clonedHashSet = (HashSet<String>) hashSet.clone();
        CollectionHelper.printCollection(clonedHashSet, "ClonedHashSet");
    }

    private static void tryToAddDuplicates() {
        System.out.print("\n\nTrying to add duplicates...");
        hashSet.add("One");
        hashSet.add("Four");
        hashSet.add("Six");
        CollectionHelper.printCollection(hashSet, "HashSet");
    }

    public static void removeItems() {
        // remove()
        String itemToRemove = "Six";
        System.out.print("\n\nRemoving item...");
        hashSet.remove(itemToRemove);
        CollectionHelper.printCollection(hashSet, "HashSet");

        // removeIf()
        itemToRemove = "Two";
        System.out.print("\n\nRemoving item \"" +itemToRemove+ "\" if it is on the hashSet ...");
        String finalItemToRemove = itemToRemove;
        hashSet.removeIf(str->str.contains(finalItemToRemove));
        CollectionHelper.printCollection(hashSet, "HashSet");
    }

    private static void removeAllItems() {
        // removeAll()
        System.out.print("\n\nRemoving all items of specified collection...");
        hashSet.removeAll(hashSet1);
        CollectionHelper.printCollection(hashSet, "HashSet");
    }
}
