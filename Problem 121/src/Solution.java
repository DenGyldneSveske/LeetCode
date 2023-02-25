public class Solution {
    public int maxProfit(int[] prices) {
        int cheapest = Integer.MAX_VALUE;
        int profit = 0;
        int profitForDay = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < cheapest) {
                cheapest = prices[i];
            }
            profitForDay = prices[i] - cheapest;
            if (profitForDay > profit) {
                profit = profitForDay;
            }
        }
        return profit;
    }
}

