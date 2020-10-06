package design_pattern.behavioral.observer.example1.observable;

import design_pattern.behavioral.observer.example1.observer.Observer;

// Observable
public interface Observed {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
