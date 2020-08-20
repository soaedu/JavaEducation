package java_regular.stream_data_handling.example1;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;

public class Java8HandleData {
    public static void handleData(List<String> strings, List<Integer> numbers, List<Integer> integers,
                                  Random random) {
        System.out.println("List: " +strings);

        long count = strings.stream().filter(string->string.isEmpty()).count();
        System.out.println("\n\tEmpty Strings: " + count);

        int stringLength = 3;
        count = strings.stream().filter(string -> string.length() == stringLength).count();
        System.out.println("\n\tStrings of length " +stringLength+ " : " + count);

        List<String> filtered = strings.stream().filter(string ->!string.isEmpty()).collect(Collectors.toList());
        System.out.println("\n\tFiltered List: " + filtered);

        String mergedString = strings.stream().filter(string ->!string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("\n\tMerged String: " + mergedString);

        List<Integer> squaresList = numbers.stream().map( i ->i*i).distinct().collect(Collectors.toList());
        System.out.println("\n\tSquares List: " + squaresList);
        System.out.println("\tList: " +integers);

        IntSummaryStatistics stats = integers.stream().mapToInt((x) ->x).summaryStatistics();

        System.out.println("\n\tHighest number in List : " + stats.getMax());
        System.out.println("\tLowest number in List : " + stats.getMin());
        System.out.println("\tSum of all numbers : " + stats.getSum());
        System.out.println("\tAverage of all numbers : " + stats.getAverage());
        System.out.println("\tRandom Numbers: ");
        IntConsumer intConsumer = (x) -> System.out.println("\t\t number: " +x);
        // random.ints().limit(10).sorted().forEach(System.out::println);
        random.ints().limit(10).sorted().forEach(intConsumer);

        // parallel processing
        // count = strings.parallelStream().filter(string -> string.isEmpty()).count();
        count = strings.parallelStream().filter(String::isEmpty).count();
        System.out.println("\n\tEmpty Strings (parallel processing): " + count);
    }
}
