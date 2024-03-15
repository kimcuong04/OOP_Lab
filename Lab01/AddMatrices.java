import java.util.Scanner;

public class AddMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();

        // Input the first matrix
        System.out.println("Enter the elements of the first matrix:");
        int[][] matrix1 = inputMatrix(sc, rows, columns);

        // Input the second matrix
        System.out.println("Enter the elements of the second matrix:");
        int[][] matrix2 = inputMatrix(sc, rows, columns);

        // Add matrices
        int[][] sum = addMatrices(matrix1, matrix2);

        // Display the result
        System.out.println("Sum of the matrices:");
        displayMatrix(sum);

        sc.close();
    }
    public static int[][] inputMatrix(Scanner sc, int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] sumMatrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sumMatrix;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
