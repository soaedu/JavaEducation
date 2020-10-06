package design_pattern.behavioral.strategy.example4.strategy.type;

import design_pattern.behavioral.strategy.example4.strategy.Strategy;

// Concrete Strategy
public class OperationSubtract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
