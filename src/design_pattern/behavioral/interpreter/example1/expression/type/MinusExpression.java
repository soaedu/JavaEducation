package design_pattern.behavioral.interpreter.example1.expression.type;

import design_pattern.behavioral.interpreter.example1.expression.Expression;

// Non-Terminal Expression
public class MinusExpression implements Expression {
    Expression left;
    Expression right;

    public MinusExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() - right.interpret();
    }
}
