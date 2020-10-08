package rxjava.observable.operator.creating;

import io.reactivex.Observable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Signals the items from a java.lang.Iterable source (such as Lists, Sets or Collections or custom Iterables) and
 * then completes the sequence.
 *
 * https://github.com/ReactiveX/RxJava/wiki/Creating-Observables#from
 */
public class ObservableFromIterable {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        Observable<Integer> observable = Observable.fromIterable(list);

        observable.subscribe(
                item -> System.out.println(item),
                error -> error.printStackTrace(),
                () -> System.out.println("Done")
        );
    }
}
