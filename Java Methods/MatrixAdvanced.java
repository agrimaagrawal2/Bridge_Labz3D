package Level3;

import java.util.*;

public class MatrixAdvanced {

    // Method to create random matrix (2x2 or 3x3 only)
    public static int[][] createMatrix(int size) {
        Random rand = new Random();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = rand.nextInt(10); // 0–9 random values
            }
        }
        return matrix;
    }

    // Method to display a matrix
    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%8.2f", val);
            }
            System.out.println();
        }
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.printf("%4d", val);
            }
            System.out.println();
        }
    }

    // Method to find transpose
    public static int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int[][] trans = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                trans[j][i] = matrix[i][j];
            }
        }
        return trans;
    }

    // Determinant for 2x2
    public static int determinant2x2(int[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    // Determinant for 3x3
    public static int determinant3x3(int[][] m) {
        return m[0][0] * (m[1][1]*m[2][2] - m[1][2]*m[2][1])
             - m[0][1] * (m[1][0]*m[2][2] - m[1][2]*m[2][0])
             + m[0][2] * (m[1][0]*m[2][1] - m[1][1]*m[2][0]);
    }

    // Inverse of 2x2
    public static double[][] inverse2x2(int[][] m) {
        int det = determinant2x2(m);
        if (det == 0) return null;
        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1] / (double)det;
        inv[0][1] = -m[0][1] / (double)det;
        inv[1][0] = -m[1][0] / (double)det;
        inv[1][1] = m[0][0] / (double)det;
        return inv;
    }

    // Inverse of 3x3
    public static double[][] inverse3x3(int[][] m) {
        int det = determinant3x3(m);
        if (det == 0) return null;
        double[][] inv = new double[3][3];

        // Cofactor matrix
        inv[0][0] = (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / (double)det;
        inv[0][1] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]) / (double)det;
        inv[0][2] = (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / (double)det;

        inv[1][0] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]) / (double)det;
        inv[1][1] = (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / (double)det;
        inv[1][2] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]) / (double)det;

        inv[2][0] = (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / (double)det;
        inv[2][1] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]) / (double)det;
        inv[2][2] = (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / (double)det;

        return inv;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter matrix size (2 or 3): ");
        int n = sc.nextInt();

        int[][] matrix = createMatrix(n);

        System.out.println("\nMatrix M:");
        printMatrix(matrix);

        System.out.println("\nTranspose M^T:");
        printMatrix(transpose(matrix));

        if (n == 2) {
            int det = determinant2x2(matrix);
            System.out.println("\nDeterminant = " + det);
            double[][] inv = inverse2x2(matrix);
            if (inv != null) {
                System.out.println("\nInverse:");
                printMatrix(inv);
            } else {
                System.out.println("\nInverse does not exist (det=0).");
            }
        } else if (n == 3) {
            int det = determinant3x3(matrix);
            System.out.println("\nDeterminant = " + det);
            double[][] inv = inverse3x3(matrix);
            if (inv != null) {
                System.out.println("\nInverse:");
                printMatrix(inv);
            } else {
                System.out.println("\nInverse does not exist (det=0).");
            }
        }
    }
}
