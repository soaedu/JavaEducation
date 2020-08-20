package java_regular.io_streams.example3;

import Utils.FileSystemHelper;

import java.io.*;
import java.math.BigDecimal;
import java.util.Calendar;

public class ObjectStreamsMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path = FileSystemHelper.getRelativePath(CopyCharactersMain.class) + "/";
        String inFilePath = path + "invoicedata.txt";

        final BigDecimal[] prices = {
                new BigDecimal("19.99"),
                new BigDecimal("9.99"),
                new BigDecimal("15.99"),
                new BigDecimal("3.99"),
                new BigDecimal("4.99") };
        final int[] units = { 12, 8, 13, 29, 50 };
        final String[] descs = { "Java T-shirt",
                "Java Mug",
                "Duke Juggling Dolls",
                "Java Pin",
                "Java Key Chain" };

        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(inFilePath)));

            out.writeObject(Calendar.getInstance());
            for (int i = 0; i < prices.length; i ++) {
                out.writeObject(prices[i]);
                out.writeInt(units[i]);
                out.writeUTF(descs[i]);
            }
        } finally {
            out.close();
        }

        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(inFilePath)));

            Calendar date = null;
            BigDecimal price;
            int unit;
            String desc;
            BigDecimal total = new BigDecimal(0);

            date = (Calendar) in.readObject();

            System.out.format ("On %tA, %<tB %<te, %<tY:%n", date);

            try {
                while (true) {
                    price = (BigDecimal) in.readObject();
                    unit = in.readInt();
                    desc = in.readUTF();
                    System.out.format("You ordered %d units of %s at $%.2f%n", unit, desc, price);
                    total = total.add(price.multiply(new BigDecimal(unit)));
                }
            } catch (EOFException e) {}

            System.out.format("For a TOTAL of: $%.2f%n", total);
        } finally {
            in.close();
        }
    }
}
