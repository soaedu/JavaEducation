package design_pattern.behavioral.strategy.example4;

import design_pattern.behavioral.strategy.example4.strategy.type.OperationAdd;
import design_pattern.behavioral.strategy.example4.strategy.type.OperationMultiply;
import design_pattern.behavioral.strategy.example4.strategy.type.OperationSubtract;

public class StrategyMain {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
