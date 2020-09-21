package java_unit_test.testng.test_packages.string;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static java_unit_test.testng.source_packages.string.MyString.concatenate;
import static org.testng.Assert.assertEquals;

public class MyStringTestNIgnoreTestMethod {
    public MyStringTestNIgnoreTestMethod() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {

    }

    // выполняться не будет
    @Test(enabled = false)
    public void testConcatenate() {
        String part1 = "ABC";
        String part2 = "DEF";
        System.out.println("testConcatenate(): "+part1+ "+" +part2);

        String expectedResult = "ABCDEF";
        String result = concatenate(part1, part2);
        assertEquals(result, expectedResult, "MyMathTestNIgnoreTestMethod: testConcatenate(): Error");
    }
}
