package java_regular.data.type.collections.type.queues.array_blocking_queue;

import Utils.CollectionHelper;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueMain {
    public static void main(String[] args) {
        int capacity = 15;

        ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<>(capacity);

        // add()
        arrayBlockingQueue.add(1);
        arrayBlockingQueue.add(2);
        arrayBlockingQueue.add(3);
        CollectionHelper.printCollection(arrayBlockingQueue, "ArrayBlockingQueue");

        // clear()
        System.out.print("\n\nClearing the \"arrayBlockingQueue\"...");
        arrayBlockingQueue.clear();
        CollectionHelper.printCollection(arrayBlockingQueue, "ArrayBlockingQueue");
    }
}
