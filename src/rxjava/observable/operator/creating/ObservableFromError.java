package rxjava.observable.operator.creating;

import io.reactivex.Observable;

import java.io.IOException;

/**
 * Signal an error, either pre-existing or generated via a java.util.concurrent.Callable, to the consumer.
 * https://github.com/ReactiveX/RxJava/wiki/Creating-Observables#error
 */
public class ObservableFromError {
    public static void main(String[] args) {
        Observable<String> errorObs = Observable.error(new IOException());
        errorObs.subscribe(
                value -> System.out.println("This should never be printed!"),
                error -> error.printStackTrace(),
                () -> System.out.println("This neither!")
        );
    }
}
