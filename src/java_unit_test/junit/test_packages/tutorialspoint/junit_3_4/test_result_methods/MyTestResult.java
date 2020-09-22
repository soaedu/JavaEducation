package java_unit_test.junit.test_packages.tutorialspoint.junit_3_4.test_result_methods;

import junit.framework.AssertionFailedError;
import junit.framework.TestResult;

public class MyTestResult extends TestResult {
    // add the error
    public synchronized void addError(junit.framework.Test test, Throwable t) {
        super.addError(test, t);

        System.out.println("MyTestResult: addError():" +
                "\n\ttest: " +test.getClass().getCanonicalName()+
                "\n\terror: " +t+
                "\n\terror count: " +errorCount());
    }

    // add the failure
    public synchronized void addFailure(junit.framework.Test test, AssertionFailedError t) {
        super.addFailure(test, t);

        System.out.println("MyTestResult: addFailure():" +
                "\n\ttest: " +test.getClass().getCanonicalName()+
                "\n\terror: " +t
        );
    }

    // Marks that the test run should stop.
    public synchronized void stopTest(junit.framework.Test test) {
        super.endTest(test);
        System.out.println("MyTestResult: stopTest():" +
                "\n\ttest: " +test.getClass().getCanonicalName()
        );
    }
}
