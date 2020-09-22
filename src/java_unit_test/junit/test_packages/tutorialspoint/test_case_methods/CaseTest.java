package java_unit_test.junit.test_packages.tutorialspoint.test_case_methods;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class CaseTest extends TestCase {
    protected double value1;
    protected double value2;

    @Before
    public void setUp() {
        value1 = 2.0;
        value2 = 3.0;
    }

    @Test
    public void testCaseMethods() {
        //count the number of test cases
        System.out.println("№ of test cases: " +this.countTestCases());

        //test getName
        String name = this.getName();
        System.out.println("Test Case Name: " +name);

        //test setName
        this.setName("newTestName");
        String newName = this.getName();
        System.out.println("Updated Test Case Name: " +newName);
    }

    //tearDown used to close the connection or clean up activities
    public void tearDown() {
    }
}
