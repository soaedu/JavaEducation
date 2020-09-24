package java_unit_test.junit.test_packages.tutorialspoint.mockito.math_app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import java_unit_test.junit.source_packages.tutorialspoint.mockito.math_app.CalculatorService;
import java_unit_test.junit.source_packages.tutorialspoint.mockito.math_app.MathApplication;

import org.junit.Assert;
import static org.mockito.Mockito.when;

// @RunWith attaches a runner with the test class to initialize the test data
@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester {

    //@InjectMocks annotation is used to create and inject the mock object
    @InjectMocks
    MathApplication mathApplication = new MathApplication();

    //@Mock annotation is used to create the mock object to be injected
    @Mock
    CalculatorService calculatorService;

    @Test
    public void testAdd() {
        double input1 = 10.0;
        double input2 = 20.0;
        double expResult = 30.0;
        double delta = 0.5;

        //add the behavior of calc service to add two numbers
        when(calculatorService.add(input1, input2)).thenReturn(expResult);

        //test the add functionality
        Assert.assertEquals(mathApplication.add(input1, input2), expResult, delta);
    }
}
