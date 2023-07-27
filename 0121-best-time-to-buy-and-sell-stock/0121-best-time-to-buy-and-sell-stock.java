class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int sell = 0;
        for (int i = 1; i < prices.length; i++) {
            buy = Math.min(buy, prices[i]);
            sell = Math.max(sell, prices[i] - buy);
        }
        return sell;

        // int profit = 0;
        // int buyDay = 0;
        // for (int i = 1; i < prices.length; i++) {
        //     if (prices[i] - prices[buyDay] > profit)
        //         profit = prices[i] - prices[buyDay];
        //     buyDay = (prices[buyDay] > prices[i]) ? i : buyDay;
        // }
        // return profit;
    }
}