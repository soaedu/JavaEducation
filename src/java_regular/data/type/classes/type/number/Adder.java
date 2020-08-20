package java_regular.data.type.classes.type.number;

public class Adder {
    public static void main(String[] args) {
        int numArgs = args.length;

        // this program requires at least two arguments on the command line
        if (numArgs < 2) {
            System.out.println("This program requires two command-line arguments.");
        }
        else {
            StringBuilder result = new StringBuilder("\nThe sum of the (");
            int sum = 0;

            for (int i = 0; i < numArgs; i++) {
                int number = Integer.parseInt(args[i]);
                result.append(number).append(",");
                sum += number;
            }
            // remove last symbol - ","
            result.delete(result.length()-1, result.length());
            result.append(") is: ").append(sum);

            System.out.println(result);
        }
    }
}
