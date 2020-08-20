package java_regular.io_streams.example1;

import Utils.FileSystemHelper;
import java.io.*;

public class IOStreamsMain {
    public static void main(String[] args) {
        String fileName = "properties.txt";
        StringBuilder filePath = new StringBuilder(FileSystemHelper.getRelativePath(IOStreamsMain.class));
        filePath.append("/").append(fileName);

        try (InputStream inputStream = new FileInputStream(filePath.toString());
             OutputStream outputStream = new FileOutputStream(filePath.append(".copy").toString())) {

            inputStream.transferTo(outputStream);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // FileSystemHelper.showSubDir(IOStreamsMain.class);
    }
}
