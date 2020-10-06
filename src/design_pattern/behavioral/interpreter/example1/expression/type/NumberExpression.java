package design_pattern.behavioral.interpreter.example1.expression.type;

import design_pattern.behavioral.interpreter.example1.expression.Expression;

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
