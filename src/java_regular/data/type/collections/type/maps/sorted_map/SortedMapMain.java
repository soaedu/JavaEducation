package java_regular.data.type.collections.type.maps.sorted_map;

import Utils.CollectionHelper;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapMain {
    static SortedMap<Integer, String> sortedMap = new TreeMap<Integer, String>();

    public static void main(String[] args) {
        addNewItems();
        printItemsByIterator();
        getItems();
    }

    private static void addNewItems() {
        // put()
        System.out.print("\nAdd new items to \"sortedMap\" (put)...");
        sortedMap.put(new Integer(2), "practice");
        sortedMap.put(new Integer(3), "quiz");
        sortedMap.put(new Integer(5), "code");
        sortedMap.put(new Integer(4), "contribute");
        sortedMap.put(new Integer(1), "geeksforgeeks");
    }

    private static void printItemsByIterator() {
        // entrySet(), iterator()
        CollectionHelper.printCollection(sortedMap.entrySet().iterator(), "SortedMap");
    }

    public static void getItems() {
        // tailMap(key)
        Integer key1 = 3;
        Integer key2 = 5;
        // SortedMap headMap = sortedMap.headMap(key);
        // SortedMap tailMap = sortedMap.tailMap(key);
        System.out.println("\n\nGet:" +
                "\n\thead of the \"sortedMap\" from key \"" +key1+ "\": " +"\n\t\t" +sortedMap.headMap(key1)+
                "\n\ttail of the \"sortedMap\" from key \"" +key1+ "\": " +"\n\t\t" +sortedMap.tailMap(key1)+
                "\n\tsubMap of the \"sortedMap\" from \"" +key1+ "\" to \"" +key2+"\": "
                +"\n\t\t" +sortedMap.subMap(key1, key2)
        );
    }
}
