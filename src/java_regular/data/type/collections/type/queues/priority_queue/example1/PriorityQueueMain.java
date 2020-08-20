package java_regular.data.type.collections.type.queues.priority_queue.example1;

import Utils.CollectionHelper;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueMain {
    public static void main(String args[]) {
        Queue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("A1");
        priorityQueue.add("A2");
        priorityQueue.add("A3");
        CollectionHelper.printCollection(priorityQueue, "PriorityQueue");

        // Iterator throw queue
        Iterator iterator = priorityQueue.iterator();
        CollectionHelper.printCollection(iterator, "\nPriorityQueue(iteration)");

        // peek() - printing the top element of the PriorityQueue
        System.out.println("\n\nPeek Method: " + priorityQueue.peek());

        // poll() - printing the top element and removing it from the PriorityQueue container
        System.out.print("\nPoll Method: " + priorityQueue.poll());

        // remove()
        String itemToRemove = "A2";
        System.out.print("\n\nRemoving " +itemToRemove+ " ...");
        priorityQueue.remove(itemToRemove);
        CollectionHelper.printCollection(priorityQueue, "PriorityQueue");
    }
}
