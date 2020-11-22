package Arrays;

public class BestTimeToBuyStock {
    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE, profit = 0;

        for (int price: prices) {
            min = Math.min(min, price);
            profit = Math.max(profit, price-min);
        }
        return profit;
    }

    public static int maxProfitII(int[] prices) {
        int profit = 0;
        if (prices.length == 0)
            return 0;
        for (int i=0; i< prices.length-1; i++) {
            if (prices[i+1] > prices[i]) {
                profit += prices[i+1] - prices[i];
            } else {
                continue;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
       int[] input = {7,6,4,3,1};
        System.out.println(maxProfit(input));
        System.out.println(maxProfitII(input));
    }
}
