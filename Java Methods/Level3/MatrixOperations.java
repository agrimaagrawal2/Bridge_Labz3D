package Level3;

import java.util.*;

public class MatrixOperations {

    // Method to create random matrix
    public static int[][] createMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // random values 0–9
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;
        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    // Method to print matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.printf("%4d", val);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter rows and cols for Matrix A: ");
        int rowsA = sc.nextInt();
        int colsA = sc.nextInt();

        System.out.print("Enter rows and cols for Matrix B: ");
        int rowsB = sc.nextInt();
        int colsB = sc.nextInt();

        // Create random matrices
        int[][] A = createMatrix(rowsA, colsA);
        int[][] B = createMatrix(rowsB, colsB);

        // Display matrices
        System.out.println("\nMatrix A:");
        printMatrix(A);

        System.out.println("\nMatrix B:");
        printMatrix(B);

        // Addition & subtraction possible only if dimensions match
        if (rowsA == rowsB && colsA == colsB) {
            System.out.println("\nA + B:");
            printMatrix(addMatrices(A, B));

            System.out.println("\nA - B:");
            printMatrix(subtractMatrices(A, B));
        } else {
            System.out.println("\nAddition/Subtraction not possible (dimension mismatch)");
        }

        // Multiplication possible if colsA == rowsB
        if (colsA == rowsB) {
            System.out.println("\nA x B:");
            printMatrix(multiplyMatrices(A, B));
        } else {
            System.out.println("\nMultiplication not possible (dimension mismatch)");
        }
    }
}
