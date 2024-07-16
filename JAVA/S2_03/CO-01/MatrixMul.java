import java.util.*;

public class MatrixMul {
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
            int[][] matrixC = new int[row1][col2]; // Resultant matrix will have dimensions row1 x col2

            // Input matrix A
            System.out.println("Enter elements of matrix A:");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    System.out.print("Enter element A[" + i + "][" + j + "]: ");
                    matrixA[i][j] = input.nextInt();
                }
            }

            // Input matrix B
            System.out.println("Enter elements of matrix B:");
            for (int i = 0; i < row2; i++) {
                for (int j = 0; j < col2; j++) {
                    System.out.print("Enter element B[" + i + "][" + j + "]: ");
                    matrixB[i][j] = input.nextInt();
                }
            }

            // Perform matrix multiplication
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    matrixC[i][j] = 0;
                    for (int k = 0; k < col1; k++) {
                        matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
                    }
                }
            }

            // Output matrices A, B, and their product C
            System.out.println("Matrix A:");
            printMatrix(matrixA);

            System.out.println("Matrix B:");
            printMatrix(matrixB);

            System.out.println("Resultant Matrix C (A * B):");
            printMatrix(matrixC);
        }
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
