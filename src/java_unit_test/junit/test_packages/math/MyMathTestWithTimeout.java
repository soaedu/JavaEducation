package java_unit_test.junit.test_packages.math;

import java_unit_test.junit.source_packages.math.MyMath;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;

import static org.junit.Assert.assertEquals;

public class MyMathTestWithTimeout {
    // будет применяться ко всем методам в тестовом классе.
    @Rule
    public TestRule timeout = new Timeout(100);

    public MyMathTestWithTimeout() {
    }

    @Before
    public void setup() {
    }

    @After
    public void tearDown() {
    }

    // Тест должен уложиться в 100 миллисекунд,
    // иначе вылетит исключение: org.junit.runners.model.TestTimedOutException: test timed out after 100 milliseconds
    // @Test(timeout = 100) - будет применена timeout (правило общее для всех методов)
    @Test
    public void testAddWithDelay() throws InterruptedException {
        System.out.println("add with delay");
        int a = 2;
        int b = 3;
        long delay = 200L;
        System.out.println("add: "+a+ " and " +b+ " with delay = " +delay+ " millis");

        int expResult = 5;
        int result = MyMath.addWithDelay(a, b, delay);
        assertEquals(expResult, result);
    }

    // Тест должен уложиться в 100 миллисекунд,
    // иначе вылетит исключение: org.junit.runners.model.TestTimedOutException: test timed out after 100 milliseconds
    // @Test(timeout = 100) - будет применена timeout (правило общее для всех методов)
    @Test
    public void testDivWithDelay() throws InterruptedException {
        int a = 8;
        int b = 2;
        long delay = 20L;
        System.out.println("div: "+a+ " on " +b+ " with delay = " +delay+ " millis");

        int expResult = 4;
        int result = MyMath.divWithDelay(a, b, delay);
        assertEquals(expResult, result);
        // fail("The test case is a prototype");
    }
}
