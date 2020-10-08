package rxjava.subject.behavior_subject;

import io.reactivex.subjects.BehaviorSubject;

/**
 * Emits the most recent item it has observed and then all subsequent observed items to each
 * subscribed Observer.
 */
public class MyBehaviorSubject {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();

        BehaviorSubject<Integer> behaviorSubject = BehaviorSubject.create();
        behaviorSubject.subscribe(stringBuilder1::append);
        behaviorSubject.onNext(1);
        behaviorSubject.onNext(2);
        behaviorSubject.onNext(3);
        behaviorSubject.subscribe(stringBuilder2::append);
        behaviorSubject.onNext(4);
        behaviorSubject.onNext(5);
        behaviorSubject.onComplete();

        // Output will be: stringBuilder1: 12345
        System.out.println("stringBuilder1: " +stringBuilder1);

        // Output will be: stringBuilder2: 345
        System.out.println("stringBuilder2: " +stringBuilder2);
    }
}
