class Solution {
    public int maxProfit(int[] prices) {
        int minCost = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            minCost = Math.min(minCost, price);
            maxProfit = Math.max(maxProfit, price - minCost);
        }
        return maxProfit;
    }
}