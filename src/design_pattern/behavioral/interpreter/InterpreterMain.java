package design_pattern.behavioral.interpreter;

import design_pattern.behavioral.interpreter.expression.Expression;

public class InterpreterMain {
    public static void main(String[] args) {
        Context context = new Context();

        String exp = "1-2+3";
        Expression expression = context.evaluate(exp);
        System.out.println("result of (" +exp+ ") is: " +expression.interpret());
    }
}
