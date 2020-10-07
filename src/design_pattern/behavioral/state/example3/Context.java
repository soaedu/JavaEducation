package design_pattern.behavioral.state.example3;

import design_pattern.behavioral.state.example3.state.State;

// Context
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
