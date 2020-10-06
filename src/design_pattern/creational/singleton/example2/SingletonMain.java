package design_pattern.creational.singleton.example2;

public class SingletonMain {
    public static void main(String[] args) {
        // illegal construct
        // Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        // Get the only object available
        Singleton object = Singleton.getInstance();

        // show the message
        object.showMessage();
    }
}
