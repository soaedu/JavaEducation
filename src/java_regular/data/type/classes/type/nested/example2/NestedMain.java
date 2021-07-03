package java_regular.data.type.classes.type.nested.example2;

public class NestedMain {
    public static void main(String[] args) {
        Button button = new Button();
        State state = button.getCurrentState();
        button.restoreState(state);
    }
}
