package rxjava.scheduler.trampoline_scheduler;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

import java.util.Random;

/**
 * Creates and returns a Scheduler that queues work on the current thread to be executed after the
 * current work completes.
 */
public class MyTrampolineScheduler {
    public static void main(String[] args) throws InterruptedException {
        Observable.just("A", "AB", "ABC")
                .flatMap(string -> getLengthWithDelay(string)
                    .doOnNext(s -> System.out.println("Processing thread: " +Thread.currentThread().getName()))
                    .subscribeOn(Schedulers.trampoline())
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
