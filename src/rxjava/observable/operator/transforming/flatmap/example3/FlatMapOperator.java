package rxjava.observable.operator.transforming.flatmap.example3;

import io.reactivex.Observable;

/**
 * Changes the type of the data source or the data itself.
 * Handles transformation in the separate thread.
 */
public class FlatMapOperator {
    public static void main(String[] args) {
        Observable.just("I am sending the sms")
                .flatMap(string -> Observable.fromArray(string.split(" ")))
                .subscribe(System.out::println);
    }
}
