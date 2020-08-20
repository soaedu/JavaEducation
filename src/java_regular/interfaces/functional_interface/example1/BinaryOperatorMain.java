package java_regular.interfaces.functional_interface.example1;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorMain {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;

        // takes two Integers and returns an Integer
        BinaryOperator<Integer> binaryOperatorAddition = (x1, x2) -> x1 + x2;
        Integer binaryOperatorAdditionResult = binaryOperatorAddition.apply(a, b);
        System.out.println("BinaryOperator: " +a+ " + " +b+ " = " +binaryOperatorAdditionResult);

        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer result = math(Arrays.asList(numbers), 0, binaryOperatorAddition);
        System.out.println(result); // 55

        Integer result2 = math(Arrays.asList(numbers), 0, Integer::sum);
        System.out.println(result2); // 55
    }

    public static <T> T math(List<T> list, T init, BinaryOperator<T> accumulator) {
        T result = init;
        for (T t : list) {
            result = accumulator.apply(result, t);
        }
        return result;
    }
}
