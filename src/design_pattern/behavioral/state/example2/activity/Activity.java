package design_pattern.behavioral.state.example2.activity;

import design_pattern.behavioral.state.example2.Human;

// State
public interface Activity {
    void doSomething(Human context);
}
