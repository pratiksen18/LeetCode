class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int beg = 0;
        int end = nums[nums.length - 1] - nums[0];
        while (beg < end) {
            final int mid = (beg + end) / 2;
            if (numPairs(nums, mid) >= p) end = mid;
            else beg = mid + 1;
        } return beg;
    }
    private int numPairs(int[] nums, int maxDiff) {
        int pairs = 0;
        for (int i = 1; i < nums.length; ++i)
            if (nums[i] - nums[i - 1] <= maxDiff) {
                ++pairs;
                ++i;
            }
        return pairs;
    }
}