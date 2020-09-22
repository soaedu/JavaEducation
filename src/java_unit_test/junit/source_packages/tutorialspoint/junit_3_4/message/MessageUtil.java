package java_unit_test.junit.source_packages.tutorialspoint.junit_3_4.message;

public class MessageUtil {
    private String message;

    public MessageUtil(String message) {
        this.message = message;
    }

    public String printMessage() {
        return message;
    }

    public String salutationMessage() {
        return "Hi!" + message;
    }
}
