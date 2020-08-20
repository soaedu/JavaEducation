package java_regular.data.type.collections.type.lists.vector_list;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class VectorMain {
    static Vector vector = new Vector();

    public static void main(String[] args) {
        addItems();

        clearVector();
        addAllFrom();

        cloneCollection();
        checkContains();
        checkCapacity();
        getItem();
        indexOfItem();
        removeItem();
        checkEquality();
        printVectorAsArray();
        changeItems();
        getHashCode();
        copyNumbersToArray();

        checkIsEmpty();
    }

    private static void addItems() {
        // add() - appends the specified element to the end of this Vector.
        /*vector.add(1);
        vector.add(2);
        vector.add("Java");
        vector.add("Kotlin");
        vector.add(3);*/

        // add(index. element) - inserts the specified element at the specified position in this Vector.
        vector.add(0, 1);
        vector.add(1, 2);
        vector.add(2, "Java");
        vector.add(3, "Kotlin");
        vector.add(4, 3);
        printVector();

        String itemToInsert = "C++";
        int itemPosition = 4;
        // insertElementAt(Object obj, int index) - inserts the specified object as a component in this vector at
        //                                              the specified index.
        System.out.print("\nInserting item \"" +itemToInsert+ "\" in position " +itemPosition+ "...");
        vector.insertElementAt(itemToInsert, itemPosition);
        printVector();
    }

    private static void addAllFrom() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add("Python");
        arrayList.add("Javascript");
        arrayList.add(20);

        // addAll(Collection c) - appends all of the elements in the specified Collection to the end of this Vector.
        // vector.addAll(arrayList);

        // addAll(int index, Collection c) - inserts all of the elements in the specified Collection into this
        // Vector at the specified position.
        vector.add(2);
        // copying all element of array list int0 vector
        vector.addAll(1, arrayList);

        printVector();
    }

    private static void cloneCollection() {
        // clone() - returns a clone of this vector.
        Vector vectorClone = (Vector) vector.clone();
        System.out.println("\nClonedVector: " +vectorClone);
    }

    private static void checkContains() {
        int chkValue1 = 100;
        int chkValue2 = 200;

        vector.add(chkValue1);

        // contains(Object o)   - returns "true" if this vector contains the specified element.
        String checkResult1 = (vector.contains(chkValue1) ? "contains" : "doesn't contain");
        System.out.println("\nVector " +checkResult1+ " value \"" +chkValue1+ "\"");

        String checkResult2 = (vector.contains(chkValue2) ? "contains" : "doesn't contain");
        System.out.println("Vector " +checkResult2+ " value \"" +chkValue2+ "\"");
    }

    private static void checkCapacity() {
        int newCapacity = 22;
        int newSize = 15;

        // capacity()
        System.out.println("\nVector initial capacity: " + vector.capacity());

        // ensureCapacity(int minCapacity) - increases the capacity of this vector, if necessary, to ensure that it
        //                                      can hold at least the number of components specified by the
        //                                      minCapacity argument.
        if (vector.capacity() < newCapacity) {
            System.out.println("Ensure capacity to " + newCapacity + "...");
            vector.ensureCapacity(newCapacity);
            System.out.println("Vector new capacity: " + vector.capacity());
        }

        // trimToSize() - trims the capacity of this vector to be the vector’s current size.
        System.out.print("\nTrim the size of the \"vector\"...");
        vector.trimToSize();
        System.out.print("\nVector capacity: " + vector.capacity());

        // size() - returns the number of components in this vector.
        System.out.print("\n\nVector size: " + vector.size());

        // setSize(int newSize) - sets the size.
        System.out.print("\nSetting new size...");
        vector.setSize(newSize);
        System.out.println("\nVector size: " + vector.size());
    }

    private static void getItem() {
        int position = 2;

        printVector();
        // firstElement()   - returns the first component (the item at index 0) of this vector.
        // lastElement() - returns the last component of the vector.
        // get(int index)   - returns the element at the specified position in this Vector.
        System.out.println("\nVector:" +
                "\n\t first item is: " +vector.firstElement()+
                "\n\t last item is: " +vector.lastElement()+
                "\n\t item in position \"" +(position+1)+ "\" is: " +vector.get(position));
    }

    private static void indexOfItem() {
        int checkValue1 = 100;
        int checkValue2 = 200;

        System.out.print("\nAdd item \'" +checkValue1+"\" to the head of the vector...");
        vector.add(0, checkValue1);
        printVector();

        // indexOf(Object o)    - returns the:
        //                             * index of the first occurrence of the specified element in this vector
        //                             * -1 if this vector does not contain the element.
        int result1 = vector.indexOf(checkValue1);
        String checkResult1 = (result1 >= 0 ? " is found in position " +result1: "wasn't found");
        System.out.println("indexOf():" +
                "\n\tVector's item \"" +checkValue1+ "\" " +checkResult1);

        int result2 = vector.indexOf(checkValue2);
        String checkResult2 = (result2 >= 0 ? " is found in position " +result2: "wasn't found");
        System.out.println("\tVector's item \"" +checkValue2+ "\" " +checkResult2);

        // lastIndexOf(Object o) - returns the:
        //                              * index of the last occurrence of the specified element in this vector,
        //                              * -1 if this vector does not contain the element.
        int result3 = vector.lastIndexOf(checkValue1);
        String checkResult3 = (result3 >= 0 ? " is found in position " +result3: "wasn't found");
        System.out.println("lastIndexOf():" +
                "\n\tVector's item \"" +checkValue1+ "\" " +checkResult3);

        int result4 = vector.lastIndexOf(checkValue2);
        String checkResult4 = (result4 >= 0 ? "is found in position " +result4: "wasn't found");
        System.out.println("\tVector's item \"" +checkValue2+ "\" " +checkResult4);
    }

    private static void checkIsEmpty() {
        // isEmpty() - tests if this vector has no components.

        String result1 = (vector.isEmpty() ? "Yes" : "No");
        System.out.println("\nVector:" +vector+
                "\n\tis empty: " +result1);

        if (!vector.isEmpty()) {
            System.out.println("Clearing collection");
            vector.clear();
        }

        String result2 = (vector.isEmpty() ? "Yes" : "No");
        System.out.println("Vector:" +vector+
                "\n\tis empty: " +result2);
    }

    private static void removeItem() {
        int itemToRemove1 = 100;
        int itemToRemove2 = 200;
        
        printVector();

        // remove(Object o) - removes the first occurrence of the specified element in this Vector.
        //                      If the Vector does not contain the element, it is unchanged.
        // #1
        int index1 = vector.indexOf(itemToRemove1);
        if (index1 >= 0) {
            System.out.print("Removing of the item \"" +itemToRemove1+ "\" in position \"" +index1+ "\"...");
            vector.remove(index1);
            printVector();
        } else {
            System.out.println("Removing of the item \"" +itemToRemove1+ "\" is impossible!");
        }

        // #2
        int index2 = vector.indexOf(itemToRemove2);
        if (index2 >= 0) {
            System.out.print("Removing of the item \"" +index2+ "\"...");
            vector.remove(index2);
            printVector();
        } else {
            System.out.println("Removing of the item \"" +itemToRemove2+ "\" is impossible!");
        }

        // removeElement(Object obj) - removes the first occurrence of the argument from this vector.
        String itemToRemove = "Python";
        System.out.print("Removing the item \"" +itemToRemove+ "\"...");
        vector.removeElement(itemToRemove);
        printVector();
    }

    private static void checkEquality() {
        // equals(Object o) - compares the specified Object with this Vector for equality.
        Vector vectorClone = (Vector) vector.clone();

        System.out.println("\nVector: " +vector+
                "\nClonedVector: " +vectorClone+
                "\n\tare equal: " +vector.equals(vectorClone));

        System.out.println("Removing the first item in the \"clonedVector\"...");
        vectorClone.remove(0);

        System.out.println("Vector: " +vector+
                "\nClonedVector: " +vectorClone+
                "\n\tare equal: " +vector.equals(vectorClone));
    }

    private static void printVectorAsArray() {
        // toArray() - returns an array representation of this Vector, containing the String representation of
        //              each element.
        System.out.println("\nVector as array: " + Arrays.toString(vector.toArray()));
    }

    private static void changeItems() {
        int itemToSetValue = 200;
        int itemToSetIndex = 4;

        // setElementAt(Object obj, int index)  - sets the component at the specified index of this vector to be
        //                                          the specified object.
        printVector();
        System.out.print("Setting value \"" +itemToSetValue+ "\" to the current item in position: " +
                (itemToSetIndex+1));
        vector.setElementAt(itemToSetValue, itemToSetIndex);
        printVector();

        // retainAll(Collection c)  - retains only the elements in this Vector that are contained in the specified
        //                              Collection.
        Vector vector1 = new Vector();
        vector1.add(1);
        vector1.add(2);
        vector1.add("Java");
        vector1.add("Kotlin");
        vector1.add(3);

        System.out.print("\nVector1: " +vector1);
        System.out.print("\nRetaining items...");
        vector1.retainAll(vector);
        printVector();
        System.out.println("Vector1: " +vector1);
    }

    private static void getHashCode() {
        // hashCode() - returns the hash code value for this Vector.
        System.out.println("\nVector hashCode: " +vector.hashCode());
    }

    private static void copyNumbersToArray() {
        int size = 0;

        Vector intVector = new Vector();

        // copyInto(Object[] anArray)   - copies the components of this vector into the specified array.
        System.out.println("\nCopying numbers from \"vector\" to \"intArray\"...");
        for (int i=0; i<vector.size()-1; i++) {
            Object item = vector.get(i);
            if (item instanceof Integer) {
                intVector.add(item);
            }
        }
        System.out.println("IntVector: " +intVector);
        Integer[] intArray = new Integer[intVector.size()];
        intVector.copyInto(intArray);
        System.out.println("IntArray: " +Arrays.toString(intArray));
    }

    // private static void () {}

    private static void clearVector() {
        if (vector != null) {
            // clear() - removes all of the elements from this vector.
            vector.clear();
        }

        if (vector != null) {
            // removeAllElements() - removes all components from this vector and sets its size to zero.
            vector.removeAllElements();
        }
    }

    private static void printVector() {
        // #1
        System.out.println("\nVector: " + vector);

        // toString() - is used to return a string representation of this Vector, containing the String representation
        //                  of each element.
        // #2
        // System.out.println("\nVector: " + vector.toString());
    }
}
