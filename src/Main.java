import algorithmProblems.LeetCode.TwoSum;

public class Main {

    public static void main(String[] args) {
        int n = 5;
        int[][] spiral = printSpiral(n);
        printSpiral(spiral);
    }
    public static int[][] printSpiral(int n) {
        int[][] spiral = new int[n][n];
        int value = 1;
        int minRow = 0, minCol = 0;
        int maxRow = n - 1, maxCol = n - 1;

        while (value <= n * n) {
            // Top row
            for (int i = minCol; i <= maxCol; i++) {
                spiral[minRow][i] = value++;
            }
            minRow++;

            // Right column
            for (int i = minRow; i <= maxRow; i++) {
                spiral[i][maxCol] = value++;
            }
            maxCol--;

            // Bottom row
            for (int i = maxCol; i >= minCol; i--) {
                spiral[maxRow][i] = value++;
            }
            maxRow--;

            // Left column
            for (int i = maxRow; i >= minRow; i--) {
                spiral[i][minCol] = value++;
            }
            minCol++;
        }

        return spiral;
    }

    public static void printSpiral(int[][] spiral) {
        int n = spiral.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%-4d", spiral[i][j]);
            }
            System.out.println();
        }
    }

}
