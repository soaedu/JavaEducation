package rxjava.observable.operator.combining.combine_latest.example2;

import io.reactivex.Observable;
import java.util.concurrent.TimeUnit;

/**
 * When an item is emitted by either of two Observables, combine the latest item emitted by each Observable via a
 * specified function and emit items based on the results of this function.
 *
 * https://github.com/ReactiveX/RxJava/wiki/Combining-Observables#combinelatest
 */
public class MyCombineLatest {
    public static void main(String[] args) {
        Observable<Long> newsRefreshes = Observable.interval(1000, TimeUnit.MILLISECONDS);
        Observable<Long> weatherRefreshes = Observable.interval(500, TimeUnit.MILLISECONDS);

        Observable.combineLatest(newsRefreshes, weatherRefreshes,
                (newsRefreshTimes, weatherRefreshTimes) ->
                        "Refreshed news " + newsRefreshTimes + " times and weather " + weatherRefreshTimes)
                .subscribe(item -> System.out.println(item));
    }
}
