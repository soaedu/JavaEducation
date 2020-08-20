package java_regular.data.type.collections.type.maps.hash_map.example1;

import Utils.CollectionHelper;

import java.util.HashMap;

public class HashMapMain {
    static HashMap<Integer, String> hashMap = new HashMap<>();

    public static void main(String[] args) {
        putItems();
        getItem();
    }

    private static void putItems() {
        // put()
        hashMap.put(1, "Java");
        hashMap.put(2, "Python");
        hashMap.put(3, "Kotlin");
        CollectionHelper.printCollection(hashMap, "HashMap");

    }

    public static void getItem() {
        // get()
        Integer keyToFind = 1;
        System.out.println("\n\nGet item with key \"" +keyToFind+ "\": " +hashMap.get(keyToFind));
    }
}
