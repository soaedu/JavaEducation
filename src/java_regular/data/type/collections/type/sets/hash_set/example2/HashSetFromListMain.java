package java_regular.data.type.collections.type.sets.hash_set.example2;

import Utils.CollectionHelper;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetFromListMain {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("One");
        arrayList.add("Two");
        arrayList.add("Three");
        arrayList.add("Four");
        arrayList.add("Five");
        CollectionHelper.printCollection(arrayList, "ArrayList");

        HashSet<String> hashSet=new HashSet(arrayList);
        hashSet.add("Six");

        Iterator<String> iterator = hashSet.iterator();
        CollectionHelper.printCollection(iterator, "\nHashSet");
    }
}
