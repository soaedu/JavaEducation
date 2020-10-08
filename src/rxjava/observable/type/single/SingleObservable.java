package rxjava.observable.type.single;

import io.reactivex.Single;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

import java.util.concurrent.TimeUnit;

public class SingleObservable {
    public static void main(String[] args) throws InterruptedException {
        //Create the observable
        Single<String> single = Single.just("Hello RxJava!");

        //Create an observer
        Disposable disposable = single
                .delay(2, TimeUnit.SECONDS, Schedulers.io())
                .subscribeWith(new DisposableSingleObserver<String>() {
                    @Override
                    public void onSuccess(@NonNull String value) {
                        System.out.println(value);
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
