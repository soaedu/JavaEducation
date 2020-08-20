package java_regular.data.operation.sorting.example1;

import java.util.Arrays;

public class CheckIsAnagramMain {
    public static void main(String[] args) {
        String string1 = "Cosmo and Laine:";
        String string2 = "Maid, clean soon!";

        System.out.println("\nTesting whether the following strings are anagrams:");
        System.out.println("\tString 1: " + string1);
        System.out.println("\tString 2: " + string2);

        if (areAnagrams(string1, string2)) {
            System.out.println("They ARE anagrams!");
        } else {
            System.out.println("They are NOT anagrams!");
        }
        System.out.println();
    }

    /**
     * Tests whether the passed-in strings are anagrams
     * containing the exact same number of each letter.
     * Punctuation, case, and order don't matter.
     *
     * @return true if the strings are anagrams; otherwise, false
     */
    public static boolean areAnagrams(String string1, String string2) {
        String workingCopy1 = removeJunk(string1);
        String workingCopy2 = removeJunk(string2);

        // toLowerCase()
        workingCopy1 = workingCopy1.toLowerCase();
        workingCopy2 = workingCopy2.toLowerCase();

        // sort()
        workingCopy1 = sort(workingCopy1);
        workingCopy2 = sort(workingCopy2);

        return workingCopy1.equals(workingCopy2);
    }

    /**
     * Removes punctuation & spaces -- everything except
     * letters from the passed-in string.
     *
     * @return a stripped copy of the passed-in string
     */
    protected static String removeJunk(String string) {
        int i, len = string.length();
        StringBuilder dest = new StringBuilder(len);
        char c;

        for (i = (len - 1); i >= 0; i--) {
            c = string.charAt(i);

            // isLetter()
            if (Character.isLetter(c)) {
                dest.append(c);
            }
        }

        return dest.toString();
    }

    /**
     * Sorts the passed-in string.
     *
     * @return a sorted copy of the passed-in string
     */
    protected static String sort(String string) {
        char[] charArray = string.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
