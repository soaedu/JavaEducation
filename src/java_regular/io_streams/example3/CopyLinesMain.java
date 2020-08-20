package java_regular.io_streams.example3;

import Utils.FileSystemHelper;

import java.io.*;

public class CopyLinesMain {
    public static void main(String[] args) throws IOException {
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        String path = FileSystemHelper.getRelativePath(CopyCharactersMain.class) + "/";
        String inFilePath = path + "xanadu.txt";
        String outFilePath = path + "characteroutput.txt";

        try {
            inputStream = new BufferedReader(new FileReader(inFilePath));
            outputStream = new PrintWriter(new FileWriter(outFilePath));

            String l;
            while ((l = inputStream.readLine()) != null) {
                outputStream.println(l);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
