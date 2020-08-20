package java_regular.data.type.arrays.operation.sort.bubble_sort;

import java_regular.data.type.arrays.operation.sort.SortInterface;

import java.util.Arrays;

public class ArrSortMain {
    public static void main(String[] args) {
        int[][] array = {
                {},
                {1},
                {0,3,2,1},
                {6,8,3,123,5,4,1,2,0,9,7},
        };

        // #1 BubbleSort
        sorting(new BubbleSort(), array);
        sorting(new InsertionSort(), array);
    }

    private static void sorting(SortInterface sorter, int[][] array) {
        if (array != null) {
            for (int[] subArray : array) {
                int[] newArray = Arrays.copyOf(subArray, subArray.length);
                System.out.println("Array[" +sorter.getClass().getSimpleName()+ "]: " + Arrays.toString(newArray));
                System.out.println("Sorting...");
                sorter.sort(newArray);
                System.out.println("Sorted array: " + Arrays.toString(newArray) + "\n");
            }
        }
    }
}
