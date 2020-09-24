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
public class MathApplicationTesterWithResetMock {
    private MathApplication mathApplication;
    private CalculatorService calculatorService;

    @Before
    public void setUp(){
        mathApplication = new MathApplication();
        calculatorService = mock(CalculatorService.class);
        mathApplication.setCalculatorService(calculatorService);
    }

    @Test
    public void testAddWithMockReset() {
        double input1 = 10.0;
        double input2 = 20.0;
        double expResult = 30.0;
        double delta = 0.5;

        //add the behavior to add numbers
        when(calculatorService.add(input1, input2)).thenReturn(expResult);

        //test the add functionality
        Assert.assertEquals(mathApplication.add(input1, input2), expResult, delta);

        //reset the mock
        reset(calculatorService);

        //test the add functionality after resetting the mock
        Assert.assertEquals(mathApplication.add(input1, input2), expResult, delta);
    }
}
