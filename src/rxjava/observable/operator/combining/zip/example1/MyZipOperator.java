package rxjava.observable.operator.combining.zip.example1;

import io.reactivex.Observable;
import org.testng.internal.collections.Pair;

/**
 * Working with a few threads at the same time.
 * Thread works inside it no touching and influencing one to another.
 */
public class MyZipOperator {
    public static void main(String[] args) {
        Observable<String> products = Observable.just("Bread", "Milk", "Cucumber");
        Observable<Integer> weight = Observable.just(1, 2, 3);

        Observable.zip(products, weight, Pair::new)
                .subscribe(pair -> System.out.println("Product: " +
                        "\n\tname: " +pair.first()+
                        "\n\tweight: " +pair.second()));
    }
}
