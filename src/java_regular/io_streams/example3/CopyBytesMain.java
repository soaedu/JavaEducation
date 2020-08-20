package java_regular.io_streams.example3;

import Utils.FileSystemHelper;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytesMain {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        String path = FileSystemHelper.getRelativePath(CopyBytesMain.class) + "/";
        String inFilePath = path + "xanadu.txt";
        String outFilePath = path + "outagain.txt";

        try {
            in = new FileInputStream(inFilePath);
            out = new FileOutputStream(outFilePath);

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
