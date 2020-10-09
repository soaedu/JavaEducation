package rxjava.observable.operator.creating.from_range;

import io.reactivex.Observable;

public class ObservableFromRange {
    public static void main(String[] args) {
        Observable.range(1, 3)
                .subscribe(System.out::println);
    }
}
