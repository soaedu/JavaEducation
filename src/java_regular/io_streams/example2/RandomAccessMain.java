package java_regular.io_streams.example2;

import Utils.FileSystemHelper;

import java.io.*;
import java.util.Vector;

public class RandomAccessMain {
    private Vector<Integer> vector;
    private static final int SIZE = 10;

    public static void main(String[] args) {
        new RandomAccessMain();
    }

    public RandomAccessMain() {
        vector = new Vector<>(SIZE);
        for (int i = 0; i < SIZE; i++)
            vector.addElement(new Integer(i));

        this.readList();
        this.writeList();
    }

    public void readList() {
        String fileName = "infile.txt";
        StringBuilder filePath = new StringBuilder(FileSystemHelper.getRelativePath(RandomAccessMain.class));
        filePath.append("/").append(fileName);

        String line = null;

        try {
            RandomAccessFile raf = new RandomAccessFile(filePath.toString(), "r");
            while ((line = raf.readLine()) != null) {
                Integer i = Integer.parseInt(line);
                System.out.println(i);
                vector.addElement(i);
            }
        } catch(FileNotFoundException fnf) {
            System.err.println("File: " + fileName + " not found.");
        } catch (IOException io) {
            System.err.println(io.toString());
        }
    }

    public void writeList() {
        String fileName = "outfile.txt";
        StringBuilder filePath = new StringBuilder(FileSystemHelper.getRelativePath(RandomAccessMain.class));
        filePath.append("/").append(fileName);

        PrintWriter out = null;

        try {
            out = new PrintWriter(new FileWriter(filePath.toString()));

            for (int i = 0; i < vector.size(); i++)
                out.println("Value at: " + i + " = " + vector.elementAt(i));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Caught ArrayIndexOutOfBoundsException: " +
                    e.getMessage());
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        } finally {
            if (out != null) {
                System.out.println("Closing PrintWriter");
                out.close();
            } else {
                System.out.println("PrintWriter not open");
            }
        }
    }
}
