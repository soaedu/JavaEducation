package rxjava.observable.operator.connectable;

import io.reactivex.Observable;
import io.reactivex.observables.ConnectableObservable;

/**
 * publish - Converts an Observable to connectable Observable.
 * connect - Instruct a connectable Observable to emit items to its subscribers.
 */
public class MyConnectableObservable {
    public static void main(String[] args) {
        String[] letters = {"a", "b", "c", "d", "e", "f", "g"};

        StringBuilder stringBuilder = new StringBuilder();

        ConnectableObservable connectableObservable = Observable.fromArray(letters).publish();
        connectableObservable.subscribe(stringBuilder::append);

        // connection has not been performed yet, so no items are emitted
        System.out.println(stringBuilder.length());

        // connection has been performed
        connectableObservable.connect();
        System.out.println(stringBuilder.length());

        System.out.println(stringBuilder.toString());
    }
}
