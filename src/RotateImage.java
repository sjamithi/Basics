public class RotateImage {
    private void rotate(char[][] matrix) {
        int n = matrix.length;
        for (int i=0; i<n/2; i++) {
            for (int j=0; j<n/2; j++) {
                char temp = matrix[i][j];
                matrix[i][j] = matrix[n-1-j][i];
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
                matrix[j][n-1-i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        char[][] table = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
        RotateImage rotateImage = new RotateImage();
        rotateImage.rotate(table);
    }
}
