package java_regular.data.type.collections.type.maps.hash_map.example4;

import Utils.CollectionHelper;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {
    static HashMap<Integer, String> hashMap = new HashMap<>();

    public static void main(String[] args) {
        populateMap();
        printSize();
        putAllItemsTo();
        checkContains();
        cloneCollection();
        getItems();
        clearAllItems();
    }

    private static void getItems() {
        // entrySet()
        System.out.print("\n\nHashMap entrySet: " +hashMap.entrySet());

        // keySet()
        System.out.print("\n\nHashMap keySet: " +hashMap.keySet());

        // values()
        System.out.print("\n\nHashMap values: " +hashMap.values());

        // get()
        Integer key = 3;
        System.out.print("\n\nHashMap item with key \"" +key+ "\" is: " +hashMap.get(key));
    }

    private static void cloneCollection() {
        // clone()
        System.out.print("\n\nCloning \"hashMap\"...");
        HashMap<Integer, String> clonedHashMap = (HashMap<Integer, String>) hashMap.clone();

        System.out.print("\nRemoving the first item from \"clonedHashMap\"...");
        clonedHashMap.remove(0);

        CollectionHelper.printCollection(hashMap, "HashMap");
        CollectionHelper.printCollection(clonedHashMap, "ClonedHashMap");
    }

    private static void checkContains() {
        // containsKey(), containsValue()
        int searchKey1 = 2;
        int searchKey2 = 10;
        String searchColor1 = "Yellow";
        String searchColor2 = "Magenta";
        System.out.print("\n\nHashMap:" +
                "\n\tcontains key["+searchKey1+"]: " +hashMap.containsKey(searchKey1)+
                "\n\tcontains key["+searchKey2+"]: " +hashMap.containsKey(searchKey2)+
                "\n\tcontains color["+searchColor1+"]: " +hashMap.containsValue(searchColor1)+
                "\n\tcontains color["+searchColor2+"]: " +hashMap.containsValue(searchColor2)
        );
    }

    private static void clearAllItems() {
        // clear()
        System.out.print("\n\nClear \"hashMap\"...");
        hashMap.clear();
        CollectionHelper.printCollection(hashMap, "HashMap");
    }

    private static void putAllItemsTo() {
        // #1
        // Map<Integer, String> copyColorMap = new HashMap<>(colorMap);

        // #2
        // putAll()
        Map<Integer, String> copyHashMap = new HashMap<>();
        copyHashMap.putAll(hashMap);

        CollectionHelper.printCollection(copyHashMap, "CopyHashMap");
    }

    private static void printSize() {
        // size()
        System.out.println("\n\nHashMap:" +
                "\n\tkeys amount: " +hashMap.keySet().size()+
                "\n\tvalues amount: " +hashMap.values().size());
    }

    private static void populateMap() {
        String[] colorArr = new String[]{ "Red", "White", "Blue", "Pink", "Yellow"};

        // Associate the specified value with the specified key in a HashMap.
        while(hashMap.size() < colorArr.length) {
            int index = hashMap.size();
            hashMap.put(index, colorArr[index]);
        }
        CollectionHelper.printCollection(hashMap, "HashMap");
    }
}
