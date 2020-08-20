package java_regular.data.type.collections.type.maps.concurrent_map;

import Utils.CollectionHelper;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentMapMain {
    static ConcurrentMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();

    ConcurrentHashMap c = new ConcurrentHashMap();

    public static void main(String[] args) {
        addNewItems();
        removeItem();

        // Now we can add "Hello"
        concurrentHashMap.putIfAbsent(101, "Hello");

        replaceItem();
    }

    private static void addNewItems() {
        // put()
        System.out.print("\nAdding new items to \"concurrentHashMap\"...");
        concurrentHashMap.put(100, "Geeks");
        concurrentHashMap.put(101, "For");
        concurrentHashMap.put(102, "Geeks");

        // putIfAbsent()
        // Here we can't add "Hello" because "101" key is already present in "ConcurrentHashMap"
        concurrentHashMap.putIfAbsent(101, "Hello");
        CollectionHelper.printCollection(concurrentHashMap, "ConcurrentHashMap");
    }

    private static void removeItem() {
        Integer obj1ToRemoveKey = 101;
        String obj1ToRemoveValue = "For";

        // remove(Object, Object)
        System.out.print("\n\nRemoving item " +
                "\n\twhere key \"" +obj1ToRemoveKey+ "\" and value \"" +obj1ToRemoveValue+ "\"...");

        // We can remove entry because 101 key is associated with For value
        concurrentHashMap.remove(obj1ToRemoveKey, obj1ToRemoveValue);
        CollectionHelper.printCollection(concurrentHashMap, "ConcurrentHashMap");
    }

    private static void replaceItem() {
        // replace()
        Integer obj1ToRemoveKey = 101;
        String obj1ToRemoveOldValue = "Hello";
        String obj1ToRemoveNewValue = "For";

        System.out.print("\n\nReplacing item value" +
                "\n\twith key \"" +obj1ToRemoveKey+ "...");
        // We can replace Hello with For
        concurrentHashMap.replace(obj1ToRemoveKey, obj1ToRemoveOldValue, obj1ToRemoveNewValue);
        CollectionHelper.printCollection(concurrentHashMap, "ConcurrentHashMap");
    }
}
