package java_regular.data.type.collections.operation.collections_class.example1;

import Utils.CollectionHelper;
import java_regular.data.type.collections.type.queues.priority_queue.example2.PriorityQueueMain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Collections algorithms example.
 */
public class CollectionsMain {
    public static void main(String[] args) {
        List<MyClass<String>> arrayList = new ArrayList<MyClass<String>>();
        arrayList.add(new MyClass("Василий"));
        arrayList.add(new MyClass("Павел"));
        arrayList.add(new MyClass("Андрей"));
        arrayList.add(new MyClass("Андрей"));
        arrayList.add(new MyClass("Петр"));
        arrayList.add(new MyClass("Анжелика"));
        CollectionHelper.printCollection(arrayList, "arrayList");

        // copy()
        // must be specified size
        System.out.print("\n\nCopy items from \"arrayList\" to \"arrayList2\"...");
        List<MyClass<String>> arrayList2 = new ArrayList<MyClass<String>>(arrayList.size());
        // populate new list, can put anything, it does not matter now
        for(MyClass<String> item : arrayList) {
            arrayList2.add(null);
        }
        // Copy from right argument to left
        Collections.copy(arrayList2, arrayList);
        CollectionHelper.printCollection(arrayList2);

        // fill()
        System.out.print("\n\nReplace all items values to \"Антон\" in \"arrayList2\"...");
        Collections.fill(arrayList2, new MyClass<String>("Антон"));
        CollectionHelper.printCollection(arrayList2);

        // max() - returns the maximum value present in the collection.
        List<Integer> intList = List.of(1, 6, 8, 2, 0);
        CollectionHelper.printCollection(intList, "\nList of numbers");
        System.out.println("\nThe max value of the \"intList\" is: " +Collections.max(intList));

        // replaceAll()
        System.out.print("\n\nReplace all \"Андрей\" items by \"Алексей\" in \"arraylist\"...");
        Collections.replaceAll(arrayList, new MyClass("Андрей"), new MyClass("Алексей"));
        CollectionHelper.printCollection(arrayList);

        // reverse()
        System.out.print("\n\nReverse items in \"arraylist\" (reverse)...");
        Collections.reverse(arrayList);
        CollectionHelper.printCollection(arrayList);

        // reverseOrder()
        System.out.print("\n\nReverse items in \"charQueue\" (reverseOrder)...");
        int amount = 10;
        PriorityQueue<Character> charQueue = new PriorityQueue<>(amount, Collections.reverseOrder());
        while(charQueue.size() < amount) {
            charQueue.add(PriorityQueueMain.class.getCanonicalName().charAt(charQueue.size()));
        }
        CollectionHelper.printCollection(charQueue);

        // rotate() - rotate list on some amount
        // If amount will be negative - than rotation order will be other
        System.out.print("\n\nRotate on 3 items \"arraylist\"...");
        Collections.rotate(arrayList, 3);
        CollectionHelper.printCollection(arrayList);

        // shuffle()
        System.out.print("\n\nShuffle items in \"arraylist\"...");
        Collections.shuffle(arrayList);
        CollectionHelper.printCollection(arrayList);

        // swap()
        System.out.print("\n\nSwap first and last items of \"arraylist\"...");
        Collections.swap(arrayList, 0, arrayList.size()-1);
        CollectionHelper.printCollection(arrayList);

        // sort()
        List<Integer> arrayList3 = new ArrayList<Integer>(List.of(5, 7, 1, 9, 3));
        CollectionHelper.printCollection(arrayList3, "\nArraylist");
        System.out.print("\nSort items...");
        Collections.sort(arrayList3);
        CollectionHelper.printCollection(arrayList3);
    }
}
