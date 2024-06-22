import java.util.Scanner;

class MatrixAdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input for matrix 1
        System.out.println("Enter the number of rows for matrix 1: ");
        int rows1 = scanner.nextInt();
        System.out.println("Enter the number of columns for matrix 1: ");
        int cols1 = scanner.nextInt();

        int[][] Matrix1 = new int[rows1][cols1];
        
        System.out.println("Enter the elements of matrix 1:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                Matrix1[i][j] = scanner.nextInt();
            }
        }

        // Input for matrix 2
        System.out.println("Enter the number of rows for matrix 2: ");
        int rows2 = scanner.nextInt();
        System.out.println("Enter the number of columns for matrix 2: ");
        int cols2 = scanner.nextInt();

        int[][] Matrix2 = new int[rows2][cols2];
        
        System.out.println("Enter the elements of matrix 2:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                Matrix2[i][j] = scanner.nextInt();
            }
        }

        // Check if matrices can be added
        if (rows1 != rows2 || cols1 != cols2) {
            System.out.println("Matrices cannot be added: Dimensions are different.");
        } else {
            // Adding matrices
            int[][] Matrix3 = new int[rows1][cols1];
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols1; j++) {
                    Matrix3[i][j] = Matrix1[i][j] + Matrix2[i][j];
                }
            }

            // Displaying the result matrix
            System.out.println("Resultant matrix after addition:");
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols1; j++) {
                    System.out.print(Matrix3[i][j] + " ");
                }
                System.out.println();
            }
        }
        
    }
}
