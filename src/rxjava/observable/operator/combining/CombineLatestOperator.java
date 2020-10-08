package rxjava.observable.operator.combining;

import io.reactivex.Observable;

/**
 * Combine the latest item emitted by each Observable via a specified function and emit resulted item.
 */
public class CombineLatestOperator {
    public static void main(String[] args) {
        Integer[] numbers = {1,2,3,4,5,6,7};
        String[] letters = {"a", "b", "c", "d", "e", "f", "g"};

        StringBuilder stringBuilder = new StringBuilder();

        Observable<String> lettersObs = Observable.fromArray(letters);
        Observable<Integer> numbersObs = Observable.fromArray(numbers);
        Observable.combineLatest(numbersObs, lettersObs, (number, letter) -> letter + number)
                .subscribe(stringBuilder::append);

        System.out.println(stringBuilder.toString());
    }
}
