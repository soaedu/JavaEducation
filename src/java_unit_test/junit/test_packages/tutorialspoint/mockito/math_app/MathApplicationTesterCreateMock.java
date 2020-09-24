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
public class MathApplicationTesterCreateMock {
    private MathApplication mathApplication;
    private CalculatorService calculatorService;

    @Before
    public void setUp() {
        calculatorService = mock(CalculatorService.class);
        mathApplication = new MathApplication();
        mathApplication.setCalculatorService(calculatorService);
    }

    @Test
    public void testMultiply() {
        double input1 = 3.0;
        double input2 = 5.0;
        double expResult = 15.0;
        double delta = 0.5;

        when(calculatorService.multiply(input1, input2)).thenReturn(expResult);

        Assert.assertEquals(mathApplication.multiply(input1, input2), expResult, delta);

        verify(calculatorService).multiply(input1, input2);
    }
}
