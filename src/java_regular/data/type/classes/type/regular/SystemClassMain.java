package java_regular.data.type.classes.type.regular;

public class SystemClassMain {
    public static void main(String[] args) {
        // #1
        // String version = System.getProperty("java.version");
        // #2
        var version = System.getProperty("java.version");

        System.out.println("\nJava version is: " +version);
    }
}
