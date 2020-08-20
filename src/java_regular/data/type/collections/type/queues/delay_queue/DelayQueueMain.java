package java_regular.data.type.collections.type.queues.delay_queue;

import Utils.CollectionHelper;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;

public class DelayQueueMain  {
    static BlockingQueue<DelayObject> delayQueue = new DelayQueue<>();

    public static void main(String[] args) throws InterruptedException {
        addItems(delayQueue);
        createDelayQueue();
        getItems();
        getSize();
        clearQueue();
    }

    private static void createDelayQueue() {
        System.out.print("\n\nCreating the object, using \"DelayQueue(Collection c)\" constructor...");
        BlockingQueue<DelayObject> copyOfDelayQueue = new DelayQueue<>(delayQueue);
        CollectionHelper.printCollection(copyOfDelayQueue, "CopyOfDelayQueue");
    }

    private static void addItems(BlockingQueue<DelayObject> delayQueue) {
        // add()
        System.out.print("\nAdding items to \"delayQueue\"...");
        delayQueue.add(new DelayObject("A", 1));
        delayQueue.add(new DelayObject("B", 2));
        delayQueue.add(new DelayObject("C", 3));
        delayQueue.add(new DelayObject("D", 4));
        CollectionHelper.printCollection(delayQueue, "DelayQueue");
    }

    private static void getItems() {
        // peek()
        DelayObject delayObjectPeeked = delayQueue.peek();
        assert delayObjectPeeked != null;
        System.out.print("\n\nHead of \"delayQueue\" (peek): " + delayObjectPeeked.toString());
        CollectionHelper.printCollection(delayQueue, "DelayQueue");

        // poll()
        DelayObject delayObjectPolled = delayQueue.poll();
        System.out.print("\n\nHead of \"delayQueue\"DelayQueue (poll): " + delayObjectPolled.toString());
        CollectionHelper.printCollection(delayQueue, "DelayQueue");
    }

    private static void getSize() {
        // size()
        System.out.println("\n\nSize of \"delayQueue\" is: " +delayQueue.size());
    }

    private static void clearQueue() {
        // clear()
        System.out.print("\nClearing the \"delayQueue\"...");
        delayQueue.clear();
        CollectionHelper.printCollection(delayQueue, "DelayQueue");
    }
}
