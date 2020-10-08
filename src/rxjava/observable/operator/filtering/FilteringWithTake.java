package rxjava.observable.operator.filtering;

import io.reactivex.Observable;

/**
 * Takes the first n items from an Observable.
 */
public class FilteringWithTake {
    public static void main(String[] args) {
        String[] letters = {"a", "b", "c", "d", "e", "f", "g"};
        StringBuilder stringBuilder = new StringBuilder();

        Observable.fromArray(letters)
                .take(2)
                .subscribe(stringBuilder::append);

        System.out.println(stringBuilder.toString());
    }
}
