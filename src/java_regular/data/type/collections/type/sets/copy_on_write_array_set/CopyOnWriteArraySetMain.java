package java_regular.data.type.collections.type.sets.copy_on_write_array_set;

import Utils.CollectionHelper;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetMain extends Thread {
    static CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();

    public static void main(String[] args) {
        addNewItems();

        // We create a child thread that is going to modify CopyOnWriteArraySet.
        CopyOnWriteArraySetMain main = new CopyOnWriteArraySetMain();
        main.start();

        // Wait for the thread to
        // add the element.
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e) {
            System.out.println("child going to add element");
        }
        CollectionHelper.printCollection(copyOnWriteArraySet, "CopyOnWriteArraySet");

        // Now we iterate through the CopyOnWriteArraySet and we wont get exception.
        System.out.print("\n\nIterating throw \"copyOnWriteArraySet\"...");
        Iterator itr = copyOnWriteArraySet.iterator();
        while (itr.hasNext()) {
            String item = (String) itr.next();
            System.out.print("\n\titem: " +item);

            String itemToDelete = "C";
            if(item.equals(itemToDelete)) {
                System.out.println("\nTrying to delete item \"" +itemToDelete+ "\"...");

                // Here we will get RuntimeException
                itr.remove();
            }
        }
    }

    private static void addNewItems() {
        // add()
        System.out.print("\nAdding new items to \"copyOnWriteArraySet\"...");
        copyOnWriteArraySet.add("A");
        copyOnWriteArraySet.add("B");
        copyOnWriteArraySet.add("C");
        CollectionHelper.printCollection(copyOnWriteArraySet, "CopyOnWriteArraySet");
    }

    public void run() {
        String itemToAdd = "D";

        // Child thread trying to add new element in the Set object
        System.out.print("\n\nAdding item \"" +itemToAdd+ "\" to \"copyOnWriteArraySet\"...");
        copyOnWriteArraySet.add(itemToAdd);
    }
}
