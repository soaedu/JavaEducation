package design_pattern.creational.singleton.example1.multi_threading;

public class Singleton_3 {
    public static int counter = 0;
    private static volatile Singleton_3 instance = null;

    private Singleton_3() {
        counter++;
    }

    public static Singleton_3 getInstance() {
        if (instance == null) {
            synchronized(Singleton_3.class) {
                if (instance == null) {
                    instance = new Singleton_3();
                }
            }
        }
        return instance;
    }
}
