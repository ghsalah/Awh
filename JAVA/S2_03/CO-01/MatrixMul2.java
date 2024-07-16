import java.util.*;

public class MatrixMul2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows of A : ");
        int row1 = input.nextInt();
        System.out.println("Enter the number of columns of A : ");
        int col1 = input.nextInt();

        System.out.println("Enter the number of rows of B : ");
        int row2 = input.nextInt();
        System.out.println("Enter the number of columns of B : ");
        int col2 = input.nextInt();

        if (col1 != row2) {
            System.out.println("Cannot multiply matrices: Number of columns of A must equal number of rows of B.");
        } else {
            int[][] matrixA = new int[row1][col1];
            int[][] matrixB = new int[row2][col2];

            // Input matrices
            inputMatrix("A", matrixA, input);
            inputMatrix("B", matrixB, input);

            // Multiply matrices
            int[][] matrixC = multiplyMatrices(matrixA, matrixB);

            // Display matrices
            displayMatrix("A", matrixA);
            displayMatrix("B", matrixB);
            displayMatrix("C (A * B)", matrixC);
        }
    }

    // Method to input matrix elements
    public static void inputMatrix(String matrixName, int[][] matrix, Scanner input) {
        System.out.println("Enter elements of matrix " + matrixName + ":");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("Enter element " + matrixName + "[" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;

        int[][] C = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                C[i][j] = 0;
                for (int k = 0; k < colsA; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return C;
    }

    // Method to display matrix
    public static void displayMatrix(String matrixName, int[][] matrix) {
        System.out.println("Matrix " + matrixName + ":");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
