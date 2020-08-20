package java_regular.data.type.collections.type.sets.tree_set.example1;

import Utils.CollectionHelper;
import java.util.*;

public class TreeSetMain {
    static TreeSet<String> treeSet = new TreeSet<>();

    public static void main(String args[]) {
        addItems();
        printSpecifiedItem();
        containsItem();
        removeItem();
        printSize();
    }

    private static void addItems() {
        int[] intArr = {34, 22, 10, 60, 30, 22};
        Set<Integer> hashSet = new HashSet<>();
        for(int i = 0; i < 5; i++) {
            hashSet.add(intArr[i]);
        }
        CollectionHelper.printCollection(hashSet, "HashSet");

        // add()
        System.out.print("\n\nAdd items to \"treeSet\"...");
        for (Integer item: hashSet)
            treeSet.add(String.valueOf(item));
        CollectionHelper.printCollection(treeSet, "TreeSet");
    }

    private static void printSpecifiedItem() {
        // first(), last()
        System.out.print("\n\nThe first element of \"treeSet\" is: "+treeSet.first());
        System.out.println("\nThe last element of \"treeSet\" is: "+ treeSet.last());
    }

    public static void containsItem() {
        // contains()
        String item1ToCheck = String.valueOf(30);
        String item2ToCheck = String.valueOf(130);
        System.out.print("\n\nThe \"treeSet\" contains \"" +item1ToCheck+ "\": "+treeSet.contains(item1ToCheck));
        System.out.print("\nThe \"treeSet\" contains \"" +item2ToCheck+ "\": "+treeSet.contains(item2ToCheck));
    }

    public static void removeItem() {
        // remove()
        String itemToRemove = "22";
        System.out.println("\nRemoving item \"" +itemToRemove+ "\"...");
        treeSet.remove(itemToRemove);
        CollectionHelper.printCollection(treeSet, "TreeSet");

        // removeAll()
        Collection<String> arrayList = new ArrayList<>();
        arrayList.add("34");
        arrayList.add("22");
        arrayList.add("10");
        CollectionHelper.printCollection(arrayList, "ArrayList");
        System.out.print("\nRemoving all items from \"treeSet\" that are in \"arrayList\" too (removeAll)...");
        treeSet.removeAll(arrayList);
        CollectionHelper.printCollection(treeSet, "TreeSet");
    }

    public static void printSize() {
        // size()
        System.out.println("\n\nThe size of \"treeSet\" is: " +treeSet.size());
    }
}
