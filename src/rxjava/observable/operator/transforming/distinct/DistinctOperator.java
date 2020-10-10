package rxjava.observable.operator.transforming.distinct;

import io.reactivex.Observable;

public class DistinctOperator {
    public static void main(String[] args) {
        Observable<Integer> observable = Observable.fromArray(new Integer[]{5,9,7,5,8,6,7,8,9})
                .distinct();
        observable.subscribe(System.out::println);
    }
}
