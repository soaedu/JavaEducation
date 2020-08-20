package java_regular.interfaces.functional_interface.example1;

import java.util.function.DoubleBinaryOperator;

public class DoubleBinaryOperatorMain {
    public static void main(String[] args) {
        DoubleBinaryOperator doubleBinaryOperatorAddition = (a, b) -> (a + b);
        DoubleBinaryOperator doubleBinaryOperatorSubtraction = (a, b) -> (a - b);
        DoubleBinaryOperator doubleBinaryOperatorMultiplication = (a, b) -> (a * b);
        DoubleBinaryOperator doubleBinaryOperatorDividing = (a, b) -> (a / b);

        double x = 12.15;
        double y = 3.28;

        System.out.println("" +x+ " + " +y+ " = " +doubleBinaryOperatorAddition.applyAsDouble(x, y));
        System.out.println("" +x+ " - " +y+ " = " +doubleBinaryOperatorSubtraction.applyAsDouble(8, -10));
        System.out.println("" +x+ " * " +y+ " = " +doubleBinaryOperatorMultiplication.applyAsDouble(8, 5));
        System.out.println("" +x+ " / " +y+ " = " +doubleBinaryOperatorDividing.applyAsDouble(8, 4));
    }
}
