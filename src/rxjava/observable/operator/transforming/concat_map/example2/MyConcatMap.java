package rxjava.observable.operator.transforming.concat_map.example2;

import io.reactivex.Observable;
import java.util.concurrent.TimeUnit;

/**
 * Applies the given io.reactivex.functions.Function to each item emitted by a reactive source, where that function
 * returns a reactive source, and emits the items that result from concatenating the results of these function
 * applications.
 *
 * https://github.com/ReactiveX/RxJava/wiki/Transforming-Observables#concatmap
 */
public class MyConcatMap {
    public static void main(String[] args) {
        Observable.range(0, 5)
                .concatMap(i -> {
                    long delay = Math.round(Math.random() * 2);
                    return Observable.timer(delay, TimeUnit.SECONDS).map(n -> i);
                })
                .blockingSubscribe(System.out::print);
    }
}
