package java_regular.data.type.collections.type.queues.linked_transfer_queue.example1;

import Utils.CollectionHelper;

import java.util.concurrent.LinkedTransferQueue;

public class LinkedTransferQueueMain {
    public static void main(String[] args) {
        LinkedTransferQueue<Integer> linkedTransferQueue = new LinkedTransferQueue<>();

        // add()
        System.out.print("\nAdding messages to the end of the \"linkedTransferQueue\"...");
        while (linkedTransferQueue.size() < 5) {
            int item = linkedTransferQueue.size() + 1;
            linkedTransferQueue.add(item);
        }
        CollectionHelper.printCollection(linkedTransferQueue, "LinkedTransferQueue");

        // put()
        Integer itemToPut = 10;
        System.out.print("\n\nAdding message = " +itemToPut+ "...");
        linkedTransferQueue.put(itemToPut);
        CollectionHelper.printCollection(linkedTransferQueue, "LinkedTransferQueue");

        // poll()
        Integer message = linkedTransferQueue.poll();
        System.out.println("\n\nReceiving message = " + message);
    }
}
