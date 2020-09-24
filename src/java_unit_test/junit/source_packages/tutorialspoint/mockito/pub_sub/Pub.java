package java_unit_test.junit.source_packages.tutorialspoint.mockito.pub_sub;

public class Pub {
    Sub sub = null;

    public void add(Sub sub) {
        this.sub = sub;
    }

    public void publish(final String message) {
        sub.receive(message);
    }
}
