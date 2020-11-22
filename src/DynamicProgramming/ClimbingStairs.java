package DynamicProgramming;

public class ClimbingStairs {

    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        for (int i=0; i<=n; i++) {
            if (i==0 || i==1)
                dp[i]=1;
            else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
            return dp[n];
    }

    public static void main(String[] args) {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        int n=45;
        System.out.println(climbingStairs.climbStairs(n));
    }
}
