class Solution {
    public Boolean find(int row, int col, int k, int[][] matrix) {
        if (row + k > matrix.length || col + k > matrix[0].length) return false;

        for (int i = row; i < row + k; i++) {
            for (int j = col; j < col + k; j++) {
                if (matrix[i][j] != 1) return false;
            }
        }
        return true;
    }

    public int countSquares(int[][] matrix) {
        int min = Math.min(matrix.length, matrix[0].length);
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                for (int k = 1; k <= min; k++) { 
                    if (find(i, j, k, matrix)) count++;
                    else break;
                }
            }
        }
        return count;
    }
}