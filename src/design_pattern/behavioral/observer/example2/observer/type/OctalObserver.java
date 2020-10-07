package design_pattern.behavioral.observer.example2.observer.type;

import design_pattern.behavioral.observer.example2.observer.Observer;
import design_pattern.behavioral.observer.example2.Subject;

public class OctalObserver extends Observer {
    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) );
    }
}
