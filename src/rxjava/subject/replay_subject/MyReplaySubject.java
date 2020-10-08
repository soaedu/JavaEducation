package rxjava.subject.replay_subject;

import io.reactivex.subjects.ReplaySubject;

/**
 * Replays events/items to current and late Observers.
 */
public class MyReplaySubject {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();

        ReplaySubject<Integer> replaySubject = ReplaySubject.create();
        replaySubject.subscribe(stringBuilder1::append);
        replaySubject.onNext(1);
        replaySubject.onNext(2);
        replaySubject.onNext(3);
        replaySubject.subscribe(stringBuilder2::append);
        replaySubject.onNext(4);
        replaySubject.onNext(5);
        replaySubject.onComplete();

        // Output will be: stringBuilder1: 12345
        System.out.println("stringBuilder1: " +stringBuilder1);

        // Output will be: stringBuilder2: 12345
        System.out.println("stringBuilder2: " +stringBuilder2);
    }
}
