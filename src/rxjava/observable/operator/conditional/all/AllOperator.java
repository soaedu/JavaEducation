package rxjava.observable.operator.conditional.all;

import io.reactivex.Flowable;

/**
 * Determine whether all items emitted by an Observable meet some criteria.
 */
public class AllOperator {
    public static void main(String[] args) {
        Flowable.range(0,10)
                .doOnNext(next -> System.out.println(next))
                .all(integer -> integer<10)
                .subscribe(success -> System.out.println("Success: "+success));
    }
}
