package rxjava.observable.operator.transforming.concat_map.example1;

import io.reactivex.Observable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * fromIterable - converts the list onto the data source with a collection inside and allows to access to its elements
 * concatMap - receives list items, handles it
 * toList - collects all the data from all data sources into one list inside one thread
 * toObservable - wraps the thread into am Observable
 */
public class MyConcatMap {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        Observable<List<Integer>> numbersObs = Observable.fromIterable(list)
            .concatMap(item -> Observable.just(updateNumber(item)))
            .toList()
            .toObservable();
        numbersObs.subscribe(System.out::println, System.out::println);
    }

    private static Integer updateNumber(Integer number) {
        return number * 10;
    }
}
