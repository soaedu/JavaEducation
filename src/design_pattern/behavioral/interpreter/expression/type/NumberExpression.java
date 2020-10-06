package design_pattern.behavioral.interpreter.expression.type;

import design_pattern.behavioral.interpreter.expression.Expression;

// Terminal Expression
public class NumberExpression implements Expression {
    int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return number;
    }
}
