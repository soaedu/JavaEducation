package java_regular.data.type.collections.type.queues.concurrent_linked_queue;

import Utils.CollectionHelper;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueMain {
    static ConcurrentLinkedQueue<Integer> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();

    public static void main(String[] args) {
        addItems();
        getItem();
        getCollectionSize();
    }

    private static void addItems() {
        // add()
        System.out.print("\nAdding items to \"concurrentLinkedQueue\"");
        concurrentLinkedQueue.add(12);
        concurrentLinkedQueue.add(70);
        concurrentLinkedQueue.add(1009);
        concurrentLinkedQueue.add(475);
        CollectionHelper.printCollection(concurrentLinkedQueue, "ConcurrentLinkedQueue");
    }

    private static void getItem() {
        // peek()
        Integer peekedItem = concurrentLinkedQueue.peek();
        System.out.println("\n\nThe first item without remove (peek): " + peekedItem);

        // poll()
        Integer polledItem = concurrentLinkedQueue.poll();
        System.out.print("The first item with removing it (poll): " + polledItem);

        CollectionHelper.printCollection(concurrentLinkedQueue, "ConcurrentLinkedQueue");
    }

    private static void getCollectionSize() {
        // size()
        System.out.println("\n\nThe size of the \"concurrentLinkedQueue\" is: " +concurrentLinkedQueue.size());
    }
}
