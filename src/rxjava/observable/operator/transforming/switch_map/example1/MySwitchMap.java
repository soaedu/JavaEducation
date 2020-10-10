package rxjava.observable.operator.transforming.switch_map.example1;

import io.reactivex.Observable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Will return only last actual list, not all results of the search
 */
public class MySwitchMap {
    public static void main(String[] args) {
        Observable<List<String>> searchResult = Observable.just("search_query")
            .switchMap(query -> Observable.just(searchProduct(query)));
        searchResult.subscribe(System.out::println);
    }

    private static List<String> searchProduct(String query) {
        // in real life search in db or send network request
        return new ArrayList(Collections.singleton("Product1"));
    }
}
