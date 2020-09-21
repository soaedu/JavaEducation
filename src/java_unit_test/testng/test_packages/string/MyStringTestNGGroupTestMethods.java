package java_unit_test.testng.test_packages.string;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static java_unit_test.testng.source_packages.string.MyString.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class MyStringTestNGGroupTestMethods {
    public MyStringTestNGGroupTestMethods() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {

    }

    @Test(groups = {"Concatenation"})
    public void testConcatenate() {
        String part1 = "ABC";
        String part2 = "DEF";
        System.out.println("testConcatenate(): "+part1+ "+" +part2);

        String expectedResult = "ABCDEF";
        String result = concatenate(part1, part2);
        assertEquals(result, expectedResult, "MyMathTestNGGroupTestMethods: testConcatenate(): Error");
    }

    @Test(groups = {"GetSubstring"})
    public void testGetSubstring() {
        String expectedResult = "Kot";
        String result = getSubStr();
        assertEquals(result, expectedResult, "MyMathTestNGGroupTestMethods: testGetSubstring(): Error");
    }

    private String getSubStr() {
        String string = "Kotlin or Java";
        int length = 3;
        System.out.println("getSubstring(): "+string+ ", length:" +length);
        return getSubstring(string, length);
    }

    @Test(groups = {"Containing"})
    public void testContains() {
        String string = "Kotlin or Java";
        String example = "Kot";
        System.out.println("testContains(): " +string+ " a string: " +example);

        assertTrue(contains(string, example), "MyMathTestNGGroupTestMethods: testContains(): Error");
    }

    @Test(groups = {"GetSubstring", "Containing"})
    public void testGetSubstringAndContainsKot() {
        String string = "Kotlin or Java";
        assertTrue(contains(string, getSubStr()), "MyMathTestNGGroupTestMethods: testGetSubstringAndContainsKot(): Error");
    }
}
