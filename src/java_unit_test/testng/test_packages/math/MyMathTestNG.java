package java_unit_test.testng.test_packages.math;

import static java_unit_test.testng.source_packages.math.MyMath.*;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.*;

public class MyMathTestNG {
    public MyMathTestNG() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {

    }

    @Test
    public void testAdd() {
        int a = 5;
        int b = 7;
        System.out.println("testAdd(): "+a+ "+" +b);

        int result = add(a, b);
        int expectedResult = 12;
        assertEquals(result, expectedResult, "MyMathTestNG: testAdd(): Error.");
    }

    @Test
    public void testSub() {
        int a = 5;
        int b = 7;
        System.out.println("testSub(): " +a+ "-" +b);

        int result = sub(a, b);
        int expectedResult = -2;
        assertEquals(result, expectedResult, "MyMathTestNG: testSub(): Error.");
    }
}
