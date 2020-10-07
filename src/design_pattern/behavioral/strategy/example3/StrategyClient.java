package design_pattern.behavioral.strategy.example3;

import design_pattern.behavioral.strategy.example3.sort.Sorting;

// Context
public class StrategyClient {
    Sorting strategy;

    public void setStrategy(Sorting strategy) {
        this.strategy = strategy;
    }

    public void execute(int[] array) {
        strategy.sort(array);
    }
}
