package java_regular.data.type.classes.type.number;

public class FloatOperationsMain {
    public static void main(String[] args) {
        int numArgs = args.length;

        StringBuilder result = new StringBuilder();

        // this program requires at least two arguments on the command line
        if (numArgs < 2) {
            result.append("This program requires two command-line arguments.");
        }
        else {
            // convert strings to numbers
            float a = Float.parseFloat(args[0]);
            float b = Float.parseFloat(args[1]);

            // do some arithmetic
            result.append("Float operations on numbers (" +a+ ", " +b+ "):")
                  .append("\n\ta + b = ").append(a + b)
                  .append("\n\ta - b = ").append(a - b)
                  .append("\n\ta * b = ").append(a * b)
                  .append("\n\ta / b = ").append(a / b)
                  .append("\n\ta % b = ").append(a % b);
        }

        System.out.println("\n" +result.toString());
    }
}
