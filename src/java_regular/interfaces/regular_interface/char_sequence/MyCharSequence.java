package java_regular.interfaces.regular_interface.char_sequence;

// CharSequenceDemo presents a String value -- backwards.
public class MyCharSequence implements java.lang.CharSequence {
    private String str;

    public MyCharSequence(String str) {
        // It would be much more efficient to just reverse the string
        // in the constructor. But a lot less fun!
        this.str = str;
    }

    // If the string is backwards, the end is the beginning!
    private int fromEnd(int i) {
        return str.length() - 1 - i;
    }

    @Override
    public char charAt(int i) {
        if ((i < 0) || (i >= str.length())) {
            throw new StringIndexOutOfBoundsException(i);
        }
        return str.charAt(fromEnd(i));
    }


    @Override
    public int length() {
        return str.length();
    }

    @Override
    public java.lang.CharSequence subSequence(int start, int end) {
        if (start < 0) {
            throw new StringIndexOutOfBoundsException(start);
        }
        if (end > str.length()) {
            throw new StringIndexOutOfBoundsException(end);
        }
        if (start > end) {
            throw new StringIndexOutOfBoundsException(start - end);
        }

        StringBuilder sub = new StringBuilder(str.subSequence(fromEnd(end), fromEnd(start)));
        return sub.reverse();
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder(this.str);
        return s.reverse().toString();
    }

    // Random int from 0 to max. As random() generates values between 0 and 0.9999
    public static int random(int max) {
        return (int) Math.round(Math.random() * (max+1));
    }

    public void printReversed() {
        System.out.println("\nReversed sequence:");
        for (int i = 0; i < length(); i++) {
            System.out.print(charAt(i));
        }
    }

    // exercise subSequence() and length();
    public void printSubSequence() {
        System.out.println("\n\nReversed subsequence:");
        int start = MyCharSequence.random(length() - 1);
        int end = MyCharSequence.random(length() - 1 - start) + start;
        System.out.println(subSequence(start, end));
    }
}
