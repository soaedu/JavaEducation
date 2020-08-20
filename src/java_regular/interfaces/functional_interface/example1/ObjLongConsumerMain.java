package java_regular.interfaces.functional_interface.example1;

import java.util.Arrays;
import java.util.List;
import java.util.function.ObjLongConsumer;

/**
 * Function which takes in two arguments and produces a result.
 * However these kind of functions don’t return any value.
 *
 * Hence this "functional interface" takes in one generic namely:
 *     "T": denotes the type of the input argument to the operation
 *
 * The "lambda expression" assigned to an object of "ObjLongConsumer" type is used to define its "accept()" which
 * eventually applies the given operation on its argument.
 *
 * It takes in a "long-valued" and a "T-valued" argument and is expected to operate without any side effects.
 * It is more like using an object of type "BiConsumer<T, Long>" except the fact that one is a reference and one is a
 * primitive java_regular.data type in this case.
 *
 * Hence we will be obtaining one reference and one value when this function is called.
 */
public class ObjLongConsumerMain {
    public static void main(String[] args) {
        // accept() - accepts two values and performs the operation on the given arguments.
        List<Integer> arr = Arrays.asList(3, 2, 5, 7, 4);

        ObjLongConsumer<List<Integer> > func = (list, num) ->{
            list.stream().forEach(a -> System.out.println(a * num));
        };
        func.accept(arr, 200000);
    }
}
