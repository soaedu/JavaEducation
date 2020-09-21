package java_unit_test.junit.source_packages.math;

public class MyMath {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int div(int a, int b) {
        return a / b;
    }

    public static int addWithDelay(int a, int b, long delay) throws InterruptedException {
        Thread.sleep(delay);
        return a + b;
    }

    public static int divWithDelay(int a, int b, long delay) throws InterruptedException {
        Thread.sleep(delay);
        return a / b;
    }
}
