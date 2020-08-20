package java_regular.io_streams.example3;

import Utils.FileSystemHelper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScanXanMain {
    public static void main(String[] args) throws IOException {
        Scanner s = null;

        String path = FileSystemHelper.getRelativePath(CopyCharactersMain.class) + "/";
        String inFilePath = path + "xanadu.txt";

        try {
            s = new Scanner(new BufferedReader(new FileReader(inFilePath)));

            while (s.hasNext()) {
                System.out.println(s.next());
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
}
