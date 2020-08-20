package java_regular.data.type.collections.type.dequeus.array_deque.example1;

import Utils.CollectionHelper;

import java.util.ArrayDeque;

public class ArrayDequeMain {
    static ArrayDeque<Integer> arrayDeque = new ArrayDeque<>(10);

    public static void main(String[] args) {
        addItem();
        getItem();
        clearQueue();
        offerItem();
        peekItem();
        removeItem();

        addItem();
        pollingItem();
    }

    public static void addItem() {
        // add()
        System.out.print("\nAdding items...");
        arrayDeque.add(10);
        arrayDeque.add(20);
        arrayDeque.add(30);
        arrayDeque.add(40);
        arrayDeque.add(50);
        CollectionHelper.printCollection(arrayDeque, "ArrayDeque");

        // addFirst() - insert items at the head of queue
        int addFirstItem1 = 564;
        int addFirstItem2 = 291;

        System.out.print("\n\nInsert items: \"" +addFirstItem1+"\", \"" +addFirstItem2+ "\" at the head...");
        arrayDeque.addFirst(addFirstItem1);
        arrayDeque.addFirst(addFirstItem2);
        CollectionHelper.printCollection(arrayDeque, "ArrayDeque");

        // addLast() insert items at the tail of queue
        int addLastItem1 = 24;
        int addLastItem2 = 14;
        System.out.print("\n\nInsert items: \"" +addLastItem1+"\", \"" +addLastItem2+ "\" at the tail...");
        arrayDeque.addLast(addLastItem1);
        arrayDeque.addLast(addLastItem2);
        CollectionHelper.printCollection(arrayDeque, "ArrayDeque");
    }

    public static void getItem() {
        // getFirst()
        System.out.println("\n\nFirst item: " +arrayDeque.getFirst());

        // getLast()
        System.out.println("Last item: " +arrayDeque.getLast());
    }

    public static void clearQueue() {
        // clear()
        System.out.print("Removing all items...");
        arrayDeque.clear();
        CollectionHelper.printCollection(arrayDeque);
    }

    public static void offerItem() {
        int itemToOffer = 100;

        // offer()
        System.out.print("\n\nAdd item \"" +itemToOffer+ "\" (offer)...");
        arrayDeque.offer(itemToOffer);
        CollectionHelper.printCollection(arrayDeque, "ArrayDeque");

        ++itemToOffer;
        // offerFirst()
        System.out.print("\n\nAdd item \"" +itemToOffer+ "\" (offerFirst)...");
        arrayDeque.offerFirst(itemToOffer);
        CollectionHelper.printCollection(arrayDeque, "ArrayDeque");

        ++itemToOffer;
        // offerLast()
        System.out.print("\n\nAdd item \"" +itemToOffer+ "\" (offerLast)...");
        arrayDeque.offerLast(itemToOffer);
        CollectionHelper.printCollection(arrayDeque, "ArrayDeque");
    }

    public static void peekItem() {
        // peek()
        System.out.print("\n\nHead item (peek): " +arrayDeque.peek());

        // peekFirst()
        System.out.print("\nHead item (peekFirst): " +arrayDeque.peekFirst());

        // peekLast()
        System.out.print("\nLast item (peekLast): " +arrayDeque.peekLast());
    }

    public static void removeItem() {
        // remove()
        System.out.print("\n\nRemove item: " +arrayDeque.remove());
        CollectionHelper.printCollection(arrayDeque, "ArrayDeque");

        // removeFirst()
        System.out.print("\n\nRemove first item: " +arrayDeque.removeFirst());
        CollectionHelper.printCollection(arrayDeque, "ArrayDeque");

        // removeLast()
        System.out.print("\n\nRemove last item: " +arrayDeque.removeLast());
        CollectionHelper.printCollection(arrayDeque, "ArrayDeque");
    }

    public static void pollingItem() {
        // poll()
        System.out.print("\n\nRemove item (poll): " +arrayDeque.poll());
        CollectionHelper.printCollection(arrayDeque, "ArrayDeque");

        // pollFirst()
        System.out.print("\n\nRemove first item (pollFirst): " +arrayDeque.pollFirst());
        CollectionHelper.printCollection(arrayDeque, "ArrayDeque");

        // pollLast()
        System.out.print("\n\nRemove last item (pollLast): " +arrayDeque.pollLast());
        CollectionHelper.printCollection(arrayDeque, "ArrayDeque");
    }
}
