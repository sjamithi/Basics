package DynamicProgramming;

public class LongestCommonSubArray {

    private static int lcs(char[] X, char[] Y, int n, int m) {
        int res = 0;
        int[][] LCS = new int[n+1][m+1];

        for (int i=0; i<=n; i++) {
            for (int j=0; j<=m; j++) {
                if (i == 0 || j == 0) {
                    LCS[i][j] = 0;
                } else if (X[i-1] == Y[j-1]) {
                    LCS[i][j] = LCS[i-1][j-1] + 1;
                    res = Math.max(res, LCS[i][j]);
                } else
                    LCS[i][j] = 0;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String X = "OldSite:GeeksforGeeks.org";
        String Y = "NewSite:GeeksQuiz.com";
        System.out.println(lcs(X.toCharArray(), Y.toCharArray(), X.length(), Y.length()));
    }
}
