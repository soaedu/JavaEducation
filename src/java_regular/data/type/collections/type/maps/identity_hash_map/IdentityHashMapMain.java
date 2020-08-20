package java_regular.data.type.collections.type.maps.identity_hash_map;

import Utils.CollectionHelper;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapMain {
    public static void main(String[] args) {
        String hashMapKey = "key";
        Map<String, String> hashmap = new HashMap<>();
        hashmap.put(new String(hashMapKey),"Google");
        hashmap.put(new String(hashMapKey),"Facebook");
        CollectionHelper.printCollection(hashmap, "HashMap");

        String identityHashMapKey = "identityKey";
        Map<String, String> identityHashMap = new IdentityHashMap<>();
        identityHashMap.put(new String(identityHashMapKey),"Google");
        identityHashMap.put(new String(identityHashMapKey),"Facebook");
        CollectionHelper.printCollection(identityHashMap, "\nIdentityHashMap");
    }
}
