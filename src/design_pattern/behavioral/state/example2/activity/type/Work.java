package design_pattern.behavioral.state.example2.activity.type;

import design_pattern.behavioral.state.example2.Human;
import design_pattern.behavioral.state.example2.activity.Activity;

public class Work implements Activity {
    @Override
    public void doSomething(Human context) {
        System.out.println("Working...");
        context.setState(new WeekEnd());
    }
}
