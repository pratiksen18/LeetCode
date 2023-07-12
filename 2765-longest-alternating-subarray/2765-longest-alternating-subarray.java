class Solution {
    public int alternatingSubarray(int[] nums) {
        int output = 1, dp = 1;
        for (int i = 1; i < nums.length; ++i) {
            final int targetDiff = dp % 2 == 0 ? -1 : 1;
            if (nums[i] - nums[i - 1] == targetDiff) ++dp;
            else if (nums[i] - nums[i - 1] == 1) dp = 2;
            else dp = 1;
            output = Math.max(output, dp);
        }
        return output == 1 ? -1 : output;
    }
}