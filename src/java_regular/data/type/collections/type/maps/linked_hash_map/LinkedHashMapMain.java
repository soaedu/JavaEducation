package java_regular.data.type.collections.type.maps.linked_hash_map;

import Utils.CollectionHelper;
import java.util.LinkedHashMap;

public class LinkedHashMapMain {
    static LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();

    public static void main(String[] args) {
        addNewItems();
        printInfo();
    }

    private static void addNewItems() {
        // put()
        System.out.print("\nAdd new items to \"linkedHashMap\"...");
        linkedHashMap.put("one", "practice.geeksforgeeks.org");
        linkedHashMap.put("two", "code.geeksforgeeks.org");
        linkedHashMap.put("four", "quiz.geeksforgeeks.org");
        CollectionHelper.printCollection(linkedHashMap, "LinkedHashMap");
    }

    private static void printInfo() {
        // size(), isEmpty()
        System.out.println("\n\nSize of the \"linkedHashMap\": " + linkedHashMap.size());
        System.out.println("\nIs \"linkedHashMap\" empty? " + linkedHashMap.isEmpty());
    }
}
