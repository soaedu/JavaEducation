package rxjava.observable.operator.transforming;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

import java.util.concurrent.TimeUnit;

/**
 * Windowing operator works similar to buffer operator but it allows to gather items emitted by an Observable
 * into another observable instead of collection and emit those Observables instead of collections.
 *
 * In the example below, we've created an Observable to emit 9 items and using window operator, 3 Observable will be
 * emitted together.
 */
public class WindowOperator {
    public static void main(String[] args) throws InterruptedException {
        Observable<Integer> observable = Observable.just(1,2,3,4,5,6,7,8,9);

        observable.subscribeOn(Schedulers.io())
                .delay(2, TimeUnit.SECONDS, Schedulers.io())
                .window(3)
                .subscribe(new Observer<Observable<Integer>>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable disposable) {
                        System.out.println("Subscribed");
                    }

                    @Override
                    public void onNext(@NonNull Observable<Integer> integers) {
                        System.out.println("onNext: ");
                        integers.subscribe(value -> System.out.println("\titem: " +value));
                    }

                    @Override
                    public void onError(@NonNull Throwable throwable) {
                        System.out.println("Error");
                    }

                    @Override
                    public void onComplete() {
                        System.out.println("Done! ");
                    }
                });
        Thread.sleep(3000);
    }
}
