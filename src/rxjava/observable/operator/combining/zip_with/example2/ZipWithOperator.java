package rxjava.observable.operator.combining.zip_with.example2;

import io.reactivex.Observable;

public class ZipWithOperator {
    public static void main(String[] args) {
        Observable<String> observable = Observable.fromArray(new String[]{"One", "Two", "Three"});

        Observable<String> observableResult = Observable.fromArray(new Integer[]{1,2,3})
                .zipWith(observable, (integer, string) -> string + ": " +integer);
        observableResult.subscribe(System.out::println);
    }
}
