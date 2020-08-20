package java_regular.data.type.collections.type.sets.hash_set.example2;

import java.util.Arrays;
import java.util.HashSet;

// Convert the hash set to array.
public class HashSetToArrayMain {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Three");
        hashSet.add("Four");
        hashSet.add("Five");

        String[] intArr = new String[hashSet.size()];
        hashSet.toArray(intArr);
        System.out.println("Array: " + Arrays.toString(intArr));
    }
}
