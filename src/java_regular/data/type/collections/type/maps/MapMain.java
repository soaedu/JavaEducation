package java_regular.data.type.collections.type.maps;

import Utils.CollectionHelper;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        Map<String, Integer> map1 = Map.of("key1", 1, "key2", 2);
        CollectionHelper.printCollection(map1, "Map1");

        Map<Map.Entry<Integer, String>, Map.Entry<Integer, String>> map2 = Map.of(Map.entry(1, "value1"),
                Map.entry(2, "value2"));
        CollectionHelper.printCollection(map2, "Map2");
    }
}
