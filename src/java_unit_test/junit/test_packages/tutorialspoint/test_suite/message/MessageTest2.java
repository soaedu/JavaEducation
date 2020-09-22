package java_unit_test.junit.test_packages.tutorialspoint.test_suite.message;

import java_unit_test.junit.source_packages.tutorialspoint.message.MessageUtil;
import org.junit.Test;
import static org.testng.Assert.*;

public class MessageTest2 {
    String message = "Robert";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Robert";
        assertEquals(message, messageUtil.salutationMessage());
    }
}
