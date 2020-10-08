package rxjava.observable.operator.transforming;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

import java.util.List;

/**
 * Buffering operator allows to gather items emitted by an Observable into a list or bundles and emit those
 * bundles instead of items.
 *
 * In the example below, we've created an Observable to emit 9 items and using buffering, 3 items will be
 * emitted together.
 */
public class BufferOperator {
    public static void main(String[] args) throws InterruptedException {
        Observable<Integer> observable = Observable.just(1,2,3,4,5,6,7,8,9);

        observable.subscribeOn(Schedulers.io())
                .buffer(3)
                .subscribe(new Observer<List<Integer>>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable disposable) {
                        System.out.println("Subscribed");
                    }

                    @Override
                    public void onNext(@NonNull List<Integer> integers) {
                        System.out.println("onNext: ");
                        for (Integer value : integers) {
                            System.out.println("\titem: " +value);
                        }
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
