package java_unit_test.junit.test_packages.tutorialspoint.junit_3_4.message.test_suite;

import java_unit_test.junit.source_packages.tutorialspoint.junit_3_4.message.MessageUtil;
import org.junit.Test;

import static org.testng.Assert.*;

public class MessageTest1 {
    String message = "Robert";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
        assertEquals(message, messageUtil.printMessage());
    }
}
