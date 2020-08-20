package java_regular.data.type.collections.type.maps.tree_map.example2;

import Utils.CollectionHelper;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapMain {
    static TreeMap<Integer, String> treeMap = new TreeMap<>();

    public static void main(String[] args) {
        populateMap();
        getPortionOfItems();
        copyItemsTo();
        checkContains();
        getItems();
        sortKeys();
        getEntry();
        getKey();
        removeItem();
        getNavigableKeySet();

        clearCollection();
    }

    private static void populateMap() {
        String[] colorArr = new String[] {"Red", "Blue", "Orange", "Black", "Yellow"};
        while(treeMap.size() < colorArr.length) {
            int index = treeMap.size();
            treeMap.put(index, colorArr[index]);
        }
        CollectionHelper.printCollection(treeMap, "TreeMap");
    }

    private static void getPortionOfItems() {
        // headMap(key), higherEntry(key), lowerEntry(key)
        Integer key = 2;
        System.out.println("\n\nTreeMap, portion with keys that are:" +
                "\n\t < \"" +key+ "\": " +treeMap.headMap(key)+
                "\n\t > \"" +key+ "\": " +treeMap.headMap(key, true)+
                "\n\t key-value mapping associated with the:" +
                "\n\t\tleast key strictly greater than \"" +key+ "\": " +treeMap.higherEntry(key)+
                "\n\t\tgreatest key strictly less than \"" +key+ "\": " +treeMap.lowerEntry(key));

        // subMap()
        // #1
        Integer fromKey = 1;
        Integer toKey = 4;
        SortedMap<Integer, String> treeSubMap1 = new TreeMap<>();
        treeSubMap1 = treeMap.subMap(1, true, 4, false);
        System.out.println("\nTreeSubMap with keys range from \"" +fromKey+ "\" key (inclusive), " +
                "to a \"" +toKey+"\" key (exclusive): \n\t" +treeSubMap1.entrySet());

        // #2
        SortedMap<Integer, String> treeSubMap2 = new TreeMap<>();
        treeSubMap2 = treeMap.subMap(1, true, 4, true);
        System.out.println("\nTreeSubMap with keys range from \"" +fromKey+ "\" key, " +
                "to a \"" +toKey+"\" key: \n\t" +treeSubMap2.entrySet());

        // tailMap()
        // #1
        System.out.println("\nTreeMap with keys that are:" +
                "\n\t >= than a key \"" +key+ "\": " +treeMap.tailMap(key)+
                "\n\t > than a key \"" +key+ "\": " +treeMap.tailMap(key, false));
    }

    private static void copyItemsTo() {
        System.out.print("\nCreate \"copyTreeMap\" as a copy of \"treeMap\"...");

        // #1
        // TreeMap<Integer, String> copyTreeMap = new TreeMap<>(treeMap);

        // #2
        TreeMap<Integer, String> copyTreeMap = new TreeMap<>();

        // putAll(), remove(), entrySet()
        copyTreeMap.putAll(treeMap);

        Integer key = 0;
        System.out.print("\nCopyTreeMap remove item with key \"" +key+ "\"...");
        copyTreeMap.remove(key);

        System.out.print("\nCopyTreeMap entrySet: " +copyTreeMap.entrySet());
    }

    private static void checkContains() {
        int searchKey = 3;
        String searchValue = "Black";

        // containsKey(key)
        System.out.println("\n\nSearching the key \"" +searchKey+ "\"...");
        String searchKeyResult = (treeMap.containsKey(searchKey) ? "The key is found, it represents value: "
                +treeMap.get(searchKey) : "The key is not found");
        System.out.print("\t" +searchKeyResult);

        // containsValue(value)
        System.out.println("\nSearching the value \"" +searchValue+ "\"...");
        String searchValueResult = (treeMap.containsValue(searchValue) ? "The value is found" :
                "The value is not found");
        System.out.print("\t" +searchValueResult);
    }

    private static void getItems() {
        // entrySet()(), keySet(), descendingKeySet()
        System.out.print("\n\nTreeMap:" +
                "\n\tkeySet: " +treeMap.keySet()+
                "\n\tkeySet (reverse order): " +treeMap.descendingKeySet()+
                "\n\tentrySet: " +treeMap.entrySet());
    }

    private static void sortKeys() {
        // Custom comparator
        System.out.print("\n\nCreate \"stringMap\" with custom comparator...");
        TreeMap<String, String> stringMap = new TreeMap<>(new MyComparator());
        stringMap.put("c2", "Red");
        stringMap.put("c4", "Green");
        stringMap.put("c3", "Black");
        stringMap.put("c1", "White");
        System.out.print("\nStringMap (sorted keys): " +stringMap.entrySet());
    }

    private static void getEntry() {
        Integer key = 2;

        // firstEntry(), lastEntry(), floorEntry(), ceilingEntry()
        System.out.print("\n\nTreeMap entry:" +
                "\n\tfirst:\t\t" + treeMap.firstEntry()+
                "\n\tlast:\t\t" + treeMap.lastEntry()+
                "\n\tfloor:\t\t" + treeMap.floorEntry(key)+
                "\n\tceiling:\t" + treeMap.ceilingEntry(key)
        );

        // pollFirstEntry()
        System.out.println("\n\nRemoving least key...");
        treeMap.pollFirstEntry();
        System.out.println("TreeMap entrySet: " +treeMap.entrySet());

        // pollLastEntry()
        System.out.println("\nRemoving greatest key...");
        treeMap.pollLastEntry();
        System.out.print("TreeMap entrySet: " +treeMap.entrySet());
    }

    private static void getKey() {
        Integer key = 2;

        // firstKey(), lastKey(), ceilingKey()
        System.out.print("\n\nTreeMap key: " +
                "\n\tfirst: " + treeMap.firstKey()+
                "\n\tlast: " + treeMap.lastKey()+
                "\n\tleast key >= than key \"" +key+ "\": " + treeMap.ceilingKey(key)
        );

        // lowerKey(key), higherKey(key),
        System.out.println("\n\tthe greatest key strictly:" +
                "\n\t\tless than \"" +key+ "\": " + treeMap.lowerKey(key)+
                "\n\t\tgreater than \"" +key+ "\": " + treeMap.higherKey(key)
        );
    }

    private static void removeItem() {
        // remove(key)
        Integer key = 2;
        System.out.print("\nRemoving item wth key\"" +key+ "\"...");
        treeMap.remove(key);
        CollectionHelper.printCollection(treeMap, "TreeMap");
    }

    private static void getNavigableKeySet() {
        // navigableKeySet()
        System.out.println("\n\nTreeMap navigableKeySet: " +treeMap.navigableKeySet());
    }

    private static void clearCollection() {
        System.out.print("\nClearing the collection...");
        treeMap.clear();
        CollectionHelper.printCollection(treeMap, "TreeMap");
    }

}
