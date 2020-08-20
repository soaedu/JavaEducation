package java_regular.data.type.collections.type.dequeus.linked_blocking_deque.example2;

import Utils.CollectionHelper;

import java.util.concurrent.LinkedBlockingDeque;

public class LinkedBlockingDequeMain {
    static LinkedBlockingDeque<Integer> linkedBlockingDeque = new LinkedBlockingDeque<Integer>();

    public static void main(String[] args) {
        // add()
        System.out.print("\nAdd numbers to the end of the \"linkedBlockingDeque\" (add)...");
        linkedBlockingDeque.add(7855642);
        linkedBlockingDeque.add(35658786);
        linkedBlockingDeque.add(5278367);
        linkedBlockingDeque.add(74381793);
        CollectionHelper.printCollection(linkedBlockingDeque, "LinkedBlockingDeque");
        printSize();

        // removes the front element and prints it
        // removeFirst()
        System.out.print("\nRemoving first item (removeFirst)...");
        linkedBlockingDeque.removeFirst();
        CollectionHelper.printCollection(linkedBlockingDeque, "LinkedBlockingDeque");
        printSize();

        //
        // using  method
        // offer()
        System.out.print("\nAdd numbers to the end of the \"linkedBlockingDeque\" (offer)...");
        linkedBlockingDeque.offer(20);
        CollectionHelper.printCollection(linkedBlockingDeque, "LinkedBlockingDeque");
        printSize();
    }

    private static void printSize() {
        // size()
        System.out.println("\nThe size of the \"linkedBlockingDeque\" is: " +linkedBlockingDeque.size());
    }
}
