package java_regular.data.type.arrays.multidimension.matrix_multiplication.example2;

public class MatrixFactory {
    public static Matrix getNewRandomizedMatrix(int n, int m) {
        Matrix matrix = new Matrix(n, m);

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                matrix.setElement(i, j, (int)(Math.random()*m*m));
            }
        }
        return matrix;
    }
}
