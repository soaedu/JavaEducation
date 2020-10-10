package rxjava.observable.operator.filtering.skip;

import io.reactivex.Observable;

public class SkipOperator {
    public static void main(String[] args) {
        Observable<Integer> observable = Observable.fromArray(new Integer[]{5,6,7,8,9})
                .skip(2);
        observable.subscribe(System.out::println);
    }
}
