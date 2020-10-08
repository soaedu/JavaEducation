package rxjava.scheduler.schedulers_from_executors;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

import java.util.Random;
import java.util.concurrent.Executors;

/**
 * Schedulers.from(Executor) method converts an Executor into a new Scheduler instance.
 */
public class MySchedulersFromExecutors {
    public static void main(String[] args) throws InterruptedException {
        Observable.just("A", "AB", "ABC")
                .flatMap(string -> getLengthWithDelay(string)
                        .doOnNext(s -> System.out.println("Processing thread: " +Thread.currentThread().getName()))
                        .subscribeOn(Schedulers.from(Executors.newFixedThreadPool(3)))
                )
                .subscribe(length -> System.out.println("Receiver thread: " +Thread.currentThread().getName() +
                        ", item length: " +length));

        Thread.sleep(10000);
    }

    protected static Observable<Integer> getLengthWithDelay(String value) {
        Random random = new Random();

        try {
            Thread.sleep(random.nextInt(3) * 1000);
            return Observable.just(value.length());
        } catch(InterruptedException ex) {
            ex.printStackTrace();
        }

        return null;
    }
}
