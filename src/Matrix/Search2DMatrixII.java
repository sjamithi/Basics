package Matrix;

public class Search2DMatrixII {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0)
            return false;

        for (int i = 0; i< matrix.length; i++) {
            for (int j=0; j< matrix[0].length; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean searchMatrixOptimized(int[][] matrix, int target) {
        int m = matrix.length-1, n = matrix[0].length-1;
        int i = m, j = 0;

        while (i >= 0 && j <= n) {
            if (matrix[i][j] > target) {
                i--;
            } else if (matrix[i][j] < target) {
                j++;
            } else if (matrix[i][j] == target)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix =
                {
                        {1,   4,  7, 11, 15},
                        {2,   5,  8, 12, 19},
                        {3,   6,  9, 16, 22},
                        {10, 13, 14, 17, 24},
                        {18, 21, 23, 26, 30} };
        System.out.println(searchMatrix(matrix, 5));
        System.out.println(searchMatrixOptimized(matrix, 5));
    }
}
