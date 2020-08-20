package java_regular.data.type.collections.type.lists.array_list.example2;

import Utils.CollectionHelper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayListMain {
    public static void main(String[] args) {
        Collection<String> collection1 = getCollection(7);
        Collection<String> collection2 = getCollection(3);

        // foreach()
        System.out.print("Print items of \"collection1\" using \"foreach\": ");
        CollectionHelper.printCollection(collection1);

        // Iterator
        System.out.print("\n\nPrint items of \"collection1\" using \"for\" cycle and \"Iterator\": ");
        for (Iterator<String> it = collection1.iterator(); it.hasNext(); ) {
            String item = it.next();
            System.out.print("\n\titem: " +item);
        }

        CollectionHelper.printCollection(collection2, "collection2");

        // containsAll()
        System.out.print("\n\nDoes \"collection1\" contains all items of \"collection2\": "
                +collection1.containsAll(collection2));

        // addAll()
        System.out.print("\n\nAdding all items from \"collection2\" to \"collection1\"...");
        collection1.addAll(collection2);
        CollectionHelper.printCollection(collection1);

        // removeAll()
        System.out.print("\n\nRemoving from \"collection1\" all items that are in \"collection2\" too...");
        collection1.removeAll(collection2);
        CollectionHelper.printCollection(collection1);

        // Пересоздаем коллекции для дпальнейшей демонстрации
        collection1 = getCollection(7);
        collection2 = getCollection(3);
        System.out.print("\n\nRemoving from \"collection1\" all items that are NOT in \"collection2\"...");
        collection1.retainAll(collection2);
        CollectionHelper.printCollection(collection1);

        // clear()
        System.out.print("\n\nClearing \"collection1\"...");
        collection1.clear();
        CollectionHelper.printCollection(collection1);

        // remove()
        collection1 = getCollection(7);
        System.out.print("\n\nRemoving item with value \"1\" from \"collection1\"...");
        collection1.remove("1");
        CollectionHelper.printCollection(collection1);

        // Clear collection using Iterator
        collection1 = getCollection(7);
        System.out.print("\n\nClearing \"collection1\" using Iterator...");
        while(!collection1.isEmpty()) {
            Iterator iterator = collection1.iterator();
            Object item = iterator.next();
            System.out.print("\nRemoving item:" +item);
            iterator.remove();
        }
        CollectionHelper.printCollection(collection1);
    }

    // Первая коллекция для примера
    private static Collection<String> getCollection(int size) {
        Collection<String> arrayList = new ArrayList<>();

        while (arrayList.size() < size) {
            arrayList.add(String.valueOf(arrayList.size()));
        }

        return arrayList;
    }
}
