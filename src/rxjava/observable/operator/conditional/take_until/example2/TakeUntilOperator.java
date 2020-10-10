package rxjava.observable.operator.conditional.take_until.example2;

import io.reactivex.Observable;

public class TakeUntilOperator {
    public static void main(String[] args) {
        Observable<Integer> observable = Observable.fromArray(new Integer[]{1,2,3,4,5,6,7,8})
                    .takeUntil(integer -> integer == 2);
            observable.subscribe(System.out::println);
    }
}
