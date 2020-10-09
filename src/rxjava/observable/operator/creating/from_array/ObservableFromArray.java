package rxjava.observable.operator.creating.from_array;

import io.reactivex.Observable;

import java.util.ArrayList;
import java.util.List;

/**
 * Converts an object/data structure into an Observable.
 */
public class ObservableFromArray {
    public static void main(String[] args) {
        // #1
        // String[] letters = {"a", "b", "c", "d", "e", "f", "g"};

        // #2
        List<String> letters = new ArrayList<>();
        letters.add("S");
        letters.add("O");
        letters.add("S");

        Observable.fromArray(letters)
                .subscribe(System.out::println);
    }
}
