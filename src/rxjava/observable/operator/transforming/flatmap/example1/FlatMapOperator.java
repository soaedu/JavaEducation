package rxjava.observable.operator.transforming.flatmap.example1;

import io.reactivex.Observable;

import java.util.ArrayList;
import java.util.List;

/**
 * Changes the type of the data source or the data itself.
 * Handles transformation in the separate thread.
 */
public class FlatMapOperator {
    public static void main(String[] args) {
        List<String> letters = new ArrayList<>();
        letters.add("S");
        letters.add("O");
        letters.add("S");

        Observable<List<String>> lettersObs = Observable.just(letters)
                .flatMap(items -> Observable.just(getTransformedLetters(items)));
        lettersObs.subscribe(System.out::println, System.out::println);
    }

    protected static List<String> getTransformedLetters(List letters) {
        List<String> resultList = new ArrayList<>(); // (letters.size());

        for (int i=0; i<letters.size(); i++) {
            resultList.add(letters.get(i) + "-" + i);
        }

        return resultList;
    }
}
