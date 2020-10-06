package design_pattern.creational.singleton.example2;

public class Singleton {
    // create an object of SingleObject
    private static Singleton instance = new Singleton();

    // make the constructor private so that this class can't be instantiated
    private Singleton() {}

    // get the only object available
    public static Singleton getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hey Mr.Cucumber!");
    }
}
