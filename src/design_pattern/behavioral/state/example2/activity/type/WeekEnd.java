package design_pattern.behavioral.state.example2.activity.type;

import design_pattern.behavioral.state.example2.Human;
import design_pattern.behavioral.state.example2.activity.Activity;

public class WeekEnd implements Activity {
    private int count = 0;

    @Override
    public void doSomething(Human context) {
        if (count < 3) {
            System.out.println("Resting (Zzz)");
            count++;
            // context.setState(this);
        } else {
            context.setState(new Work());
        }
    }
}
