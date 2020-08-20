package Utils;

import java_regular.io_streams.example1.IOStreamsMain;

import java.io.File;
import java.util.Objects;

public class FileSystemHelper {
    public static String getRelativePath(Class target) {
        StringBuilder path = new StringBuilder("./src/");
        path.append(target.getPackageName().replace(".", "/"));
        return path.toString();
    }

    public static File[] getInnerFiles(File dir) {
        return Objects.requireNonNull(dir.listFiles());
    }

    public static boolean checkDirectory(File dir) throws Exception {
        if (!dir.exists()) {
            throw new Exception("dir doesn't exists");
        }

        if (!dir.isDirectory()) {
            throw new Exception("is not a directory");
        }

        return true;
    }

    public static void showSubDir(Class target) {
        try {
            String path = FileSystemHelper.getRelativePath(target);
            File dir = new File(path);

            if (FileSystemHelper.checkDirectory(dir)) {
                StringBuilder result = new StringBuilder("Directory(" + path + "):");

                File[] fileList = FileSystemHelper.getInnerFiles(dir);

                if (fileList.length > 0) {
                    result.append("\n").append("entries sum: ").append(fileList.length);

                    for (File entry : fileList) {
                        result.append("\n").append(entry.getAbsolutePath());
                    }
                } else {
                    result.append("\n\t").append("is empty");
                }

                System.out.println(result.toString());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
