package design_pattern.behavioral.interpreter.example2;

import design_pattern.behavioral.interpreter.example2.expression.Expression;
import design_pattern.behavioral.interpreter.example2.expression.type.AndExpression;
import design_pattern.behavioral.interpreter.example2.expression.type.OrExpression;
import design_pattern.behavioral.interpreter.example2.expression.type.TerminalExpression;

public class InterpreterMain {
    //Rule: Robert and John are male
    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    //Rule: Julie is a married women
    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
    }
}
