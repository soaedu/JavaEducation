package java_unit_test.junit.test_packages.tutorialspoint.test_asserts;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class AssertsTestRunner {
    public static void main(String[] args) {
        // Result result = JUnitCore.runClasses(JUnitTest1.class, JUnitTest2.class);
        Result result = JUnitCore.runClasses(AssertsTest2.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}
