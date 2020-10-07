package design_pattern.behavioral.state.example2;

import design_pattern.behavioral.state.example2.activity.Activity;

// Context
public class Human {
    private Activity state;
    public void setState(Activity state) {
        this.state = state;
    }

    public void doSomething() {
        state.doSomething(this);
    }
}
