package java_regular.data.type.arrays.operation.invert;

import java.util.Arrays;

public class ArrayInvertionMain {
    public static void main(String[] args) {
        int[][] arr = new int[][] {{}, {0}, {0,1}, {0,1,2}, {0,1,2,3,4,5,6,7,8,9}, {0,1,2,3,4,5,6,7,8,9,10}};

        for (int[] subArr: arr) {
            System.out.print(Arrays.toString(subArr) + " -> ");
            ArrayInvertor.invert(subArr);
            System.out.println(Arrays.toString(subArr));
        }
    }
}
