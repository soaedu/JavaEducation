package java_unit_test.junit.test_packages.tutorialspoint.junit_3_4.prime_number.test_parameterized;

import java_unit_test.junit.source_packages.tutorialspoint.junit_3_4.prime_number.PrimeNumberChecker;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedTest {
    private Integer inputNumber;
    private Boolean expectedResult;
    private PrimeNumberChecker primeNumberChecker;

    @Before
    public void initialize() {
        primeNumberChecker = new PrimeNumberChecker();
    }

    // Each parameter should be placed as an argument here
    // Every time runner triggers, it will pass the arguments
    // from parameters we defined in primeNumbers() method

    public ParameterizedTest(Integer inputNumber, Boolean expectedResult) {
        this.inputNumber = inputNumber;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][] {
            {2, true},
            {6, false},
            {19, true},
            {22, false},
            {23, true}
        });
    }

    // This test will run 4 times since we have 5 parameters defined
    @Test
    public void testPrimeNumbers() {
        System.out.println("Parameterized Number is : " + inputNumber);
        assertEquals(expectedResult, primeNumberChecker.validate(inputNumber));
    }
}
