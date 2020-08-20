package java_regular.io_streams.example3;

import Utils.FileSystemHelper;

import java.io.*;

public class DataStreamsMain {
    public static void main(String[] args) throws IOException {
        DataOutputStream out = null;
        String path = FileSystemHelper.getRelativePath(CopyCharactersMain.class) + "/";
        String inFilePath = path + "invoicedata.txt";

        final double[] prices = { 19.99, 9.99, 15.99, 3.99, 4.99 };
        final int[] units = { 12, 8, 13, 29, 50 };
        final String[] descriptions = { "Java T-shirt",
                "Java Mug",
                "Duke Juggling Dolls",
                "Java Pin",
                "Java Key Chain" };

        try {
            out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(inFilePath)));

            for (int i = 0; i < prices.length; i ++) {
                out.writeDouble(prices[i]);
                out.writeInt(units[i]);
                out.writeUTF(descriptions[i]);
            }
        } finally {
            out.close();
        }

        DataInputStream in = null;
        double total = 0.0;
        try {
            in = new DataInputStream(new BufferedInputStream(new FileInputStream(inFilePath)));

            double price;
            int unit;
            String desc;

            try {
                while (true) {
                    price = in.readDouble();
                    unit = in.readInt();
                    desc = in.readUTF();
                    System.out.format("You ordered %d units of %s at $%.2f%n", unit, desc, price);
                    total += unit * price;
                }
            } catch (EOFException e) { }
            System.out.format("For a TOTAL of: $%.2f%n", total);
        }
        finally {
            in.close();
        }
    }
}
