class Solution {
    public int longestArithSeqLength(int[] nums) {
        int output = 0;
        int[][] dp = new int[nums.length][1001];
        for (int i = 0; i < nums.length; ++i)
            for (int j = 0; j < i; ++j) {
                final int k = nums[i] - nums[j] + 500;
                dp[i][k] = Math.max(2, dp[j][k] + 1);
            output = Math.max(output, dp[i][k]);
        }
        return output;
    }
}