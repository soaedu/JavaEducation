package java_regular.interfaces.regular_interface.default_method.example2;

public class TimeClientMain {
    public static void main(String[] args) {
        TimeClient myTimeClient = new SimpleTimeClient();
        System.out.println("\nCurrent time: " + myTimeClient.toString());
        System.out.println("\nTime in California: " + myTimeClient.getZonedDateTime("Blah blah").toString());
    }
}
