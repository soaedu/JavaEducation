package java_unit_test.junit.test_packages.tutorialspoint.test_asserts;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertsTest1 {
    @Test
    public void testAsserts() {
        // test data
        int num = 5;
        String temp = null;
        String str = "Junit is working fine";

        // check for equality
        assertEquals("Junit is working fine", str);

        // check for false condition
        assertFalse(num > 6);

        // check for not null value
        assertNotNull("Error: temp is null",temp);
    }
}
