package java_regular.data.type.collections.type.sets;

import Utils.CollectionHelper;

import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> set =  Set.of(3, 4, 5, 6);
        CollectionHelper.printCollection(set, "Set");
    }
}
