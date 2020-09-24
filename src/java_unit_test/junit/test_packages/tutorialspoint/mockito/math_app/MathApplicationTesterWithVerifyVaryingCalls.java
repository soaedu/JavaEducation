package java_unit_test.junit.test_packages.tutorialspoint.mockito.math_app;

import java_unit_test.junit.source_packages.tutorialspoint.mockito.math_app.CalculatorService;
import java_unit_test.junit.source_packages.tutorialspoint.mockito.math_app.MathApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.testng.Assert;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTesterWithVerifyVaryingCalls {

    @InjectMocks
    MathApplication mathApplication = new MathApplication();

    @Mock
    CalculatorService calculatorService;

    @Test
    public void testAdd() {
        double input1 = 50.0;
        double input2 = 25.0;
        double expResult = 25.0;

        when(calculatorService.subtract(input1, input2)).thenReturn(expResult);

        Assert.assertEquals(mathApplication.subtract(input1, input2), expResult);
        Assert.assertEquals(mathApplication.subtract(input1, input2), expResult);

        //check a minimum 1 call count
        verify(calculatorService, atLeastOnce()).subtract(input1, input2);

        //check if add function is called minimum 2 times
        verify(calculatorService, atLeast(2)).subtract(input1, input2);

        //check if add function is called maximum 3 times
        verify(calculatorService, atMost(3)).subtract(input1, input2);
    }
}
