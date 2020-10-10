package rxjava.observable.operator.conditional.default_if_empty.example1;

import io.reactivex.Observable;

/**
 * Emits default item if Observable do not emit anything.
 */
public class DefaultIfEmptyOperator {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        Observable.empty()
                .defaultIfEmpty("No data")
                .subscribe(stringBuilder::append);

        System.out.println(stringBuilder.toString());
    }
}
