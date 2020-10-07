package design_pattern.behavioral.state.example3.state.type;

import design_pattern.behavioral.state.example3.Context;
import design_pattern.behavioral.state.example3.state.State;

public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
