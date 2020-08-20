package java_regular.syntax.keyword;

public class YieldMain {
    public static void main(String[] args) {
        String sin = "sin";
        // calculate(sin, 1.15);
    }

    // Java 14
    /*static double calculate(String fn, double arg) {
        return switch(fn) {
            case "sin" ->   Math.sin(arg);
            case "cos" ->   Math.cos(arg);
            case "sign" ->  {
                if (arg < 0) yield -1;
                if (arg > 0) yield 1;
                yield 0;
            }
            default -> throw new IllegalArgumentException();
        };
    }*/
}
