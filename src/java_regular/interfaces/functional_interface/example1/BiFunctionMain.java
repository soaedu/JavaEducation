package java_regular.interfaces.functional_interface.example1;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionMain {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;

        // takes two Integers and returns an Integer
        BiFunction<Integer, Integer, Integer> biFunctionAddition = (x1, x2) -> x1 + x2;
        Integer biFunctionAdditionIntResult = biFunctionAddition.apply(a, b);
        System.out.println("BiFunction: " +a+ " + " +b+ " = " +biFunctionAdditionIntResult);

        // take two Integers and return an Double
        BiFunction<Integer, Integer, Double> biFunctionPow = (x1, x2) -> Math.pow(x1, x2);
        Double biFunctionPowDoubleResult = biFunctionPow.apply(a, b);
        System.out.println("BiFunction: Math.pow(" +a+ ", " +b+ ") = " +biFunctionPowDoubleResult);

        // take two Integers and return a List<Integer>
        BiFunction<Integer, Integer, List<Integer>> biFunctionList = (x1, x2) -> Arrays.asList(x1 + x2);
        List<Integer> biFunctionListResult = biFunctionList.apply(a, b);
        System.out.println("BiFunction: List of(" +a+ ", " +b+ ") = " +biFunctionListResult);
    }
}
