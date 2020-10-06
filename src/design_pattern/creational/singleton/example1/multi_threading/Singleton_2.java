package design_pattern.creational.singleton.example1.multi_threading;

public class Singleton_2 {
    public static int counter = 0;
    private static Singleton_2 instance = null;

    private Singleton_2() {
        counter++;
    }

    public static synchronized Singleton_2 getInstance() {
        if (instance == null) {
            instance = new Singleton_2();
        }
        return instance;
    }
}
