package Utils;

public class ArrayHelper {
    public static void printArray(char[] array) {
        System.out.print("charArr: ");
        for (char item: array) {
            System.out.print(" " +item+ "\t");
        }
    }

    public static void printArray(int[] array) {
        System.out.print("intArr: ");
        for (int item: array) {
            System.out.print(" " +item+ "\t");
        }
    }

    public static void swapItems(int[] arr, int item1Pos, int item2Pos) {
        int temp = arr[item1Pos];
        arr[item1Pos] = arr[item2Pos];
        arr[item2Pos] = temp;
    }

}
