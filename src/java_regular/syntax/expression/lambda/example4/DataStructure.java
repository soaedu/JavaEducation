package java_regular.syntax.expression.lambda.example4;

public class DataStructure {
    public final static int SIZE = 15;
    private int[] arrayOfInts;

    DataStructure() {
        populateArray();
    }

    private void populateArray() {
        arrayOfInts = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }

    public int getItem(int index) {
        return arrayOfInts[index];
    }

    public DataStructureIterator getEvenIterator() {
        return new EvenIterator();
    }

    // Print out values of even indices of the array
    public void printEven(String title) {
        // #1
        // DataStructureIterator iterator = this.new EvenIterator();
        // #2
        DataStructureIterator iterator = getEvenIterator();
        print(iterator, title);
    }

    // Print numbers in accordance with "DataStructureIterator.next()" method realization
    public void print(DataStructureIterator iterator, String title) {
        System.out.println("\n" +title + ":");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    public void print(java.util.function.Function<Integer, Boolean> function, String title) {
        System.out.println("\n" +title + ":");
        for(int i=0; i< SIZE; i++) {
            if(function.apply(i)) {
                System.out.print(arrayOfInts[i] + " ");
            }
        }
        System.out.println();
    }

    public static Boolean isEvenIndex(Integer index) {
        if(index % 2 == 0)
            return Boolean.TRUE;

        return Boolean.FALSE;
    }

    public static Boolean isOddIndex(Integer index) {
        if(index % 2 == 0)
            return Boolean.FALSE;

        return Boolean.TRUE;
    }


    interface DataStructureIterator extends java.util.Iterator<Integer> { }

    // Inner class implements the DataStructureIterator interface,
    // which extends the Iterator<Integer> interface
    private class EvenIterator implements DataStructureIterator {
        // Start stepping through the array from the beginning
        private int nextIndex = 0;

        public boolean hasNext() {
            // Check if the current element is the last in the array
            return (nextIndex <= SIZE - 1);
        }

        public Integer next() {
            // Record a value of an even index of the array
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);

            // Get the next even element
            nextIndex += 2;
            return retValue;
        }
    }
}
