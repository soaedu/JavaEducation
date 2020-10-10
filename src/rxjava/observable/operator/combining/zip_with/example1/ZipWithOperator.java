package rxjava.observable.operator.combining.zip_with.example1;

import io.reactivex.Observable;

/**
 * Combines sets of items emitted by two or more Observables together via a specified function and emit items
 * based on the results of this function.
 *
 * https://github.com/ReactiveX/RxJava/wiki/Combining-Observables#zip
 */
public class ZipWithOperator {
    public static void main(String[] args) {
        Observable<String> firstNames = Observable.just("James", "Jean-Luc", "Benjamin");
        Observable<String> lastNames = Observable.just("Kirk", "Picard", "Sisko");
        firstNames.zipWith(lastNames, (first, last) -> first + " " + last)
                .subscribe(item -> System.out.println(item));
    }
}
