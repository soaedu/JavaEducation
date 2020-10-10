package rxjava.observable.operator.transforming.map.example2;

import io.reactivex.Observable;

/**
 * Changes the type of the data source or the data itself.
 * Is useful for fields validation.
 */
public class MapOperator {
    public static void main(String[] args) {
        String password = "length++";

        Observable<Boolean> observable = Observable.just(password)
            .map(string -> string.length() >= 8);

        observable.subscribe(result -> System.out.println("Password length >= 8: " +result));
    }
}
