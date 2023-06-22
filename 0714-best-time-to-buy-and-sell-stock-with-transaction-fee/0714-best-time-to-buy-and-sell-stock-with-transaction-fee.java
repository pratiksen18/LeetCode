// Runtime 5 ms Beats 88.96%
class Solution {
    public int maxProfit(int[] prices, int fee) {
        int sell = 0, stock = Integer.MIN_VALUE;
        for (final int price : prices) {
            sell = Math.max(sell, stock + price);
            stock = Math.max(stock, sell - price - fee);
        }
        return sell;
    }
}