package java_regular.syntax.method.method_reference;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceMain {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Red");
        names.add("Green");
        names.add("Blue");
        names.add("White");
        names.add("Black");

        names.forEach(System.out::println);
    }
}
