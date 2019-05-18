public class MaxProfitOfStock {
    private int maxProfit(int[] stock) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for (int aStock : stock) {
            if (aStock < min)
                min = aStock;
            if (aStock - min > profit)
                profit = aStock - min;
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] stock = new int[] {7, 1, 5, 3, 6, 4};
        MaxProfitOfStock max = new MaxProfitOfStock();
        System.out.println("Max profit is on: " + max.maxProfit(stock));
    }
}
