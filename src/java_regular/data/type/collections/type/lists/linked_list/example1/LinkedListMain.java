package java_regular.data.type.collections.type.lists.linked_list.example1;

import Utils.CollectionHelper;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

// Join two linked lists.
public class LinkedListMain {
    public static void main(String[] args) {
        List<Integer> evenNumbers = new LinkedList<>();
        List<Integer> oddNumbers = new LinkedList<>();

        int i= 10;
        while (i > 0) {
            ((i > 1) && ((i % 2) == 0) ? evenNumbers : oddNumbers).add(i);
            i--;
        }
        CollectionHelper.printCollection(evenNumbers, "EvenNumbers");
        CollectionHelper.printCollection(oddNumbers, "OddNumbers");

        // addAll(collection) - add all items from "collection"
        List<Integer> allNumbers = new LinkedList<>();
        allNumbers.addAll(evenNumbers);
        allNumbers.addAll(oddNumbers);

        // sort() - sorting items
        System.out.println("\n\nSorting \"allNumbers\"...");
        Collections.sort(allNumbers);
        CollectionHelper.printCollection(allNumbers, "AllNumbers");
    }
}
