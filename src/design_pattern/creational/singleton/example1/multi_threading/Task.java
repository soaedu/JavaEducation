package design_pattern.creational.singleton.example1.multi_threading;

public class Task implements Runnable {
    @Override
    public void run() {
//        Singleton_1.getInstance();
//        Singleton_2.getInstance();
        Singleton_3.getInstance();
    }
}
