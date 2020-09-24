package java_unit_test.junit.source_packages.tutorialspoint.mockito.math_app;

public class CalculatorImpl implements CalculatorService {
    @Override
    public double add(double input1, double input2) {
        return input1 + input2 + 100;
    }

    @Override
    public double subtract(double input1, double input2) {
        throw new UnsupportedOperationException("Method not implemented yet!");
    }

    @Override
    public double multiply(double input1, double input2) {
        throw new UnsupportedOperationException("Method not implemented yet!");
    }

    @Override
    public double divide(double input1, double input2) {
        throw new UnsupportedOperationException("Method not implemented yet!");
    }
}
