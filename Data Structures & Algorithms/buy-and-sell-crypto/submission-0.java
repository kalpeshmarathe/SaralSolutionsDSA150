class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int maxprofit = 0;
        for(int i = 0 ; i < prices.length ; i++)
        {
            for(int j = i+1 ; j < prices.length ; j++)
            {
                profit = prices[j] - prices[i];
                maxprofit = Math.max(profit,maxprofit);
            }
        }
        return maxprofit;
    }
}
