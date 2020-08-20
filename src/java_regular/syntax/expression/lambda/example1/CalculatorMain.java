package java_regular.syntax.expression.lambda.example1;

public class CalculatorMain {
    interface IntegerMath {
        int operation(int a, int b);
    }

    public static void main(String[] args) {
        IntegerMath addition = (a, b) -> a + b;
        IntegerMath subtraction = (a, b) -> a - b;

        int a = 40;
        int b = 2;

        CalculatorMain calculator = new CalculatorMain();
        System.out.println("" +a+ " + " +b+ " = " +calculator.operateBinary(a, b, addition));

        a = 20;
        b = 10;
        System.out.println("" +a+ " - " +b+ " = " +calculator.operateBinary(a, b, subtraction));
    }

    private int operateBinary(int a, int b, IntegerMath op) {
        return op.operation(a, b);
    }
}
