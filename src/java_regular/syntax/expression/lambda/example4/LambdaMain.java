package java_regular.syntax.expression.lambda.example4;

public class LambdaMain {
    public static void main(String[] args) {
        StringBuilder title = new StringBuilder();

        // Fill the array with integer values and print out only values of even indices
        DataStructure dataStructure = new DataStructure();
        // #1
        title.append("Even numbers (passing iterator - defined in DataStructure class) printEven(String title)");
        dataStructure.printEven(title.toString());

        // #2
        title.delete(0, title.length());
        title.append("Even numbers (passing iterator - defined in DataStructure class) print(DataStructureIterator " +
                "iterator, String title)");
        dataStructure.print(dataStructure.getEvenIterator(), title.toString());

        title.delete(0, title.length());
        title.append("Odd numbers (passing iterator - an anonymous class) " +
                "print(DataStructureIterator iterator, String title)");
        dataStructure.print(new DataStructure.DataStructureIterator() {
                     // Start stepping through the array from the beginning
                     private int nextIndex = 1;

                     public boolean hasNext() {
                         // Check if the current element is the last in the array
                         return (nextIndex <= DataStructure.SIZE - 1);
                     }

                     public Integer next() {

                         // Record a value of an even index of the array
                         //Integer retValue = Integer.valueOf(ds.arrayOfInts[nextIndex]);
                         int retValue = dataStructure.getItem(nextIndex);

                         // Get the next even element
                         nextIndex += 2;

                         return retValue;
                     }
                 }, title.toString()
        );

        title.delete(0, title.length());
        title.append("Even numbers (passing lambda expression) " +
                "print(Function<Integer, Boolean> function, String title)");
        dataStructure.print(index -> {
            if(index % 2 == 0)
                return Boolean.TRUE;

            return Boolean.FALSE;
        }, title.toString());

        title.delete(0, title.length());
        title.append("Odd numbers (passing lambda expression) " +
                "print(Function<Integer, Boolean> function, String title)");
        dataStructure.print(index -> {
            if(index % 2 == 0)
                return Boolean.FALSE;

            return Boolean.TRUE;
        }, title.toString());

        title.delete(0, title.length());
        title.append("Even numbers (passing method references) " +
                "print(Function<Integer, Boolean> function, String title)");
        dataStructure.print(DataStructure::isEvenIndex, title.toString());

        title.delete(0, title.length());
        title.append("Odd numbers (passing method references) " +
                "print(Function<Integer, Boolean> function, String title)");
        dataStructure.print(DataStructure::isOddIndex, title.toString());
    }
}
