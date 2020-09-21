package java_unit_test.junit.test_packages.math;

import java_unit_test.junit.source_packages.math.MyMath;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class MyMathTestWithParams {
    int a,b,expResult;

    // будет применяться ко всем методам класса, если для них не указана аннотация @Ignore
    @Parameterized.Parameters
    public static Collection numbers() {
        return Arrays.asList(new Object[][]{
                    {1,2,3},
                    {2,9,11},
//                    {3,3,7}},
                    {3,3,6}}
                );
    }

    public MyMathTestWithParams(int a, int b, int expResult) {
        this.a = a;
        this.b = b;
        this.expResult = expResult;
    }

    @Before
    public void setup() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testAdd() {
        System.out.println("add: "+a+ " and " +b);
        int result = MyMath.add(a, b);
        assertEquals(expResult, result);
    }

    @Ignore
    @Test
    public void testDiv() {
        System.out.println("div: "+a+ " on " +b);
        int result = MyMath.div(a, b);
        assertEquals(expResult, result);
    }
}
