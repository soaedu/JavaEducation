package rxjava.observable.operator.transforming.switch_map.example2;

import io.reactivex.Observable;
import java.util.concurrent.TimeUnit;

/**
 * Applies the given io.reactivex.functions.Function to each item emitted by a reactive source, where that
 * function returns a reactive source, and emits the items emitted by the most recently projected of these
 * reactive sources.
 *
 * https://github.com/ReactiveX/RxJava/wiki/Transforming-Observables#switchmap
 */
public class MySwitchMap {
    public static void main(String[] args) {
        Observable.interval(0, 1, TimeUnit.SECONDS)
                .switchMap(x -> {
                    return Observable.interval(0, 750, TimeUnit.MILLISECONDS)
                            .map(y -> x);
                })
                .takeWhile(x -> x < 3)
                .blockingSubscribe(System.out::print);
    }
}
