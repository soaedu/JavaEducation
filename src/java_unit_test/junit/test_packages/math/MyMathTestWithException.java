package java_unit_test.junit.test_packages.math;

import java_unit_test.junit.source_packages.math.MyMath;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyMathTestWithException {
    public MyMathTestWithException() {
    }

    @Before
    public void setup() {
    }

    @After
    public void tearDown() {
    }

    // указываем, что мы ожидаем возникновения ошибки в результате деления на 0
    // если ошибки не будет, то тест не пройдет и сообщит: Expected exception: java.lang.ArithmeticException
    @Test(expected = ArithmeticException.class)
    public void testDivForArithmeticException() {
        int a = 8;
        int b = 0;
        System.out.println("div: "+a+ " on " +b);

        MyMath.div(a, b);
    }

    // указываем, что мы ожидаем возникновения ошибки в результате деления на 0
    // если ошибки не будет, то тест не пройдет и сообщит: Expected exception: java.lang.ArithmeticException
    @Test(expected = Exception.class)
    public void testDivForException() {
        int a = 8;
        int b = 0;
        System.out.println("div: "+a+ " on " +b);

        MyMath.div(a, b);
    }
}
