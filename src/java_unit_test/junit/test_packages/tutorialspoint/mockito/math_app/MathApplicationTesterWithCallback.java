package java_unit_test.junit.test_packages.tutorialspoint.mockito.math_app;

import java_unit_test.junit.source_packages.tutorialspoint.mockito.math_app.CalculatorService;
import java_unit_test.junit.source_packages.tutorialspoint.mockito.math_app.MathApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;
import org.testng.Assert;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTesterWithCallback {
    private MathApplication mathApplication;
    private CalculatorService calcService;

    @Before
    public void setUp(){
        mathApplication = new MathApplication();
        calcService = mock(CalculatorService.class);
        mathApplication.setCalculatorService(calcService);
    }

    @Test
    public void testAdd() {
        double input1 = 10.0;
        double input2 = 20.0;
        double expResult = 30.0;
        double delta = 0.5;

        //add the behavior to add numbers
        when(calcService.add(input1, input2)).thenAnswer((Answer<Double>) invocation -> {
            //get the arguments passed to mock
            Object[] args = invocation.getArguments();

            //get the mock
            Object mock = invocation.getMock();

            //return the result
            return expResult;
        });

        Assert.assertEquals(mathApplication.add(input1, input2), expResult);
    }
}
