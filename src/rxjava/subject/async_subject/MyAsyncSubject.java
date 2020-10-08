package rxjava.subject.async_subject;

import io.reactivex.subjects.AsyncSubject;

/**
 * Emits the only last value followed by a completion event or the received error to Observers.
 */
public class MyAsyncSubject {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();

        AsyncSubject<Integer> asyncSubject = AsyncSubject.create();
        asyncSubject.subscribe(stringBuilder1::append);
        asyncSubject.onNext(1);
        asyncSubject.onNext(2);
        asyncSubject.onNext(3);
        asyncSubject.subscribe(stringBuilder2::append);
        asyncSubject.onNext(4);
        asyncSubject.onNext(5);
        asyncSubject.onComplete();

        // Output will be: stringBuilder1: 5
        System.out.println("stringBuilder1: " +stringBuilder1);

        // Output will be: stringBuilder2: 5
        System.out.println("stringBuilder2: " +stringBuilder2);
    }
}
