package rxjava.observable.operator.combining.combine_latest.example1;

import io.reactivex.Observable;
import java_regular.interfaces.functional_interface.example1.BooleanSupplierMain;

/**
 * Can unite till 9 data sources.
 * It is useful when we want to combine few validations into one general result.
 */
public class MyCombineLatest {
    public static void main(String[] args) {
        Observable<Boolean> isLoginValid = Observable.just("test_login")
                .map(value -> value.length() >= 8);

        Observable<Boolean> isPasswordValid = Observable.just("test_password")
                .map(value -> value.length() >= 8);

        Observable.combineLatest(isLoginValid, isPasswordValid, MyCombineLatest::isDataValid)
                .subscribe(System.out::println);
    }

    private static Boolean isDataValid(Boolean isLoginValid, Boolean isPasswordValid) {
        return isLoginValid && isPasswordValid;
    }
}
