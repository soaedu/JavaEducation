package java_unit_test.junit.test_packages.tutorialspoint.junit_3_4.employee.test_asserts;

import java_unit_test.junit.test_packages.tutorialspoint.junit_3_4.employee.test_asserts.EmployeeDetailsTest;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(EmployeeDetailsTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}
