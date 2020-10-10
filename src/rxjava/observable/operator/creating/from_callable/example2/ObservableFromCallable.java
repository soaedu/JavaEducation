package rxjava.observable.operator.creating.from_callable.example2;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class ObservableFromCallable {
    public static void main(String[] args) {
        String value = "5";

//        Observable observable = Observable.fromCallable(new CallableLongAction(value))
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread());
//        observable.subscribe(System.out::println);
    }

    static class CallableLongAction implements Callable<Integer> {
        private final String data;

        public CallableLongAction(String data) {
            this.data = data;
        }

        @Override
        public Integer call() throws Exception {
            return longAction(data);
        }

        private int longAction(String text) {
            System.out.println("longAction");

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return Integer.parseInt(text);
        }
    }
}
