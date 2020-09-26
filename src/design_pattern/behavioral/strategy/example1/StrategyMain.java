package design_pattern.behavioral.strategy.example1;

import design_pattern.behavioral.strategy.example1.type.A;
import design_pattern.behavioral.strategy.example1.type.B;

/**
 * https://www.youtube.com/watch?v=qfKX4xQ4Yos&t=9s
 */
public class StrategyMain {
    public static void main(String[] args) {
        A aInstance = new A();
        aInstance.print();

        B bInstance = new B();
        bInstance.print();
    }
}

