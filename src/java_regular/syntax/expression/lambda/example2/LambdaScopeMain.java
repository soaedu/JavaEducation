package java_regular.syntax.expression.lambda.example2;

import java.util.function.Consumer;

/*
    Like "local" and "anonymous classes", "lambda expressions" can capture variables; they have the same access to
    "local variables" of the "enclosing" scope. However, unlike "local" and "anonymous classes", "lambda expressions"
    do not have any shadowing issues.
    "Lambda expressions" are lexically scoped. This means that they do not inherit any names from a supertype or
    introduce a new level of scoping. Declarations in a "lambda expression" are interpreted just as they are in the
    enclosing environment.
 */
public class LambdaScopeMain {
    private int x = 0;

    public static void main(String[] args) {
        LambdaScopeMain main = new LambdaScopeMain();
        LambdaScopeMain.FirstLevel firstLevel = main.new FirstLevel();
        firstLevel.firstLevelMethod(23);
    }

    class FirstLevel {
        public int x = 1;

        void firstLevelMethod(int x) {
            // The following statement causes the compiler to generate
            // the error "local variables referenced from a lambda expression
            // must be final or effectively final" in statement A:
            //
            // x = 99;

            Consumer<Integer> myConsumer = (y) -> {
                System.out.println("x = " +x);  // Statement A
                System.out.println("y = " +y);
                System.out.println("this.x = " +this.x);
                System.out.println("LambdaScopeMain.this.x = " + LambdaScopeMain.this.x);
            };

            myConsumer.accept(x);
        }
    }
}
