package java_unit_test.testng.source_packages.string;

public class MyString {
    public static String concatenate(String part1, String part2) {
        return new StringBuilder(part1).append(part2).toString();
//        return part1;
    }

    public static String getSubstring(String string, int length) {
        return string.substring(0, length);
//        return string.substring(1, length);
    }

    public static boolean contains(String string, String example) {
        return string.contains(example);
//        return string.substring(1, length);
    }
}
