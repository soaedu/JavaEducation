package design_pattern.behavioral.interpreter.example1;

import design_pattern.behavioral.interpreter.example1.expression.Expression;
import design_pattern.behavioral.interpreter.example1.expression.type.MinusExpression;
import design_pattern.behavioral.interpreter.example1.expression.type.NumberExpression;
import design_pattern.behavioral.interpreter.example1.expression.type.PlusExpression;

public class Context {
    Expression evaluate(String expression) {
        int pos = expression.length() - 1;

        while (pos > 0) {
            if (Character.isDigit(expression.charAt(pos))) {
                pos--;
            } else {
                Expression left = evaluate(expression.substring(0, pos));
                Expression right = new NumberExpression(Integer.valueOf(expression.substring(pos + 1, expression.length())));
                char operator = expression.charAt(pos);

                switch (operator) {
                    case '-':
                        return new MinusExpression(left, right);
                    case '+':
                        return new PlusExpression(left, right);
                }
            }
        }

        int result = Integer.valueOf(expression);
        return new NumberExpression(result);
    }
}
