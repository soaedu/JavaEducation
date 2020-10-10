package rxjava.observable.operator.creating.from_interval;

import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class ObservableFromInterval {
    public static void main(String[] args) {
        Observable<Long> observable = Observable.interval(500, TimeUnit.MILLISECONDS);
        observable.subscribe(System.out::println);
    }
}
