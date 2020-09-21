package java_unit_test.testng.test_packages.math;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static java_unit_test.testng.source_packages.math.MyMath.add;
import static java_unit_test.testng.source_packages.math.MyMath.div;
import static org.testng.Assert.assertEquals;

public class MyMathTestNGDependsOn {
    int a,b = 0;

    public MyMathTestNGDependsOn() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @Test
    public void testAdd() {
        a = 5;
        b = 7;
        System.out.println("testAdd(): "+a+ "+" +b);

        int result = add(a, b);
        int expectedResult = 12;
        assertEquals(result, expectedResult, "MyMathTestNG: testAdd(): Error.");
    }

    @Test(dependsOnMethods = {"testAdd"})
    public void testDiv() {
        int a = 8;
        int b = 0;
        System.out.println("div: "+a+ " on " +b);

        div(a, b);
    }
}
