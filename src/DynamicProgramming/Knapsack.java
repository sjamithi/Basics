package DynamicProgramming;

public class Knapsack {
    private static int knapsackRec(int[] val, int[] wt, int W, int n) {
        if (n ==0 || W ==0)
            return 0;
        if (wt[n-1] > W)
            return knapsackRec(val, wt, W, n-1);
        return Math.max(knapsackRec(val, wt, W, n-1), val[n-1] + knapsackRec(val, wt, W - wt[n-1], n-1));
    }

    private static int knapsackDP(int[] val, int[] wt, int W, int n) {
        int i, w;
        int K[][] = new int[n+1][W+1];

        // Build table K[][] in bottom up manner
        for (i = 0; i <= n; i++)
        {
            for (w = 0; w <= W; w++)
            {
                if (i==0 || w==0)
                    K[i][w] = 0;
                else if (wt[i-1] <= w)
                    K[i][w] = Math.max(val[i-1] + K[i-1][w-wt[i-1]],  K[i-1][w]);
                else
                    K[i][w] = K[i-1][w];
            }
        }

        return K[n][W];
    }

    public static void main(String[] args) {
        int[] val = new int[] {60, 100, 120};
        int[] wt = new int[] {10, 20, 30};
        int W = 50;
        System.out.println(knapsackRec(val, wt, W, val.length));
        System.out.println(knapsackDP(val, wt, W, val.length));
    }
}
