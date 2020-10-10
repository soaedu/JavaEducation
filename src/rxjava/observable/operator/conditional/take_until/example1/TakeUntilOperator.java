package rxjava.observable.operator.conditional.take_until.example1;

import io.reactivex.Observable;

/**
 * Emits the items from the source Observable until a second Observable emits an item or issues a notification.
 *
 * https://github.com/ReactiveX/RxJava/wiki/Conditional-and-Boolean-Operators#takeUntil
 */
public class TakeUntilOperator {
    public static void main(String[] args) {
        Observable.range(1, 10)
                .takeUntil(value -> value >= 5)
                .subscribe(System.out::println, System.out::println, () -> System.out.println("Completed"));
    }
}
