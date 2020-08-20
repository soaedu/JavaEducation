package java_regular.data.type.collections.type.maps.tree_map.example2;

import java.util.Comparator;

public class MyComparator implements Comparator<String> {
    @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }
}
