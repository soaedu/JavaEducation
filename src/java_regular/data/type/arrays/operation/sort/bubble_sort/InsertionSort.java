package java_regular.data.type.arrays.operation.sort.bubble_sort;

import java_regular.data.type.arrays.operation.sort.SortInterface;

public class InsertionSort implements SortInterface {
    @Override
    public void sort(int[] array) {
        for(int k=1; k <array.length; k++) {
            int item = array[k];
            int prevItemPos = k-1;

            // System.out.println("\n====================================================");
            // System.out.println("k = " +k+ " location = " +location+ " newElement = " +newElement+ " arr[" +location+ "]=" +arr[location]);

            while(prevItemPos >=0 && array[prevItemPos] > item) {
                // System.out.println(Arrays.toString(arr));
                array[prevItemPos+1] = array[prevItemPos];
                prevItemPos--;
                // System.out.println(Arrays.toString(arr));
            }

            array[prevItemPos+1] = item;
        }
    }
}
