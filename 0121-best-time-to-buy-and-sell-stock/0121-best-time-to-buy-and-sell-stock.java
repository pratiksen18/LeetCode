

// Java Solution:
// Runtime: 1 ms, faster than 98.59% of Java online submissions for Best Time to Buy and Sell Stock.
class Solution {
    public int maxProfit(int[] prices) {
        // Base case...
        // If the array is empty or its length <= 1, return 0...
        if(prices == null || prices.length <= 1) return 0;
        // Initialize the minimum price to buy...
        int minBuy = prices[0];
        // Initialize the maximum profit...
        int profit = 0;
        // Traverse all elements through a for loop...
        for(int i = 1; i < prices.length; i++) {
            // Get the minimum price to buy...
            minBuy = Math.min(minBuy, prices[i]);
            // Get maximum profit...
            profit = Math.max(profit, prices[i] - minBuy);
        }
        return profit;      //return the maximum profit...
    }
}

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// C++ Solution:
    
class Solution {
public:
    int maxProfit(vector<int>& prices) {
        if(prices.size() == 0) return 0;
        int profit = 0;
        int low = prices[0], high = prices[0];
        for(int i = 0; i < prices.size(); i++){
            if(prices[i] < low){
                profit = max(profit, high - low);
                low = prices[i];
                high = prices[i];
            }else{
                high = max(high, prices[i]);
            }
        }
        profit = max(profit, high - low);
        return profit;
    }
};

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Python Solution:
    
class Solution(object):
    def maxProfit(self, prices):
        if len(prices) == 0: return 0
        else:
            profit = 0
            minBuy = prices[0]
            for i in range(len(prices)):
                profit = max(prices[i] - minBuy, profit)
                minBuy = min(minBuy, prices[i])
            return profit

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// JavaScript Solution:
    
var maxProfit = function(prices) {
    if(prices == null || prices.length <= 1) return 0;
    let minBuy = prices[0];
    let profit = 0;
    for(let i = 1; i < prices.length; i++) {
        minBuy = Math.min(minBuy, prices[i]);
        profit = Math.max(profit, prices[i] - minBuy);
    }
    return profit;
};

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Python3 Solution:
    
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if len(prices) == 0: return 0
        else:
            profit = 0
            minBuy = prices[0]
            for i in range(len(prices)):
                profit = max(prices[i] - minBuy, profit)
                minBuy = min(minBuy, prices[i])
            return profit
