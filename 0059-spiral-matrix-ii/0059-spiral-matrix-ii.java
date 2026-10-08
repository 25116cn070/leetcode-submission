class Solution {
    public int[][] generateMatrix(int n) {

        int[][] matrix = new int[n][n];

        int startingRow = 0;
        int endingRow = n - 1;

        int startingCol = 0;
        int endingCol = n - 1;

        int value = 1;

        while (startingRow <= endingRow && startingCol <= endingCol) {

            // Top row
            for (int col = startingCol; col <= endingCol; col++) {
                matrix[startingRow][col] = value;
                value++;
            }
            startingRow++;

            // Right column
            for (int row = startingRow; row <= endingRow; row++) {
                matrix[row][endingCol] = value;
                value++;
            }
            endingCol--;

            // Bottom row
            if (startingRow <= endingRow) {
                for (int col = endingCol; col >= startingCol; col--) {
                    matrix[endingRow][col] = value;
                    value++;
                }
                endingRow--;
            }

            // Left column
            if (startingCol <= endingCol) {
                for (int row = endingRow; row >= startingRow; row--) {
                    matrix[row][startingCol] = value;
                    value++;
                }
                startingCol++;
            }
        }

        return matrix;
    }
}