package java_regular.data.type.arrays.multidimension.matrix_multiplication.example1;

public class MultiplicationMatrixMain {
    public static void main(String[] args) {
        int[][] matrix1 = {{1,3},{2,4}};
        int[][] matrix2 = {{0,1},{5,6}};

        int size = 2;
        int[][] matrix_result = new int[size][size];

        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                for(int n=0; n<size; n++) {
                    matrix_result[i][j] += matrix1[i][n]*matrix2[n][j];
                }
            }
        }

        for(int[] value : matrix_result) {
            for(int val: value) {
                System.out.print(val +" ");
            }
            System.out.println();
        }
    }
}
