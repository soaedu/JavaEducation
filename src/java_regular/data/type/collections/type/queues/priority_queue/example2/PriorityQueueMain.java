package java_regular.data.type.collections.type.queues.priority_queue.example2;

import Utils.CollectionHelper;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueMain {
    static PriorityQueue<String> priorityQueue = new PriorityQueue<String>();

    public static void main(String args[]) {
        addItems();
        checkContains();
        iterateThrough();
        getItems();
        removeItems();
        printCollection();
        clearCollection();
    }

    private static void addItems() {
        System.out.print("\nAdding items (add) to \"priorityQueue\"...");
        priorityQueue.add("C");
        priorityQueue.add("C++");
        priorityQueue.add("Java");
        priorityQueue.add("Python");
        CollectionHelper.printCollection(priorityQueue, "PriorityQueue");

        // addAll() - add all the elements of one priority queue to another.
        System.out.print("\n\nAdding items (addAll) from \"priorityQueue\" to \"copyOfPriorityQueue\"...");
        PriorityQueue<String> copyOfPriorityQueue = new PriorityQueue<>();
        copyOfPriorityQueue.addAll(priorityQueue);
        CollectionHelper.printCollection(copyOfPriorityQueue, "CopyOfPriorityQueue");

        // offer() - insert a given element into a priority queue.
        String itemToOffer = "Kotlin";
        System.out.print("\n\nInserting item \"" +itemToOffer+ "\"...");
        priorityQueue.offer(itemToOffer);
        CollectionHelper.printCollection(priorityQueue, "PriorityQueue");
    }

    private static void checkContains() {
        // contains() Check if an element is present using
        String item = "C";
        boolean containsItem = priorityQueue.contains(item);
        System.out.println("\n\nPriority queue contains item \"" +item+ "\": " +containsItem);
    }

    private static void iterateThrough() {
        // Iterator
        System.out.print("\nPrint \"priorityQueue\" using Iterator: ");
        Iterator iterator = priorityQueue.iterator();
        CollectionHelper.printCollection(iterator);
    }

    private static void getItems() {
        // peek() - printing the most priority element
        System.out.println("\n\nHead value (peek): " +priorityQueue.peek());

        // poll() - removing the top priority element (or head) and
        // printing the modified pQueue using poll()
        String itemToPoll = priorityQueue.poll();
        System.out.print("\nRemoving item \"" +itemToPoll+ "\" (poll)...");
        CollectionHelper.printCollection(priorityQueue.iterator());
    }

    private static void removeItems() {
        // remove() - remove item
        String itemToRemove = "Java";
        System.out.print("\n\nRemoving item \"" +itemToRemove+ "\" (remove)...");
        priorityQueue.remove(itemToRemove);
        CollectionHelper.printCollection(priorityQueue.iterator());
    }

    private static void printCollection() {
        // toArray() - getting objects from the queue using in an array
        Object[] arr = priorityQueue.toArray();
        System.out.print("\n\nPrint \"priorityQueue\" as an array:");
        CollectionHelper.printAsArray(priorityQueue);
    }

    private static void clearCollection() {
        // clear(), removeAll() - remove all the elements from a priority queue.
        System.out.print("\nRemove all items...");
        priorityQueue.removeAll(priorityQueue);
        priorityQueue.clear();
        CollectionHelper.printCollection(priorityQueue);
    }
}
