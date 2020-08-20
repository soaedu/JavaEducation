package java_regular.data.type.collections.type.dequeus.concurrent_linked_deque;

import Utils.CollectionHelper;

import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDequeMain {
    static ConcurrentLinkedDeque concurrentLinkedDeque = new ConcurrentLinkedDeque();

    public static void main(String[] args) {
        addNewItems();
        createDeque();
        getItems();
        removeItems();
    }

    private static void addNewItems() {
        // addFirst()
        System.out.print("\nAdding items to \"concurrentLinkedDeque\"...");
        concurrentLinkedDeque.addFirst(12);
        concurrentLinkedDeque.addFirst(70);
        concurrentLinkedDeque.addFirst(1009);
        concurrentLinkedDeque.addFirst(475);

        // add()
        concurrentLinkedDeque.add(500);

        CollectionHelper.printCollection(concurrentLinkedDeque, "ConcurrentLinkedDeque");
    }

    private static void createDeque() {
        System.out.print("\n\nCreate a \"concurrentLinkedDeque1\" using constructor with \"Collection<E>\" " +
                "as an argument...");
        ConcurrentLinkedDeque<Integer> concurrentLinkedDeque1 = new ConcurrentLinkedDeque<Integer>(concurrentLinkedDeque);
        CollectionHelper.printCollection(concurrentLinkedDeque1, "ConcurrentLinkedDeque1");
    }

    public static void getItems() {
        // getFirst(), getLast()
        System.out.println("\n\nDisplaying the:" +
                "\n\tfirst element: " +concurrentLinkedDeque.getFirst()+
                "\n\tlast element: " +concurrentLinkedDeque.getLast());
    }

    public static void removeItems() {
        // removeLast()
        System.out.print("\nRemoving the last element...");
        concurrentLinkedDeque.removeLast();
        CollectionHelper.printCollection(concurrentLinkedDeque, "ConcurrentLinkedDeque");
    }
}
