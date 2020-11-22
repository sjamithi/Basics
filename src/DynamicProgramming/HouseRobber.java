package DynamicProgramming;

public class HouseRobber {

    private static int rob(int[] input) {
        if (input == null || input.length == 0) {
            return 0;
        }
        if (input.length == 1) {
            return input[0];
        }

        if (input.length == 2) {
            return Math.max(input[0], input[1]);
        }

        int[] dp = new int[input.length];
        dp[0] = input[0];
        dp[1] = Math.max(input[0], input[1]);

        for (int i=2; i<dp.length; i++) {
            dp[i] = Math.max(input[i] + dp[i-2], dp[i-1]);
        }

        return dp[input.length-1];
    }

    public static void main(String[] args) {
        int[] input = {2,7,9,3,1};
        System.out.println(rob(input));
    }
}
