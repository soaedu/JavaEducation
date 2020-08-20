package java_regular.data.type.collections.operation.sort.example2;

import Utils.CollectionHelper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortCollectionMain {
    private static final String[] arr = {"Василий", "Павел", "Андрей", "Андрей", "Петр", "Анжелика"};
    static List<MyClassCompare> nameList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.print("\nAdding new items to \"nameList\"...");
        addNewItems(nameList, MyClassCompare.class);
        CollectionHelper.printCollection(nameList, "NameList");

        sortingItems();
    }

    private static <T> void addNewItems(List<T> list, Class<T> classType) {
        for (String item: arr) {
            list.add(getItem(classType, item));
        }
    }

    private static <T> T getItem(Class<T> classType, String item) {
        String classTypeName = classType.getSimpleName();

        if (classTypeName.equals("MyClass")) {
            return (T) new MyClass(item);
        } else if (classTypeName.equals("MyClassCompare")) {
            return (T) new MyClassCompare(item);
        } else {
            return null;
        }
    }

    private static void sortingItems() {
        System.out.print("\n\nSorting \"nameList\" (Comparable)...");
        Collections.sort(nameList);
        CollectionHelper.printCollection(nameList, "NameList");

        System.out.print("\n\nAdding new items to \"copyNameList\"...");
        List<MyClass> copyNameList = new ArrayList<>();
        addNewItems(copyNameList, MyClass.class);
        CollectionHelper.printCollection(copyNameList, "CopyNameList");

        System.out.print("\n\nSorting \"CopyNameList\" (Comparator) direction: forward...");
        // #1
        // Collections.sort(copyNameList, new MyClassComparator());

        // #2
        Collections.sort(copyNameList, new MyClassComparator(MyClassComparator.SortDirection.FORWARD));
        CollectionHelper.printCollection(copyNameList, "CopyNameList");

        System.out.print("\n\nSorting \"CopyNameList\" (Comparator) direction: backward...");
        clearList(copyNameList);
        addNewItems(copyNameList, MyClass.class);
        Collections.sort(copyNameList, new MyClassComparator(MyClassComparator.SortDirection.BACKWARD));
        CollectionHelper.printCollection(copyNameList, "CopyNameList");
    }

    private static <T> void clearList(List<T> list) {
        list.clear();
    }
}
