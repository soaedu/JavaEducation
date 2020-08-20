package java_regular.data.type.collections.type.queues.linked_blocking_queue;

import Utils.CollectionHelper;

import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueMain {
    static LinkedBlockingQueue<Integer> linkedBlockingQueue = new LinkedBlockingQueue<Integer>(15);

    public static void main(String[] args) {
        addItems();
        clearQueue();
    }

    public static void addItems() {
        // add
        System.out.print("\nAdding items (add)");
        linkedBlockingQueue.add(1);
        linkedBlockingQueue.add(2);
        linkedBlockingQueue.add(3);
        linkedBlockingQueue.add(4);
        linkedBlockingQueue.add(5);
        CollectionHelper.printCollection(linkedBlockingQueue, "LinkedBlockingQueue");
    }

    private static void clearQueue() {
        // clear()
        System.out.print("\n\nClearing the \"linkedBlockingQueue\"...");
        linkedBlockingQueue.clear();
        CollectionHelper.printCollection(linkedBlockingQueue, "LinkedBlockingQueue");
    }
}
