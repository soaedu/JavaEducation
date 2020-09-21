package java_unit_test.junit.test_packages.math;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({MyMathTest.class, MyMathTestWithException.class, MyMathTestWithParams.class,
        MyMathTestWithTimeout.class})
public class MyMathTestSuit {
    @Before
    public void setup() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
}
