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
    public static void main(String[] args) {
       int[] input = {7,6,4,3,1};
        System.out.println(maxProfit(input));
    }
}
