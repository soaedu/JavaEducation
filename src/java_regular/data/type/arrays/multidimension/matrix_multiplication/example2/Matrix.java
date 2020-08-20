package java_regular.data.type.arrays.multidimension.matrix_multiplication.example2;

public class Matrix {
    private int[][] a;

    public Matrix(int n, int m) {
        a = new int[n][m];
    }

    public int getVerticalSize(){
        return a.length;
    }

    public int getHorizontalSize(){
        return a[0].length;
    }

    public int getElement(int i, int j) {
        return a[i][j];
    }

    public void setElement(int i,int j,int value){
        a[i][j] = value;
    }

    public String toString() {
        String s = "\nMatrix size: " +a.length+ "x" +a[0].length+ "\n";

        for(int[] vector : a){
            for(int value : vector)
                s += value+ "\t";
            s += "\n";
        }

        return s;
    }
}
