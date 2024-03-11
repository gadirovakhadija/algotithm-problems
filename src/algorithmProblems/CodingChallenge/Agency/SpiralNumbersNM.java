package algorithmProblems.CodingChallenge.Agency;

public class SpiralNumbersNM {

    public static void main(String[] args) {
        int n = 6, m = 7;
        int[][] spiral = printSpiral(n, m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%-4d", spiral[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] printSpiral(int n, int m) {
        int[][] spiral = new int[n][m];
        int value = 1;
        int minRow = 0, minCol = 0;
        int maxRow = m - 1, maxCol = n - 1;

        while (value <= n * m) {

            // Top row
            for (int i = minCol; i <= maxCol; i++) {
                spiral[i][minRow] = value++;
            }
            minRow++;

            // Right column
            for (int i = minRow; i <= maxRow; i++) {
                spiral[maxCol][i] = value++;
            }
            maxCol--;

            // Bottom row
            for (int i = maxCol; i >= minCol; i--) {
                spiral[i][maxRow] = value++;
            }
            maxRow--;

            // Left column
            for (int i = maxRow; i >= minRow; i--) {
                spiral[minCol][i] = value++;
            }
            minCol++;
        }

        return spiral;
    }

}
