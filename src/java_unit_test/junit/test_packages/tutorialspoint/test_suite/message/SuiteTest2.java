package java_unit_test.junit.test_packages.tutorialspoint.test_suite.message;

import junit.framework.TestResult;
import junit.framework.TestSuite;

public class SuiteTest2 {
    public static void main(String[] args) {
        // add the test's in the suite
        TestResult result = new TestResult();
        TestSuite suite = new TestSuite(MessageTest1.class, MessageTest2.class);
        suite.run(result);
        System.out.println("Number of test cases = " + result.runCount());
        System.out.println("Result: " + result.wasSuccessful());
    }
}
