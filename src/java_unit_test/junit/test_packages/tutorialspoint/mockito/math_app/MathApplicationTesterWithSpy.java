package java_unit_test.junit.test_packages.tutorialspoint.mockito.math_app;

import java_unit_test.junit.source_packages.tutorialspoint.mockito.math_app.CalculatorImpl;
import java_unit_test.junit.source_packages.tutorialspoint.mockito.math_app.CalculatorService;
import java_unit_test.junit.source_packages.tutorialspoint.mockito.math_app.MathApplication;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.spy;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTesterWithSpy {

    private MathApplication mathApplication;
    private CalculatorService calculatorService;

    @Before
    public void setUp(){
        CalculatorImpl calculator = new CalculatorImpl();
        calculatorService = spy(calculator);
        mathApplication = new MathApplication();
        mathApplication.setCalculatorService(calculatorService);
    }

    @Test
    public void testAdd() {
        double input1 = 10.0;
        double input2 = 20.0;
        double expResult = 130.0;
        double delta = 0.5;

        //perform operation on real object
        //test the add functionality
        Assert.assertEquals(mathApplication.add(input1, input2), expResult,delta);
    }
}
