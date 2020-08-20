package java_regular.data.type.arrays.operation.sort.bubble_sort;

import java_regular.data.type.arrays.operation.sort.SortInterface;

public class BubbleSort implements SortInterface {
    @Override
    public void sort(int[] arr) {
        if(arr.length > 1) {
            // for(int barrier = arr.length-1; barrier>=0; barrier--)
            for(int fwdIndex = 0; fwdIndex<=arr.length-1; fwdIndex++) {
                // System.out.println("barrier = " +barrier);

                // for(int index = 0; index<barrier; index++)
                for(int bckwdIndex = arr.length-1; bckwdIndex>fwdIndex; bckwdIndex--) {
                    // System.out.println("arr[" +index+    "] < arr[" +(index-1)+ "]");
                    // System.out.println("    " +arr[index]+ "  <     " +arr[index-1]);

                    if(arr[bckwdIndex] < arr[bckwdIndex-1]) {
                        int temp = arr[bckwdIndex];
                        arr[bckwdIndex] = arr[bckwdIndex-1];
                        arr[bckwdIndex-1] = temp;
                    }
                    // System.out.println("\n" +Arrays.toString(arr)+"\n");
                }
            }
        }
    }
}
