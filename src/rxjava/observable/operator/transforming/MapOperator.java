package rxjava.observable.operator.transforming;

import io.reactivex.Observable;

/**
 * Apply a function to each emitted item to transform it.
 */
public class MapOperator {
    public static void main(String[] args) {
        String[] letters = {"a", "b", "c", "d", "e", "f", "g"};
        StringBuilder stringBuilder = new StringBuilder();

        Observable<String> observable = Observable.fromArray(letters);
        observable.map(String::toUpperCase)
                .subscribe(stringBuilder::append);

        System.out.println(stringBuilder.toString());
    }
}
