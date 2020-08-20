package java_regular.interfaces.functional_interface.example1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionMain {
    public static void main(String[] args) {
        // #1
        Function<String, Integer> func = x -> x.length();
        Integer apply = func.apply("tutorialspoint");   // 14
        System.out.println(apply);

        // #2
        FunctionMain main = new FunctionMain();
        List<String> list = Arrays.asList("node", "c++", "java", "javascript");

        // lambda
        Map<String, Integer> map = main.convertListToMap(list, x -> x.length());
        System.out.println(map);    // {node=4, c++=3, java=4, javascript=10}

        // method reference
        Map<String, Integer> map2 = main.convertListToMap(list, main::getLength);
        System.out.println(map2);
    }

    public <T, R> Map<T, R> convertListToMap(List<T> list, Function<T, R> func) {

        Map<T, R> result = new HashMap<>();
        for (T t : list) {
            result.put(t, func.apply(t));
        }
        return result;

    }

    public Integer getLength(String str) {
        return str.length();
    }
}
