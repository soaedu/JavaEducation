package java_regular.stream_data_handling.example1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Java7HandleData {
    public static void handleData(List<String> strings, List<Integer> numbers, List<Integer> integers,
                                  Random random) {
        System.out.println("List: " +strings);

        long count = getCountEmptyString(strings);
        System.out.println("\n\tEmpty Strings: " + count);

        int stringLength = 3;
        count = Java7HandleData.getCountLength3(strings);
        System.out.println("\n\tStrings of length " +stringLength+ " : " + count);

        // Eliminate empty string
        List<String> filtered = deleteEmptyStrings(strings);
        System.out.println("\n\tFiltered List: " + filtered);

        // Eliminate empty string and join using comma.
        String mergedString = getMergedString(strings,", ");
        System.out.println("\n\tMerged String: " + mergedString);

        // get list of square of distinct numbers
        List<Integer> squaresList = getSquares(numbers);
        System.out.println("\n\tSquares List: " + squaresList);
        System.out.println("\tList: " +integers);

        System.out.println("\n\tHighest number in List : " + getMax(integers));
        System.out.println("\tLowest number in List : " + getMin(integers));
        System.out.println("\tSum of all numbers : " + getSum(integers));
        System.out.println("\tAverage of all numbers : " + getAverage(integers));
        System.out.println("\tRandom Numbers: ");

        // print ten random numbers
        for(int i = 0; i < 10; i++) {
            System.out.println("\t\t number: " +random.nextInt());
        }
    }

    private static long getCountEmptyString(List<String> strings) {
        int count = 0;

        for(String string: strings) {

            if(string.isEmpty()) {
                count++;
            }
        }
        return count;
    }

    private static long getCountLength3(List<String> strings) {
        int count = 0;

        for(String string: strings) {

            if(string.length() == 3) {
                count++;
            }
        }
        return count;
    }

    private static List<String> deleteEmptyStrings(List<String> strings) {
        List<String> filteredList = new ArrayList<>();

        for(String string: strings) {

            if(!string.isEmpty()) {
                filteredList.add(string);
            }
        }
        return filteredList;
    }

    private static String getMergedString(List<String> strings, String separator) {
        StringBuilder stringBuilder = new StringBuilder();

        for(String string: strings) {

            if(!string.isEmpty()) {
                stringBuilder.append(string);
                stringBuilder.append(separator);
            }
        }
        String mergedString = stringBuilder.toString();
        return mergedString.substring(0, mergedString.length()-2);
    }

    private static List<Integer> getSquares(List<Integer> numbers) {
        List<Integer> squaresList = new ArrayList<Integer>();

        for(Integer number: numbers) {
            Integer square = new Integer(number.intValue() * number.intValue());

            if(!squaresList.contains(square)) {
                squaresList.add(square);
            }
        }
        return squaresList;
    }

    private static int getMax(List<Integer> numbers) {
        int max = numbers.get(0);

        for(int i = 1;i < numbers.size();i++) {

            Integer number = numbers.get(i);

            if(number.intValue() > max) {
                max = number.intValue();
            }
        }
        return max;
    }

    private static int getMin(List<Integer> numbers) {
        int min = numbers.get(0);

        for(int i= 1;i < numbers.size();i++) {
            Integer number = numbers.get(i);

            if(number.intValue() < min) {
                min = number.intValue();
            }
        }
        return min;
    }

    private static int getSum(List numbers) {
        int sum = (int)(numbers.get(0));

        for(int i = 1;i < numbers.size();i++) {
            sum += (int)numbers.get(i);
        }
        return sum;
    }

    private static int getAverage(List<Integer> numbers) {
        return getSum(numbers) / numbers.size();
    }
}
