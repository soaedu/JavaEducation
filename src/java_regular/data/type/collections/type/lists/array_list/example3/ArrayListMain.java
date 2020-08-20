package java_regular.data.type.collections.type.lists.array_list.example3;

import Utils.CollectionHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListMain {
    public static void main(String[] args) {
        String[] colorArr = new String[]{"Red", "Orange", "Yellow", "Green", "LightBlue", "Blue", "Magenta"};

        // #1
        /*List<String> colors = new ArrayList<>();
        colors.addAll(Arrays.asList(colorArr));*/

        // #2
        List<String> colors = new ArrayList<>(Arrays.asList(colorArr));
        CollectionHelper.printCollection(colors, "List of colors");

        // subList()
        System.out.println("\n\nPortion of the list: " +colors.subList(2, 5));

        Scanner reader = new Scanner(System.in);
        int colorIndex = -1;
        int colorsSize = colors.size();

        // #1 - get()
        do {
            System.out.println("\n\nSpecify integer value from 1 to " + colorsSize + " to get a color from colors list");
            int userInput = reader.nextInt();

            if (userInput > 0 && userInput <= colorsSize) {
                colorIndex = (userInput - 1);
            }
        }
        while (colorIndex == -1);

        if (colorIndex > -1) {
            System.out.println("Receiving element: " +(colorIndex+1)+ ": " +colors.get(colorIndex));
        }

        // #2 - indexOf()
        colorIndex = -1;

        do {
            System.out.println("\n\nSpecify color name to find in colors list");
            String userInput = reader.next();

            if (!userInput.isEmpty()) {
                colorIndex = colors.indexOf(userInput);
            }
        }
        while (colorIndex == -1);

        String message = (colorIndex > -1 ? "Specified color is found at position: " +(colorIndex+1):
                "Specified color is not found");
        System.out.println(message);
    }
}
