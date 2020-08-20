package java_regular.data.type.collections.type.queues.priority_bocking_queue;

import Utils.CollectionHelper;

import java.util.Comparator;
import java.util.Vector;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueMain {
    static PriorityBlockingQueue<Integer> priorityBlockingQueue = new PriorityBlockingQueue<Integer>();

    public static void main(String[] args) {
        createCollection();
        addItems();

    }

    private static void createCollection() {
        // create collection and add items in constructor
        System.out.print("\nCreating \"priorityBlockingQueue1\" and adding item using constructor...");
        Vector<Integer> vector = new Vector<>();
        vector.addElement(1);
        vector.addElement(2);
        vector.addElement(3);
        vector.addElement(4);
        vector.addElement(5);
        PriorityBlockingQueue<Integer> priorityBlockingQueue1 = new PriorityBlockingQueue<>(vector);
        CollectionHelper.printCollection(priorityBlockingQueue1, "PriorityBlockingQueue1");

        // create collection with specified capacity in constructor
        int capacity = 10;
        System.out.print("\n\nCreating collection \"priorityBlockingQueue2\" with capacity \"" +capacity+ "\""
                + " in constructor...");
        PriorityBlockingQueue<Integer> priorityBlockingQueue2 = new PriorityBlockingQueue<>(capacity);
        for (int i=0; i<capacity; i++) {
            priorityBlockingQueue2.add(i);
        }
        CollectionHelper.printCollection(priorityBlockingQueue2, "PriorityBlockingQueue2");

        // create collection using comparator
        System.out.print("\n\nCreating collection \"priorityBlockingQueue3\" with capacity \"" +capacity+ "\""
                + " and comparator in constructor...");
        PriorityBlockingQueue<Integer> priorityBlockingQueue3 = new PriorityBlockingQueue<Integer>(capacity,
                Comparator.reverseOrder());
        for (int i=0; i<capacity; i++) {
            priorityBlockingQueue3.add(i);
        }
        CollectionHelper.printCollection(priorityBlockingQueue3, "PriorityBlockingQueue3");
    }

    private static void addItems() {
        // add
        System.out.print("\n\nAdding items (add)");
        priorityBlockingQueue.add(1);
        priorityBlockingQueue.add(2);
        priorityBlockingQueue.add(3);
        priorityBlockingQueue.add(4);
        priorityBlockingQueue.add(5);
        CollectionHelper.printCollection(priorityBlockingQueue, "PriorityBlockingQueue");
    }
}
