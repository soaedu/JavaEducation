package design_pattern.behavioral.observer.example2.observer.type;

import design_pattern.behavioral.observer.example2.observer.Observer;
import design_pattern.behavioral.observer.example2.Subject;

public class HexObserver extends Observer {
    public HexObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}
