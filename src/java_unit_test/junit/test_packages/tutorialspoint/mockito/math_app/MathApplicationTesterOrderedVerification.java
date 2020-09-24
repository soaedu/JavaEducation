package java_unit_test.junit.test_packages.tutorialspoint.mockito.math_app;

import java_unit_test.junit.source_packages.tutorialspoint.mockito.math_app.CalculatorService;
import java_unit_test.junit.source_packages.tutorialspoint.mockito.math_app.MathApplication;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTesterOrderedVerification {
    private MathApplication mathApplication;
    private CalculatorService calculatorService;

    @Before
    public void setUp() {
        calculatorService = mock(CalculatorService.class);
        mathApplication = new MathApplication();
        mathApplication.setCalculatorService(calculatorService);
    }

    @Test
    public void testMathOperationsOrder() {
        double input1 = 10.0;
        double input2 = 20.0;
        double expResult1 = 30.0;
        double expResult2 = -10.0;
        double delta = 0.5;

        when(calculatorService.add(input1, input2)).thenReturn(expResult1);
        when(calculatorService.subtract(input1, input2)).thenReturn(expResult2);

        Assert.assertEquals(mathApplication.add(input1, input2), expResult1, delta);
        Assert.assertEquals(mathApplication.subtract(input1, input2), expResult2, delta);

        //create an inOrder verifier for a single mock
        InOrder inOrder = Mockito.inOrder(calculatorService);

        //following will make sure that add is first called then subtract is called.
        inOrder.verify(calculatorService).add(input1, input2);
        inOrder.verify(calculatorService).subtract(input1, input2);
    }
}
