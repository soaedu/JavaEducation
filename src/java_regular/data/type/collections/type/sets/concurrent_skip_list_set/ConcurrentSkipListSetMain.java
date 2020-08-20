package java_regular.data.type.collections.type.sets.concurrent_skip_list_set;

import Utils.CollectionHelper;

import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSetMain {
    static ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<Integer>();

    public static void main(String[] args) {
        addNewItems();
        getItems();
        checkContains();
    }

    private static void addNewItems() {
        // add()
        System.out.print("\nAdding elements into \"concurrentSkipListSet\" (add)...");
        concurrentSkipListSet.add(78);
        concurrentSkipListSet.add(64);
        concurrentSkipListSet.add(12);
        concurrentSkipListSet.add(45);
        concurrentSkipListSet.add(8);
        CollectionHelper.printCollection(concurrentSkipListSet, "ConcurrentSkipListSet");
    }

    private static void getItems() {
        Integer itemToCheck = 45;

        // higher(Object), lower(Object), last(), pollFirst(),  size()
        System.out.print("\n\nPrinting the: " +
                "\n\telement lower than \"" +itemToCheck+ "\" (lower): " +concurrentSkipListSet.lower(itemToCheck)+
                "\n\telement higher than \"" +itemToCheck+ "\"(higher): " +concurrentSkipListSet.higher(itemToCheck)+
                "\n\thighest element (last): " +concurrentSkipListSet.last()+
                "\n\tfirst element (pollFirst): " +concurrentSkipListSet.pollFirst()+
                "\n\tamount of elements (size): " +concurrentSkipListSet.size()
        );

        Set<Integer> tailSet = concurrentSkipListSet.tailSet(itemToCheck);
        CollectionHelper.printCollection(tailSet, "\nTailSet");
    }

    private static void checkContains() {
        System.out.print("\n\nCheck if item is in the set (contains)...");
        Integer itemToCheck = 9;
        String checkResult = concurrentSkipListSet.contains(itemToCheck) ? " is present in the " +
                "\"concurrentSkipListSet\"." : " is not present in the \"concurrentSkipListSet\".";
        System.out.println("\nItem \"" +itemToCheck+ "\"" +checkResult);
    }
}
