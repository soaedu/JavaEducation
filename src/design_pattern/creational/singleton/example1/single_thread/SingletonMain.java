package design_pattern.creational.singleton.example1.single_thread;

public class SingletonMain {
    public static void main(String[] args) {
        // Singleton singleton = new Singleton();

        final int SIZE = 100;

        Singleton[] singletons = new Singleton[SIZE];

        for (int i = 0; i < SIZE; i++) {
            singletons[i] = Singleton.getInstance();
        }

        System.out.println("count: " +Singleton.counter);
    }
}
