package rxjava.observable.operator.creating;

import io.reactivex.Observable;

/**
 * Converts an object/data structure into an Observable.
 */
public class ObservableFromArray {
    public static void main(String[] args) {
        String[] letters = {"a", "b", "c", "d", "e", "f", "g"};

        Observable.fromArray(letters)
                .subscribe(System.out::println);
    }
}
