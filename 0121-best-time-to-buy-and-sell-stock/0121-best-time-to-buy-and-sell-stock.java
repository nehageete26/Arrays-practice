class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0, buy_price = prices[0];
        for(int i=1;i<prices.length;i++){
            int curr_price = prices[i] - buy_price;
            max_profit = Math.max(max_profit,curr_price);
            buy_price = Math.min(buy_price,prices[i]);
        }
        return max_profit;
    }
}