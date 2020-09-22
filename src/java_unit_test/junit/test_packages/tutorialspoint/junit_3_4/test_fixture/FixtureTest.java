package java_unit_test.junit.test_packages.tutorialspoint.junit_3_4.test_fixture;

import junit.framework.TestCase;

public class FixtureTest extends TestCase {
    protected int value1, value2;

    // assigning the values
    protected void setUp() {
        value1 = 3;
        value2 = 3;
    }

    // test method to add two values
    public void testAdd() {
        double result = value1 + value2;
        assertTrue(result == 6);
    }
}
