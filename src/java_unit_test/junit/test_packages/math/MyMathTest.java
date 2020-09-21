package java_unit_test.junit.test_packages.math;

import java_unit_test.junit.source_packages.math.MyMath;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyMathTest {
    public MyMathTest() {
    }

    @Before
    public void setup() {

    }

    @After
    public void tearDown() {

    }

    @Test
    public void testAdd() {
        int a = 2;
        int b = 3;
        System.out.println("add: "+a+ " and " +b);
        
        int expResult = 5;
        int result = MyMath.add(a, b);
        assertEquals(expResult, result);
        // fail("The test case is a prototype");
    }

    @Test
    public void testDiv() {
        int a = 8;
        int b = 2;
        System.out.println("div: "+a+ " on " +b);

        int expResult = 4;
        int result = MyMath.div(a, b);
        assertEquals(expResult, result);
        // fail("The test case is a prototype");
    }
}
