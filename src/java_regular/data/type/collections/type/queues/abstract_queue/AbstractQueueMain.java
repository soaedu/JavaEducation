package java_regular.data.type.collections.type.queues.abstract_queue;

import Utils.CollectionHelper;
import java.util.AbstractQueue;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

public class AbstractQueueMain {
    static AbstractQueue<Integer> abstractQueue = new LinkedBlockingQueue<Integer>();

    public static void main(String[] argv) {
        addItems();
        getItem();

        clearCollection();
    }

    private static void addItems() {
        // add()
        System.out.println("\nAdd items (add)");
        abstractQueue.add(10);
        abstractQueue.add(20);
        abstractQueue.add(30);
        abstractQueue.add(40);
        abstractQueue.add(50);

        // addAll()
        List<Integer> intList = List.of(100, 101, 102, 103);
        System.out.println("Add items (addAll)");
        abstractQueue.addAll(intList);

        CollectionHelper.printCollection(abstractQueue, "AbstractQueue");
    }

    private static void clearCollection() {
        // clear()
        System.out.print("\n\nClearing the \"abstractQueue\"...");
        abstractQueue.clear();
        CollectionHelper.printCollection(abstractQueue, "AbstractQueue");
    }

    private static void getItem() {
        // element()
        Integer itemToGet = abstractQueue.element();
        System.out.print("\n\nGet top item \"" +itemToGet+ "\" but do not remove it...");
        CollectionHelper.printCollection(abstractQueue, "AbstractQueue");

        // remove()
        Integer itemToRemove = abstractQueue.remove();
        System.out.print("\n\nGet top item \"" +itemToGet+ "\" and remove it...");
        CollectionHelper.printCollection(abstractQueue, "AbstractQueue");
    }
}
