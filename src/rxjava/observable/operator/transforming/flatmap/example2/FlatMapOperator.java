package rxjava.observable.operator.transforming.flatmap.example2;

import io.reactivex.Observable;
import java.util.concurrent.TimeUnit;

/**
 * Applies the given io.reactivex.functions.Function to each item emitted by a reactive source, where that
 * function returns a reactive source, and emits the items that result from merging the results of these
 * function applications.
 *
 * https://github.com/ReactiveX/RxJava/wiki/Transforming-Observables#flatmap
 */
public class FlatMapOperator {
    public static void main(String[] args) {
        Observable.just("A", "B", "C")
            .flatMap(a -> {
                return Observable.intervalRange(1, 3, 0, 1, TimeUnit.SECONDS)
                        .map(b -> '(' + a + ", " + b + ')');
                })
                .blockingSubscribe(System.out::println);
    }
}
