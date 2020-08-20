package java_regular.syntax.keyword;

public class UnderscoreMain {
    public static void main(String[] args) {
        // #1
        // String __ = "aaa";
        // #2
        var __ = "aaa";
        var ix = 1;
        var object = new Object();

        System.out.println("Str: " +__+
                "\nNumber: " +ix+
                "\nObject: " +object
                );
    }
}
