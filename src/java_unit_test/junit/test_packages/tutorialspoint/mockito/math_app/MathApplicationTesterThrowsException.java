package java_unit_test.junit.test_packages.tutorialspoint.mockito.math_app;

import java_unit_test.junit.source_packages.tutorialspoint.mockito.math_app.CalculatorService;
import java_unit_test.junit.source_packages.tutorialspoint.mockito.math_app.MathApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.doThrow;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTesterThrowsException {

    @InjectMocks
    MathApplication mathApplication = new MathApplication();

    @Mock
    CalculatorService calculatorService;

    @Test
    public void testDivide() {
        double input1 = 20.0;
        double input2 = 4.0;
        double expResult = 5.0;
        double delta = 0.5;

        //add the behavior to throw exception
        doThrow(new Error("Dividing is not implemented!")).when(calculatorService).divide(input1, input2);

        Assert.assertEquals(mathApplication.divide(input1, input2), expResult, delta);
    }
}
