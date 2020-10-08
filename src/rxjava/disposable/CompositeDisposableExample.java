package rxjava.disposable;

import io.reactivex.Completable;
import io.reactivex.Single;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableCompletableObserver;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

import java.util.concurrent.TimeUnit;

public class CompositeDisposableExample {
    public static void main(String[] args) throws InterruptedException {
        //Create an Single observer
        Disposable singleDisposable = Single.just("Hi Completable!")
                .delay(3, TimeUnit.SECONDS, Schedulers.io())
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

        Disposable completableDisposable = Completable.complete()
                .delay(5, TimeUnit.SECONDS, Schedulers.io())
                .subscribeWith(new DisposableCompletableObserver() {
                    @Override
                    protected void onStart() {
                        super.onStart();
                        System.out.println("Hello Single!");
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

        CompositeDisposable compositeDisposable = new CompositeDisposable();
        compositeDisposable.add(singleDisposable);
        compositeDisposable.add(completableDisposable);

        //start observing
        compositeDisposable.dispose();
    }
}
