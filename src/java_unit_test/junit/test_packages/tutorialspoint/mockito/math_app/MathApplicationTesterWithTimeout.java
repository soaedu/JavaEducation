package java_unit_test.junit.test_packages.tutorialspoint.mockito.math_app;

import java_unit_test.junit.source_packages.tutorialspoint.mockito.math_app.CalculatorService;
import java_unit_test.junit.source_packages.tutorialspoint.mockito.math_app.MathApplication;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTesterWithTimeout {
    private MathApplication mathApplication;
    private CalculatorService calcService;

    @Before
    public void setUp(){
        mathApplication = new MathApplication();
        calcService = mock(CalculatorService.class);
        mathApplication.setCalculatorService(calcService);
    }

    @Test
    public void testAddAndSubtract(){
        double input1 = 10.0;
        double input2 = 20.0;
        double expResult1 = 30.0;
        double expResult2 = -10.0;
        double delta = 0.5;
        long timeout = 100;

        //add the behavior to add numbers
        when(calcService.add(input1, input2)).thenReturn(expResult1);

        //subtract the behavior to subtract numbers
        when(calcService.subtract(input1, input2)).thenReturn(expResult2);

        //test the subtract functionality
        Assert.assertEquals(mathApplication.subtract(input1, input2),expResult2, delta);

        //test the add functionality
        Assert.assertEquals(mathApplication.add(input1, input2),expResult1, delta);

        //verify call to add method to be completed within 100 ms
        verify(calcService, timeout(timeout)).add(input1, input2);

        //invocation count can be added to ensure multiplication invocations
        //can be checked within given timeframe
        verify(calcService, timeout(timeout).times(1)).subtract(input1, input2);
    }
}
