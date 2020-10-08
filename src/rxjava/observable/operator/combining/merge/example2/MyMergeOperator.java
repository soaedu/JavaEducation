package rxjava.observable.operator.combining.merge.example2;

import io.reactivex.Observable;

/**
 * Combines multiple Observables into one. Any onError notifications passed from any of the source observables will
 * immediately be passed through to through to the observers and will terminate the merged Observable.
 *
 * https://github.com/ReactiveX/RxJava/wiki/Combining-Observables#merge
 */
public class MyMergeOperator {
    public static void main(String[] args) {
        Observable.just(1, 2, 3)
                .mergeWith(Observable.just(4, 5, 6))
                .subscribe(System.out::println);
    }
}
