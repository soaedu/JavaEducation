package java_regular.io_streams.example3;

import Utils.FileSystemHelper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ScanSumMain {
    public static void main(String[] args) throws IOException {
        Scanner s = null;
        double sum = 0;

        String path = FileSystemHelper.getRelativePath(CopyCharactersMain.class) + "/";
        String inFilePath = path + "usnumbers.txt";

        try {
            s = new Scanner(new BufferedReader(new FileReader(inFilePath)));
            s.useLocale(Locale.US);

            while (s.hasNext()) {
                if (s.hasNextDouble()) {
                    sum += s.nextDouble();
                } else {
                    s.next();
                }
            }
        } finally {
            s.close();
        }

        System.out.println(sum);
    }
}
