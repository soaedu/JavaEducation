package java_regular.data.type.classes.type.number;

public class MinValueMain {
    public static void main(String[] args) {
        // integers
        byte smallestByte = Byte.MIN_VALUE;
        short smallestShort = Short.MIN_VALUE;
        int smallestInteger = Integer.MIN_VALUE;
        long smallestLong = Long.MIN_VALUE;

        // real numbers
        float smallestFloat = Float.MIN_VALUE;
        double smallestDouble = Double.MIN_VALUE;

        // display them all
        System.out.println("The smallest value of:" +
                "\n\tbyte is: " + smallestByte+
                "\n\tshort is: " + smallestShort+
                "\n\tinteger is: " + smallestInteger+
                "\n\tlong is: " + smallestLong+
                "\n\tfloat is: " + smallestFloat+
                "\n\tdouble is: " + smallestDouble);
    }
}
