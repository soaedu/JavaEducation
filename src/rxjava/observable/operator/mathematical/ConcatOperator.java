package rxjava.observable.operator.mathematical;

import io.reactivex.Observable;

/**
 * Emits all items from multiple Observable without interleaving.
 */
public class ConcatOperator {
    public static void main(String[] args) {
        Integer[] numbers = {1,2,3,4,5,6,7};
        String[] letters = {"a", "b", "c", "d", "e", "f", "g"};

        StringBuilder stringBuilder = new StringBuilder();

        Observable<String> stringObs = Observable.fromArray(letters);
        Observable<Integer> numberObs = Observable.fromArray(numbers);

        Observable.concat(numberObs, stringObs)
                .subscribe(stringBuilder::append);

        System.out.println(stringBuilder.toString());
    }
}
