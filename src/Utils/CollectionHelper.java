package Utils;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class CollectionHelper {
    private static void printTitle(String title) {
        if (!title.isEmpty()) {
            System.out.print("\n" + title + ":");
        }
    }

    public static <T> void printCollection(Collection<T> collection) {
        if (collection != null && !collection.isEmpty()) {
            for (Object item : collection) {
                System.out.print("\n\titem: " + item);
            }
        } else {
            System.out.print("\n\nCollection is empty.");
        }
    }

    public static <K, V > void printCollection(Map<K, V > collection) {
        if (collection != null && !collection.isEmpty()) {
            for (Map.Entry<K, V> item: collection.entrySet()) {
                System.out.print("\n\titem: " +
                        "\n\t\tkey: " + item.getKey()+
                        "\n\t\tvalue: " + item.getValue()
                );
            }
        } else {
            System.out.print("\n\nCollection is empty.");
        }
    }

    public static <T> void printCollection(Iterator<T> iterator) {
        if (iterator != null) {
            while (iterator.hasNext()) {
                System.out.print("\n\titem: " + iterator.next());
            }
        } else {
            System.out.print("\n\nCollection is empty.");
        }
    }

    public static <T> void printAsArray(Collection<T> collection) {
        if (collection != null && !collection.isEmpty()) {
            System.out.println(" " +Arrays.toString(collection.toArray()));
        } else {
            System.out.print("\n\nCollection is empty.");
        }
    }

    public static <T> void printCollection(Collection<T> collection, String title) {
        printTitle(title);
        printCollection(collection);
    }

    public static <T> void printCollectionAsArray(Collection<T> collection, String title) {
        printTitle(title);
        printAsArray(collection);
    }

    public static <T> void printCollection(Iterator<T> iterator, String title) {
        printTitle(title);
        printCollection(iterator);
    }

    public static <K, V > void printCollection(Map<K, V > collection, String title) {
        printTitle(title);
        printCollection(collection);
    }
}
