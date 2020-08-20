package java_regular.interfaces.regular_interface.char_sequence;

public class CharSequenceMain {
    public static void main(String[] args) {
        String str = "Write a class that implements the CharSequence interface found in the java.lang package.";
        MyCharSequence sequence = new MyCharSequence(str);
        sequence.printReversed();
        sequence.printSubSequence();
    }
}
