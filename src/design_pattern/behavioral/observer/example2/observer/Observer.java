package design_pattern.behavioral.observer.example2.observer;

import design_pattern.behavioral.observer.example2.Subject;

// Observer
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
