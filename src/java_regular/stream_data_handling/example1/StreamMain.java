package java_regular.stream_data_handling.example1;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class StreamMain {
    static List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
    static List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
    static List<Integer> integers = Arrays.asList(1,2,13,4,15,6,17,8,19);
    static Random random = new Random();

    public static void main(String[] args) {
        // Data handling with JAVA 7
        System.out.println("Using Java 7: ");
        Java7HandleData.handleData(strings, numbers, integers, random);

        // Data handling with JAVA 8
        System.out.println("\n\nUsing Java 8: ");
        Java8HandleData.handleData(strings, numbers, integers, random);
    }
}
