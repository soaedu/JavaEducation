package rxjava.observable.operator.transforming.map.example3;

import io.reactivex.Observable;

/**
 * Changes the type of the data source or the data itself.
 * Is useful for fields validation.
 */
public class MapOperator {
    public static void main(String[] args) {
        Observable<Integer> observable = Observable.fromArray(new String[]{"1", "2", "3", "4", "5", "6"})
                .map(number -> { return Integer.parseInt(number); });
        observable.subscribe(System.out::println);

        String password = "length++";
    }
}
