package design_pattern.behavioral.state.example2;

import design_pattern.behavioral.state.example2.activity.type.Work;

public class StateMain {
    public static void main(String[] args) {
        Human human = new Human();
        human.setState(new Work());
        for (int i=0; i<10; i++) {
            human.doSomething();
        }
    }
}
