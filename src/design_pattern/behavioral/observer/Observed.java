package design_pattern.behavioral.observer;

// Observable
public interface Observed {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
