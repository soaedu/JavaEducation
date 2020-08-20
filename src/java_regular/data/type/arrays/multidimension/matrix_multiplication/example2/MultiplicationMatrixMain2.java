package java_regular.data.type.arrays.multidimension.matrix_multiplication.example2;

public class MultiplicationMatrixMain2 {
    public static void main(String[] args) {
        int n=2, m=3, l=4;

        Matrix p = MatrixFactory.getNewRandomizedMatrix(n, m);

        Matrix q = MatrixFactory.getNewRandomizedMatrix(m, l);

        System.out.println("Matrix first is: " +p);
        System.out.println("Matrix second is: " +q);

        try {
            Matrix result = MatrixMultiplicator.multiply(p, q);
            System.out.println("Matrix product is: " +result);
        } catch(MultiplicationException e) {
            System.out.println("Matrices could not be multiplied." );
        }
    }
}
