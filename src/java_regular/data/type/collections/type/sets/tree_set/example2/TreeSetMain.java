package java_regular.data.type.collections.type.sets.tree_set.example2;

import Utils.CollectionHelper;
import java.util.Random;
import java.util.TreeSet;

public class TreeSetMain {
    static TreeSet<Integer> treeSet = new TreeSet<>();
    static Random random = new Random();

    public static void main(String[] args) {
        populateTreeSet();
        getItems();
    }

    private static void populateTreeSet() {
        treeSet.clear();

        while (treeSet.size() < 10) {
            treeSet.add(random.nextInt(100));
        }
        CollectionHelper.printCollection(treeSet, "TreeSet");
    }

    private static void getItems() {
        int checkNumber = random.nextInt(100);

        System.out.print("\n\nlower or equal to \"" +checkNumber+ "\" is: " +treeSet.floor(checkNumber) +
                "\ngreater or equal to \"" +checkNumber+ "\" is: " +treeSet.ceiling(checkNumber));

        System.out.println("\n\nstrictly lower than \"" +checkNumber+ "\" is: " +treeSet.lower(checkNumber)+
                "\nstrictly greater than \"" +checkNumber+ "\" is: " +treeSet.higher(checkNumber));
    }
}
