package java_regular.data.type.collections.type.maps.navigable_map;

import Utils.CollectionHelper;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapMain {
    static NavigableMap<String, Integer> navigableMap = new TreeMap<>();

    public static void main(String[] args) {
        addNewItems();
        printMapItems();
    }

    private static void addNewItems() {
        System.out.print("\nAdding new items to \"navigableMap\" (put)...");
        navigableMap.put("C", 888);
        navigableMap.put("Y", 999);
        navigableMap.put("A", 444);
        navigableMap.put("T", 555);
        navigableMap.put("B", 666);
        navigableMap.put("A", 555);
        CollectionHelper.printCollection(navigableMap, "NavigableMap");
    }

    private static void printMapItems() {
        // firstKey(), lastKey(), firstEntry(), floorEntry(), keySet(), descendingKeySet(), descendingMap()
        System.out.println("\n\nMap \"navigableMap\":" +
                "\n\tfirst key: " +navigableMap.firstKey()+
                "\n\tlast key: " +navigableMap.lastKey()+
                "\n\tfirst entry: " +navigableMap.firstEntry()+
                "\n\tfloor entry: " +navigableMap.floorEntry("L")+
                "\n\tset: " +navigableMap.keySet()+
                "\n\tdescending set: " +navigableMap.descendingKeySet()+
                "\n\treverse map: " +navigableMap.descendingMap()
        );
    }
}
