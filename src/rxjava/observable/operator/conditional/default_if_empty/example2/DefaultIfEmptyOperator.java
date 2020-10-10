package rxjava.observable.operator.conditional.default_if_empty.example2;

import io.reactivex.Observable;

/**
 * firstElement     - Emits the first item or first item which passed the given criteria.
 * defaultIfEmpty   - Emits default item if Observable do not emit anything.
 */
public class DefaultIfEmptyOperator {
    public static void main(String[] args) {
        String[] letters = {"a", "b", "c", "d", "e", "f", "g"};
        StringBuilder stringBuilder = new StringBuilder();

        Observable.fromArray(letters)
                .firstElement()
                .defaultIfEmpty("No letter")
                .subscribe(stringBuilder::append);

        System.out.println(stringBuilder.toString());
    }
}
