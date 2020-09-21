package java_unit_test.testng.test_packages.string;

import org.testng.annotations.*;
import static java_unit_test.testng.source_packages.string.MyString.*;
import static org.testng.Assert.assertEquals;

public class MyStringTestNG {

    public MyStringTestNG() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {

    }

    @Test
    public void testConcatenate() {
        String part1 = "ABC";
        String part2 = "DEF";
        System.out.println("testConcatenate(): "+part1+ "+" +part2);

        String expectedResult = "ABCDEF";
        String result = concatenate(part1, part2);
        assertEquals(result, expectedResult, "MyStringTestNG: testConcatenate(): Error");
    }

    @Test
    public void testGetSubstring() {
        String string = "Kotlin or Java";
        int length = 3;
        System.out.println("testGetSubstring(): "+string+ ", length:" +length);

        String expectedResult = "Kot";
        String result = getSubstring(string, length);
        assertEquals(result, expectedResult, "MyStringTestNG: testGetSubstring(): Error");
    }
}
