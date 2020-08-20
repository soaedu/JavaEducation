package java_regular.data.type.arrays.multidimension;

public class SpiralArrayMain {
    public static void main(String[] args) {
        final int SIZE = 4;
        int[][] arr = new int[SIZE][SIZE];

        for(int i=0; i<(SIZE*SIZE); i++) {

        }

        int value = 0;

        // Заполняем массив значениями по спирали
        for(int i=0; i<1; i++) {
            for(int j=0; j<SIZE; j++) {
                // value += (j+1);
                arr[i][j] = ++value;
            }
        }

        for(int i=1; i<SIZE; i++) {
            for(int j=(SIZE-1); ;) {
                arr[i][j] = ++value;
                break;
            }
        }

        for(int i=(SIZE-1); ;) {
            for(int j=(SIZE-2); j>=0; j--) {
                arr[i][j] = ++value;
            }
            break;
        }

        for(int i=(SIZE-2); i>0; i--) {
            for(int j=0; ;) {
                arr[i][j] = ++value;
                break;
            }
        }

        for(int i=1; ;) {
            for(int j=1; j<=2; j++) {
                arr[i][j] = ++value;
            }
            break;
        }

        for(int i=2; ;) {
            for(int j=2; ;) {
                arr[i][j] = ++value;
                break;
            }
            break;
        }

        for(int i=2; ;) {
            for(int j=1; ;) {
                arr[i][j] = ++value;
                break;
            }
            break;
        }

        System.out.println("Array:");
        for(int i=0; i<SIZE; i++) {
            for(int j=0; j<SIZE; j++) {
                System.out.format("%3d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
