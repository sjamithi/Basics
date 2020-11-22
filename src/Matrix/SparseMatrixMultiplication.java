package Matrix;

public class SparseMatrixMultiplication {
    public static int[][] multiply(int[][] A, int[][] B) {
        int[][] c = new int[A.length][B[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (A[i][j] != 0) {
                    for (int k = 0; k < B[0].length; k++) {
                        if (B[j][k] != 0) {
                            c[i][k] += A[i][j] * B[j][k];
                        }
                    }
                }
            }
        }
        return c;
    }



    public static void main(String[] args) {
       int[][] A = {
               {1, 0, 0},
               {-1, 0, 3}
                },

        B = {
                {7, 0, 0 },
                {0, 0, 0 },
                {0, 0, 1 }
            };

//        int[][] A = {{1, -5}}, B = {{12}, {-1}};

       int c[][] = multiply(A, B);

       for (int i=0; i < c.length; i++) {
           for (int j = 0; j < c[0].length; j++) {
               System.out.print(c[i][j] + " ");
           }
           System.out.println();
       }
    }
}
