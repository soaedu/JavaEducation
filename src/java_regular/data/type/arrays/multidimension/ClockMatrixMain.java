package java_regular.data.type.arrays.multidimension;

import java.io.IOException;
import java.util.Scanner;

public class ClockMatrixMain {
    public static void main(String[] args) throws Exception {
        boolean reply = true;

        do {
            matrixShow();

            reply = requestNewMatrixNeed();
        } while(reply);

        System.out.println("ClockMatrix finish...");
    }

    private static void matrixShow() throws IOException {
        int[][] matrix = getMatrix();

        if (matrix != null) {
            System.out.println("\nМатрица:");

            for(int i=0; i<matrix.length; i++) {
                for(int j=0; j<matrix.length; j++) {
                    System.out.print(matrix[i][j]+ " ");
                }
                System.out.println();
            }
        }
    }

    private static int[][] getMatrix() throws IOException {
        int[][] matrix = null;

        int matrixSize = requestMatrixSize();

        if (matrixSize > 0) {
            matrix = new int[matrixSize][matrixSize];
            populateMatrix(matrix);
        }

        return matrix;
    }

    private static int requestMatrixSize() throws IOException {
        int size = -1;
        String message = "Введите размер матрицы (более 2): ";

        do {
            String userAnswer = requestUserAnswer(message);

            if (userAnswer != null) {
                size = Integer.parseInt(userAnswer);

                if (size <= 2) {
                    continue;
                } else {
                    break;
                }
            }
        } while (true);

        return size;
    }

    private static String requestUserAnswer(String message) throws IOException {
        String userAnswer = null;

        System.out.print(message);

        // #1 Read using BufferedReader
        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        userAnswer = bufferedReader.readLine();*/

        // #2 Read using Scanner
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            userAnswer = scanner.next();
        }

        return userAnswer;
    }

    private static void populateMatrix(int[][] matrix) {
        boolean setOne = false;
        int matrixSize = matrix.length;
        int matrixMiddle = matrixSize/2;

        for(int i=0; i<matrixSize; i++) {
            for(int j=0; j<matrixSize; j++) {
                int itemPos = matrixSize-i-1;

                if(i < matrixMiddle) {
                    if((j >= i) && (j <= itemPos))
                        setOne = true;
                    else
                        setOne = false;
                }
                else
                {
                    if((j <= i) && (j >= itemPos))
                        setOne = true;
                    else
                        setOne = false;
                }

                if(setOne)
                    matrix[i][j] = 8; // 1;
                else
                    matrix[i][j] = 0;
            }
        }
    }

    private static boolean requestNewMatrixNeed() throws IOException {
        String request = "\nХотите получить новую матрицу? (y - Yes, n - No): ";
        return (requestUserAnswer(request).compareToIgnoreCase("y") == 0 );
    }
}
