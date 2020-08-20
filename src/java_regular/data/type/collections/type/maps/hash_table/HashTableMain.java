package java_regular.data.type.collections.type.maps.hash_table;

import Utils.CollectionHelper;

import java.util.Hashtable;

public class HashTableMain {
    static Hashtable<Integer, String> hashtable = new Hashtable<>();

    public static void main(String[] args) {
        addNewItems();
    }

    private static void addNewItems() {
        System.out.print("\nAdding new  items to \"hashtable\"...");
        hashtable.put(3, "Orange");
        hashtable.put(2, "Green");
        hashtable.put(1, "Red");

        // computeIfAbsent() - provide value for new key which is absent using
        hashtable.computeIfAbsent(4, k -> "Blue");
        hashtable.computeIfAbsent(5, k -> "White");

        // putIfAbsent
        hashtable.putIfAbsent(5, "Yellow");

        CollectionHelper.printCollection(hashtable, "Hashtable");
    }
}
