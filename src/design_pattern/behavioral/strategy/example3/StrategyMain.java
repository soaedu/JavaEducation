package design_pattern.behavioral.strategy.example3;

import design_pattern.behavioral.strategy.example3.sort.type.BubbleSort;
import design_pattern.behavioral.strategy.example3.sort.type.InsertingSort;
import design_pattern.behavioral.strategy.example3.sort.type.SelectionSort;

public class StrategyMain {
    public static void main(String[] args) {
        StrategyClient strategyClient = new StrategyClient();

        int[] array1 = {1, 3, 2, 1};
        strategyClient.setStrategy(new SelectionSort());
        strategyClient.execute(array1);

        int[] array2 = {11, 4, 2, 7, 8, 54};
        strategyClient.setStrategy(new InsertingSort());
        strategyClient.execute(array2);

        int[] array3 = {3, -8, 2, 0, 33, 1, 3, 2};
        strategyClient.setStrategy(new BubbleSort());
        strategyClient.execute(array3);

        /*int[] array3 = {3, -8, 2, 0, 33, 1, 3, 2};
        strategyClient.setStrategy(new BubbleSort());
        strategyClient.setStrategy(new InsertingSort());
        strategyClient.setStrategy(new SelectionSort());
        strategyClient.execute(array3);*/
    }
}
