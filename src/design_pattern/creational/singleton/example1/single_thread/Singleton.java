package design_pattern.creational.singleton.example1.single_thread;

public class Singleton {
    private static Singleton instance;
    public static int counter = 0;

    private Singleton() {
        counter++;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
