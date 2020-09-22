package java_unit_test.junit.test_packages.tutorialspoint.test_result_methods;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import org.junit.Test;

public class ResultTest1 extends TestCase {
    MyTestResult testResult = new MyTestResult();

    @Test
    public void testResultMethods() {
        try {
            int result = 6 / 0;
        } catch (Exception ex) {
            testResult.addError(this, ex);
        }
    }

    @Test
    public void testNotNullFail() {
        String str = null;

        if (str == null) {
            testResult.addFailure(this, new AssertionFailedError("Str is null"));
            testResult.stopTest(this);
        }
    }
}
