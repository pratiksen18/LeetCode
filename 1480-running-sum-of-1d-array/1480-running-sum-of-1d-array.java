// Java Solution:
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Running Sum of 1d Array.
// Time Complexity : O(n)
// Space Complexity : O(n)
class Solution {
    public int[] runningSum(int[] nums) {
        // Create an output array of size equal to given nums size...
        int[] output = new int[nums.length];
        // Base case: if the array is empty...
        if(nums.length == 0)
            return output;
        // Set output[0] = nums[0]...
        output[0] = nums[0];
        // Traverse all elements through the for loop...
        for(int idx = 1; idx < nums.length; idx++) {
            // Storing the running sum...
            output[idx] = output[idx-1]+ nums[idx];
        }
        return output;      // Return the running sum of nums...
    }
}

