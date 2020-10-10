package rxjava.observable.operator.combining.merge_with;

import io.reactivex.Observable;

public class MergeWithOperator {
    public static void main(String[] args) {
        Observable<Integer> observable = Observable.fromArray(new Integer[]{6,7,8,9});

        Observable<Integer> observableResult = Observable.fromArray(new Integer[]{1,2,3})
                .mergeWith(observable);
        observableResult.subscribe(System.out::println);
    }
}
