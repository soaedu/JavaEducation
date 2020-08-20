package java_regular.data.type.collections.type.lists.array_list.example4;

import Utils.CollectionHelper;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMain {
    public static void main(String[] args) {
        String[] colorArr = new String[]{"Red", "Orange", "Yellow", "Green", "LightBlue", "Blue", "Magenta"};

        ArrayList<String> colors = new ArrayList<>();
        colors.addAll(Arrays.asList(colorArr));
        CollectionHelper.printCollection(colors, "List colors");

        ArrayList<String> colorsClone = (ArrayList<String>) colors.clone();
        CollectionHelper.printCollection(colorsClone, "\nList colorsClone");

        // Clear colors list
        colors.removeAll(colors);
        CollectionHelper.printCollection(colors, "\nList \"colors\" after remove all");
        CollectionHelper.printCollection(colorsClone, "\nList \"colorsClone\"");

        // Check is colors list empty or not
        System.out.println("\nList \"colors\" is empty: " +colors.isEmpty());
        System.out.println("List \"colorsClone\" is empty: " +colorsClone.isEmpty());

        // Trim colorsClone list
        System.out.println("\nList \"colorsClone\" size before removing 2 item: " +colorsClone.size());
        colorsClone.remove(2);
        System.out.println("List \"colorsClone\" size after removing 2 item: " +colorsClone.size());

        colorsClone.trimToSize();
        System.out.println("\nList \"colorsClone\" size after trimToSize(): " +colorsClone.size());

        ////////////////////////////////////////////////////////////////////////////////////////

        // Increase list size
        int elementAmount = 3;
        ArrayList<String> fixedSizeList = new ArrayList<>(elementAmount);

        for (int i=0; i<elementAmount; i++) {
            fixedSizeList.add(colorArr[i]);
        }
        CollectionHelper.printCollection(fixedSizeList, "\nList \"fixedSizeList\"");

        fixedSizeList.ensureCapacity(fixedSizeList.size() + elementAmount);

        for (int i=0; i<elementAmount; i++) {
            fixedSizeList.add(colorArr[elementAmount+i]);
        }
        CollectionHelper.printCollection(fixedSizeList, "\nList \"fixedSizeList\"");

        // Replace the second element
        System.out.println("\n\nReplacement of 1 item in \"fixedSizeList\"...");
        fixedSizeList.set(1, "\"Replacement\"");
        CollectionHelper.printCollection(fixedSizeList, "List \"fixedSizeList\"");
    }
}
