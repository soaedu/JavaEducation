package java_unit_test.junit.test_packages.tutorialspoint.mockito.math_app;

import java_unit_test.junit.source_packages.tutorialspoint.mockito.math_app.CalculatorService;
import java_unit_test.junit.source_packages.tutorialspoint.mockito.math_app.MathApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTesterWithVerifyTimesCall {

    @InjectMocks
    MathApplication mathApplication = new MathApplication();

    @Mock
    CalculatorService calculatorService;

    @Test
    public void testAdd() {
        double input1 = 10.0;
        double input2 = 20.0;
        double expResult = 30.0;
        double delta = 0.5;

        when(calculatorService.add(input1, input2)).thenReturn(expResult);

        Assert.assertEquals(mathApplication.add(input1, input2), expResult, delta);

        //default call count is 1
        verify(calculatorService).add(input1, input2);

        verify(calculatorService, times(1)).add(input1, input2);
    }

    @Test
    public void testSubtract() {
        double input1 = 100.0;
        double input2 = 10.0;
        double expResult = 90.0;
        double delta = 0.5;

        when(calculatorService.subtract(input1, input2)).thenReturn(expResult);

        Assert.assertEquals(mathApplication.subtract(input1, input2), expResult, delta);
        Assert.assertEquals(mathApplication.subtract(input1, input2), expResult, delta);
        Assert.assertEquals(mathApplication.subtract(input1, input2), expResult, delta);

        //check if add function is called three times
        verify(calculatorService, times(3)).subtract(input1, input2);

        //verify that method was never called on a mock
        verify(calculatorService, never()).divide(input1, input2);
    }
}
