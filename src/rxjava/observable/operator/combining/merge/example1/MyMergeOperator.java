package rxjava.observable.operator.combining.merge.example1;

import io.reactivex.Observable;
import org.testng.internal.collections.Pair;

/**
 * Working with a few threads uniting them to one.
 * Data types in different data sources must be the same.
 */
public class MyMergeOperator {
    public static void main(String[] args) {
        Observable<String> productsFromDB = Observable.just("Bread", "Milk", "Cucumber");
        Observable<String> productsFromRemote = Observable.just("Meat", "Ham", "Fish");

        Observable.merge(productsFromDB, productsFromRemote)
                .subscribe(System.out::println);
    }
}
