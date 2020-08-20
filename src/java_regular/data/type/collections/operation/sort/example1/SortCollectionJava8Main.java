package java_regular.data.type.collections.operation.sort.example1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortCollectionJava8Main {
    public static void main(String[] args) {
        String[] arr = {"Red", "Green", "Blue", "White", "Yellow"};
        List<String> colors1 = new ArrayList<>();
        List<String> colors2 = new ArrayList<>();

        for (String str: arr) {
            colors1.add(str);
            colors2.add(str);
        }

        SortCollectionJava8Main tester = new SortCollectionJava8Main();
        System.out.println("\nSort using Java 7 java_regular.syntax: ");
        tester.sortUsingJava7(colors1);
        System.out.println(colors1);

        System.out.println("\nSort using Java 8 java_regular.syntax: ");
        tester.sortUsingJava8(colors2);
        System.out.println(colors2);
    }

    //sort using java 7
    private void sortUsingJava7(List<String> colorList) {
        colorList.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
    }

    //sort using java 8
    private void sortUsingJava8(List<String> colorList) {
        colorList.sort((s1, s2) -> s1.compareTo(s2));
    }
}
