package design_pattern.behavioral.observer.example2.observer.type;

import design_pattern.behavioral.observer.example2.observer.Observer;
import design_pattern.behavioral.observer.example2.Subject;

public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) );
    }
}
