package design_pattern.behavioral.state.example3;

import design_pattern.behavioral.state.example3.state.type.StartState;
import design_pattern.behavioral.state.example3.state.type.StopState;

public class StateMain {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());
        System.out.println("=====================================");

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
