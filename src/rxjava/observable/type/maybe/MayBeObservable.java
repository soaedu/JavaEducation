package rxjava.observable.type.maybe;

import io.reactivex.Maybe;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableMaybeObserver;
import io.reactivex.schedulers.Schedulers;

import java.util.concurrent.TimeUnit;

public class MayBeObservable {
    public static void main(String[] args) throws InterruptedException {
        //Create an observer
        Disposable disposable = Maybe.just("MayBe Observable")
                .delay(2, TimeUnit.SECONDS, Schedulers.io())
                .subscribeWith(new DisposableMaybeObserver<String>() {
                                   @Override
                                   public void onSuccess(@NonNull String value) {
                                       System.out.println(value);
                                   }

                                   @Override
                                   public void onError(@NonNull Throwable throwable) {
                                       throwable.printStackTrace();
                                   }

                                   @Override
                                   public void onComplete() {
                                       System.out.println("MayBe Completed");
                                   }
                               }
                );
        Thread.sleep(3000);

        //start observing
        disposable.dispose();
    }
}
