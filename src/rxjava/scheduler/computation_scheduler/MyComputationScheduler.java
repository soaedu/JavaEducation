package rxjava.scheduler.computation_scheduler;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

import java.util.Random;

/**
 * Creates and returns a Scheduler intended for computational work.
 * Count of threads to be scheduled depends upon the CPUs present in the system.
 * One thread is allowed per CPU. Best for event-loops or callback operations.
 */
public class MyComputationScheduler {
    public static void main(String[] args) throws InterruptedException {
        Observable.just("A", "AB", "ABC")
                .flatMap(string -> getLengthWithDelay(string)
                        .doOnNext(s -> System.out.println("Processing thread: " +Thread.currentThread().getName()))
                        .subscribeOn(Schedulers.computation())
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
