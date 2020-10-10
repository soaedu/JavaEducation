package rxjava.observable.operator.filtering.filter;

import io.reactivex.Observable;

public class FilterOperator {
    public static void main(String[] args) {
        Observable<String> observable = Observable.fromArray(new String[]{"15", "27", "34", "46", "52", "63"})
                .filter(value -> {return value.contains("5");});
        observable.subscribe(System.out::println);
    }
}
