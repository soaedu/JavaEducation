package java_regular.data.operation.formatting.example1;

import java.text.DecimalFormat;

public class DecimalFormatMain {
    static public void main(String[] args) {
        customFormat("###,###.###", 123456.789);
        customFormat("###.##", 123456.789);
        customFormat("000000.000", 123.78);
        customFormat("$###,###.###", 12345.67);
    }

    static public void customFormat(String pattern, double value ) {
        DecimalFormat myFormatter = new DecimalFormat(pattern);
        String output = myFormatter.format(value);
        System.out.println("\nRaw value: " +value+
                "\nformat pattern: " +pattern+
                "\nformatted value: " +output);
    }
}
