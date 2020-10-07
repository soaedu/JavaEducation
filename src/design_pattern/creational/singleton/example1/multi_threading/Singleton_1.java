package design_pattern.creational.singleton.example1.multi_threading;

public class Singleton_1 {
    public static int counter = 0;
    private static Singleton_1 instance = new Singleton_1();;

    private Singleton_1() {
        counter++;
    }

    public static synchronized Singleton_1 getInstance() {
        return instance;
    }
}
