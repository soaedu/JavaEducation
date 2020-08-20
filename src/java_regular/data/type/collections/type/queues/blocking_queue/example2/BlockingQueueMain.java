package java_regular.data.type.collections.type.queues.blocking_queue.example2;

import Utils.CollectionHelper;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueMain {
    static ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(5);

    public static void main(String[] args) throws InterruptedException {
        addItems();
        drainItems();
        offerItems();
        pollItems();
        putItems();
        checkCapacity();
        removeItems();
    }

    private static void addItems() {
        // put()
        arrayBlockingQueue.add("StarWars");
        arrayBlockingQueue.add("SuperMan");
        arrayBlockingQueue.add("Flash");
        arrayBlockingQueue.add("BatMan");
        arrayBlockingQueue.add("Avengers");
        CollectionHelper.printCollection(arrayBlockingQueue, "ArrayBlockingQueue");
    }

    private static void drainItems() {
        // drainTo(collection), drainTo(collection, maxElements)
        ArrayList<String> arrayList = new ArrayList<>();
        // #1
        /*System.out.print("\nMove all items from \"arrayBlockingQueue\" to \'arrayList\"...");
        arrayBlockingQueue.drainTo(arrayList);
        CollectionHelper.printCollection(arrayList);*/
        // #2
        int maxItems = 3;
        System.out.print("\n\nMove " + maxItems + " items from \"arrayBlockingQueue\" to \'arrayList\"...");
        arrayBlockingQueue.drainTo(arrayList, maxItems);
        CollectionHelper.printCollection(arrayBlockingQueue, "ArrayBlockingQueue");
        CollectionHelper.printCollection(arrayList, "ArrayList");
    }

    private static void offerItems() {
        // offer(object), offer(object, timeout, timeUnit)
        System.out.print("\n\nAdding new items (offer) to \"arrayBlockingQueue\"...");
        arrayBlockingQueue.offer("New Hero");
        // arrayBlockingQueue.offer("New Hero1",5, TimeUnit.SECONDS);
        CollectionHelper.printCollection(arrayBlockingQueue, "ArrayBlockingQueue");
    }

    private static void pollItems() {
        // poll()
        try {
            String polledItem = arrayBlockingQueue.poll(5, TimeUnit.SECONDS);
            System.out.print("\n\nGetting item \"" + polledItem + "\" (poll) from \"arrayBlockingQueue\"...");
            CollectionHelper.printCollection(arrayBlockingQueue, "ArrayBlockingQueue");
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }

    private static void putItems() {
        // put()
        try {
            System.out.print("\n\nAdd elements...");
            arrayBlockingQueue.put("CaptainAmerica");
            arrayBlockingQueue.put("Thor");
            CollectionHelper.printCollection(arrayBlockingQueue, "ArrayBlockingQueue");
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }

    private static void checkCapacity() {
        // remainingCapacity()
        System.out.print("\n\nArrayBlockingQueue available capacity: " + arrayBlockingQueue.remainingCapacity());
    }

    private static void removeItems() {
        // remove()
        /*System.out.print("\n\nRemove some elements..");
        if (arrayBlockingQueue.size() >= 2) {
            arrayBlockingQueue.remove();
            arrayBlockingQueue.remove();
            CollectionHelper.printCollection(arrayBlockingQueue, "ArrayBlockingQueue");
        }*/

        // take() is used to retrieve and remove the head of this queue.
        //          If the queue is empty then it will wait until an element becomes available. This method is more
        //          efficient if working on threads and using BlockingQueue in that process. So the thread that
        //          initially calls take() goes to sleep if there is no element available, letting other threads
        //          do whatever they need to do.
        //
        // Returns the value at the head of this BlockingQueue. If the queue is empty then it will wait until an
        // element becomes available.
        // This method throws InterruptedException, when the interruption occurs at time of waiting for an element
        // to become available if queue is empty.
        CollectionHelper.printCollection(arrayBlockingQueue, "\nArrayBlockingQueue");
        System.out.println("\nRemoving items (take)...");
        try {
            String removedItem1 = arrayBlockingQueue.take();
            System.out.print("Removed item(s) from head: " + removedItem1);
            CollectionHelper.printCollection(arrayBlockingQueue, "ArrayBlockingQueue");

            String removedItem2 = arrayBlockingQueue.take();
            System.out.print("\nRemoved item(s) from head: " + removedItem2);
            CollectionHelper.printCollection(arrayBlockingQueue, "ArrayBlockingQueue");
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }
}
