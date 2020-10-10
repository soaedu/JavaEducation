package rxjava.observable.operator.creating.from_emitter;

import io.reactivex.Observable;

import java.util.ArrayList;
import java.util.List;

public class ObservableFromEmitter {
    public static void main(String[] args) {
        printThreeItemsFromEmitter();
    }

    public static void printThreeItemsFromEmitter() {
        List<String> letters = new ArrayList<>();
        letters.add("S");
        letters.add("O");
        letters.add("S");

        Observable.create(emitter -> {
            emitter.onNext(letters);
            emitter.onComplete();
        }).subscribe(System.out::println);
    }
}
