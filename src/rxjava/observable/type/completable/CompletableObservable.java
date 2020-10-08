package rxjava.observable.type.completable;

import io.reactivex.Completable;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableCompletableObserver;
import io.reactivex.schedulers.Schedulers;

import java.util.concurrent.TimeUnit;

public class CompletableObservable {
    public static void main(String[] args) throws InterruptedException {
        Disposable disposable = Completable.complete()
                .delay(2, TimeUnit.SECONDS, Schedulers.io())
                .subscribeWith(new DisposableCompletableObserver() {
                    @Override
                    protected void onStart() {
                        super.onStart();
                        System.out.println("Completable started");
                    }

                    @Override
                    public void onComplete() {
                        System.out.println("Completable completed");
                    }

                    @Override
                    public void onError(@NonNull Throwable throwable) {
                        throwable.printStackTrace();
                    }
                });

        Thread.sleep(3000);

        //start observing
        disposable.dispose();
    }
}
