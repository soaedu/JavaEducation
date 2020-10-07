package design_pattern.behavioral.interpreter.example2.expression.type;

import design_pattern.behavioral.interpreter.example2.expression.Expression;

// Terminal Expression
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
