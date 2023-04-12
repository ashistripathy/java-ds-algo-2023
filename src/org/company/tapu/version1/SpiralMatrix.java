package org.company.tapu.version1;

public class SpiralMatrix {
    public static void main(String[] args) {
        int n = 5; // size of matrix
        int[][] matrix = new int[n][n];
        int num = 1; // starting number
        int rowStart = 0, rowEnd = n - 1, colStart = 0, colEnd = n - 1;

        while (num <= n * n) {
            // Traverse right
            for (int j = colStart; j <= colEnd; j++) {
                matrix[rowStart][j] = num++;
            }
            rowStart++;

            // Traverse down
            for (int i = rowStart; i <= rowEnd; i++) {
                matrix[i][colEnd] = num++;
            }
            colEnd--;

            // Traverse left
            for (int j = colEnd; j >= colStart; j--) {
                matrix[rowEnd][j] = num++;
            }
            rowEnd--;

            // Traverse up
            for (int i = rowEnd; i >= rowStart; i--) {
                matrix[i][colStart] = num++;
            }
            colStart++;
        }

        // Print matrix
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
    }
}
