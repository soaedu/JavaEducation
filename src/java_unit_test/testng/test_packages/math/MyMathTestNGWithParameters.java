package java_unit_test.testng.test_packages.math;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static java_unit_test.testng.source_packages.math.MyMath.add;
import static org.testng.Assert.assertEquals;

public class MyMathTestNGWithParameters {
    public MyMathTestNGWithParameters() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @Test
    @Parameters(value = {"a", "b", "expectedResult"})
    public void testAdd(int a, int b, int expectedResult) {
        System.out.println("testAdd(): "+a+ "+" +b);

        int result = add(a, b);
        assertEquals(result, expectedResult, "MyMathTestNGWithParameters: testAdd(): Error.");
    }

    @Test(dataProvider = "DataProvider")
    public void testAddFromParametersArray(int a, int b, int expectedResult) {
        System.out.println("testAdd(): "+a+ "+" +b);

        int result = add(a, b);
        assertEquals(result, expectedResult, "MyMathTestNGWithParameters: testAddFromParametersArray(): Error.");
    }

    @DataProvider(name = "DataProvider")
    public static Object[][] getParametersArray() {
        return new Object[][] {
                {2, 3, 5},
                {-6, 4, -2}
        };
    }
}
