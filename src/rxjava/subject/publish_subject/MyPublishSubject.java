package rxjava.subject.publish_subject;

import io.reactivex.subjects.PublishSubject;

/**
 * Emits items to currently subscribed Observers and terminal events to current or late Observers.
 */
public class MyPublishSubject {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();

        PublishSubject<Integer> publishSubject = PublishSubject.create();
        publishSubject.subscribe(stringBuilder1::append);
        publishSubject.onNext(1);
        publishSubject.onNext(2);
        publishSubject.onNext(3);
        publishSubject.subscribe(stringBuilder2::append);
        publishSubject.onNext(4);
        publishSubject.onNext(5);
        publishSubject.onComplete();

        //Output will be: stringBuilder1: 12345
        System.out.println("stringBuilder1: " +stringBuilder1);

        //Output will be: stringBuilder2: 45
        System.out.println("stringBuilder2: " +stringBuilder2);
    }
}
