package java_regular.data.type.collections.type.lists.linked_list.example2;

import Utils.CollectionHelper;

import java.util.*;

public class LinkedListMain {
    public static void main(String args[]) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("F");
        linkedList.add("B");
        linkedList.add("D");
        linkedList.add("E");
        linkedList.add("C");

        // addFirst() - add item to the head
        linkedList.addFirst("A");

        // addLast() - add item to the tail
        linkedList.addLast("Z");

        // add(index, element) - insert item in specified position
        linkedList.add(1, "A2");

        // addAll(index, collection) - insert collection items at the specified position of a linked list
        List<String> twoLetters = new ArrayList<>(2);
        twoLetters.add("N1");
        twoLetters.add("N2");
        linkedList.addAll(1, twoLetters);

        // contains() - check if a particular element exists in a linked list.
        String findItem1 = "A1";
        String findItem2 = "A2";
        System.out.println("\nList \"linkedList\" contains \": " +
                "\n\t\"" +findItem1+ "\": " +linkedList.contains(findItem1)+
                "\n\t\"" +findItem2+ "\": " +linkedList.contains(findItem2));

        // offerFirst() - add item to the head
        linkedList.offerFirst("B1");

        // offerLast() - add item to the tail
        linkedList.offerLast("Z1");

        CollectionHelper.printCollection(linkedList, "Original contents of linkedList");

        // peek() - printing the top element of the linkedList
        Object head = linkedList.peek();
        System.out.println("\n\nLinkedList head item (peeking): " +head);

        // peekFirst(), peekLast() - retrieve but do not remove,
        // the first and the last item of a linked list.
        System.out.println("First element in the list(peekFirst): " +linkedList.peekFirst());
        System.out.println("Last element in the list(peekLast): " +linkedList.peekLast());

        // pop() - remove and return the first element of a linked list.
        System.out.println("\nPop item: " +linkedList.pop());
        CollectionHelper.printCollection(linkedList,"LinkedList");

        // poll() - printing with removing the top element from the linkedList
        System.out.println("\n\nLinkedList head item (polling): " + linkedList.poll());

        // remove() - remove the head of queue.
        Object removed = linkedList.remove();
        System.out.println("\n\nRemoving item: " +removed);
        CollectionHelper.printCollection(linkedList,"LinkedList");

        // remove() - remove elements from the linkedList
        System.out.println("\n\nRemoving items from \"linkedList\"...");
        linkedList.remove("F");
        linkedList.remove(2);
        CollectionHelper.printCollection(linkedList, "LinkedList");

        // removeFirst(), removeLast() - remove first and last elements
        System.out.println("\n\nRemoving first and last item from \"linkedList\"...");
        linkedList.removeFirst();
        linkedList.removeLast();
        CollectionHelper.printCollection(linkedList, "LinkedList");

        // removeIf() - removes all the elements of this collection that satisfy the given predicate.
        String removeItem = "A2";
        System.out.println("\n\nRemoving all items with value \"" +removeItem+ "\"...");
        linkedList.removeIf(item -> item.equals(removeItem));
        CollectionHelper.printCollection(linkedList, "LinkedList");

        // get(), set() - get and set a value
        System.out.println("\n\nReplacing item value in position 2 with new value...");
        Object val = linkedList.get(2);
        linkedList.set(2, (String) val + " Changed");
        CollectionHelper.printCollection(linkedList, "LinkedList");

        // Iterate through all elements, starting at the specified position
        System.out.println("\n\nPrint \"linkedList\" items using \"Iterator\" starting from 2...");
        Iterator<String> listIterator = linkedList.listIterator(1);
        CollectionHelper.printCollection(listIterator, "LinkedList");

        // Iterate a linked list in reverse order.
        System.out.println("\n\nPrint \"linkedList\" items using \"Iterator\" reverse order...");
        Iterator<String> reverseIterator = linkedList.descendingIterator();
        CollectionHelper.printCollection(reverseIterator, "LinkedList");

        // size() - printing the amount of linkedList items.
        int size = linkedList.size();
        System.out.println("\n\nSize of \"linkedList\": " +size);

        // clear()
        System.out.print("\nClearing \"linkedList\"...");
        linkedList.clear();
        CollectionHelper.printCollection(linkedList);
    }
}
