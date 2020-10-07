package design_pattern.behavioral.interpreter.example1.expression.type;

import design_pattern.behavioral.interpreter.example1.expression.Expression;

// Non-Terminal Expression
public class PlusExpression implements Expression {
    Expression left;
    Expression right;

    public PlusExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() + right.interpret();
    }
}
