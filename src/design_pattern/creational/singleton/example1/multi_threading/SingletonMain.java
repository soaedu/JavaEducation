package design_pattern.creational.singleton.example1.multi_threading;

public class SingletonMain {
    public static void main(String[] args) throws InterruptedException {
        final int SIZE = 100;

        Thread[] threads = new Thread[SIZE];

        for (int i = 0; i < SIZE; i++) {
            threads[i] = new Thread(new Task());
            threads[i].start();
        }

        for (int i = 0; i < SIZE; i++) {
            threads[i].join();
        }

//        System.out.println("count: " + Singleton_1.counter);
//        System.out.println("count: " + Singleton_2.counter);
        System.out.println("count: " + Singleton_3.counter);
    }
}
