package java_regular.data.type.collections.type.maps.tree_map.example1;

import Utils.CollectionHelper;
import java.util.TreeMap;

public class TreeMapMain {
    static TreeMap<Integer, String> treeMap = new TreeMap<>();

    public static void main(String args[]) {
        addNewItems();
        checkTreeMap();
    }

    private static void addNewItems() {
        // put()
        System.out.print("\nAdding new items to \"treeMap\"...");
        treeMap.put(10, "Geeks");
        treeMap.put(15, "4");
        treeMap.put(20, "Geeks");
        treeMap.put(25, "Welcomes");
        treeMap.put(30, "You");
        CollectionHelper.printCollection(treeMap, "TreeMap");
    }

    private static void checkTreeMap() {
        // containsKey(),
        Integer key1 = 10;
        Integer key2 = 50;

        String value1 = "Geeks";
        String value2 = "For";

        System.out.println("\n\nCheck if \"treeMap\" contains" +
                "\n\tkey \"" +key1+ "\": " +treeMap.containsKey(key1)+
                "\n\tkey \"" +key2+ "\": " +treeMap.containsKey(key2)+
                "\n\tvalue \"" +value1+ "\": " +treeMap.containsValue(value1)+
                "\n\tvalue \"" +value2+ "\": " +treeMap.containsValue(value2)
        );
    }
}
