package java_regular.data.type.collections.type.lists.array_list.example1;

import Utils.CollectionHelper;

import java.util.*;

public class ArrayListMain {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        // add()
        for (int i = 1; i < 6; i++) {
            arrayList.add("Row: " + i);
        }

        // foreach()
        System.out.print("Print items using \"foreach\": ");
        CollectionHelper.printCollection(arrayList);

        // Iterator
        System.out.print("\n\nPrint items using \"for\" cycle and \"Iterator\": ");
        for (Iterator<String> it = arrayList.iterator(); it.hasNext(); ) {
            String item = it.next();
            System.out.print("\n\titem: " +item);
        }

        // ListIterator
        System.out.print("\n\nPrint items using \"for\" cycle and \"ListIterator\" (moving forward): ");
        for (ListIterator<String> li = arrayList.listIterator(); li.hasNext(); ) {
            String item = li.next();
            System.out.print("\n\titem: " +item);
        }
        System.out.print("\n\nPrint items using \"for\" cycle and \"ListIterator\" (moving backward): ");
        for (ListIterator<String> li = arrayList.listIterator(arrayList.size()); li.hasPrevious(); ) {
            String item = li.previous();
            System.out.print("\n\titem: " +item);
        }

        // get()
        System.out.print("\n\nPrint items using \"get()\"");
        for(int i=0; i<arrayList.size(); i++) {
            String item = arrayList.get(i);
            System.out.print("\n\titem[" +i+ "]: " +item);
        }

        // remove() - remove element at index 3
        System.out.print("\n\nRemoving the element in position 3...");
        arrayList.remove(3);
        System.out.print("\nArrayList: ");
        for (int i = 0; i < arrayList.size(); i++)
            System.out.print("\n\titem[" +i+ "]: " +arrayList.get(i));

        // toArray()
        System.out.println("\n\nList \"arrayList\" as array: " + Arrays.toString(arrayList.toArray()));
    }
}
