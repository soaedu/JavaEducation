package java_unit_test.junit.test_packages.tutorialspoint.junit_3_4.message.test_suite;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

// Test Suite alternative
public class SuiteTestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(MessageTest1.class, MessageTest2.class);

        for (Failure failure: result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}
