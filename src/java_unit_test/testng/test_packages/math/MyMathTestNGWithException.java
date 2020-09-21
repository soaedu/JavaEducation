package java_unit_test.testng.test_packages.math;

import static java_unit_test.testng.source_packages.math.MyMath.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MyMathTestNGWithException {
    public MyMathTestNGWithException() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {

    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivForArithmeticException() {
        int a = 8;
        int b = 0;
        System.out.println("div: "+a+ " on " +b);

        div(a, b);
    }

    @Test
    public void testDiv() {
        int a = 8;
        int b = 0;
        System.out.println("div: "+a+ " on " +b);

        div(a, b);
    }
}
