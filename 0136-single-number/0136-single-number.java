// Java Solution:
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Single Number.
// Memory Usage: 46.2 MB, less than 89.95% of Java online submissions for Single Number.

class Solution {
    public int singleNumber(int[] nums) {
        // Initialize the unique number...
        int uniqNum = 0;
        // TRaverse all elements through the loop...
        for (int idx : nums) {
            // Concept of XOR...
            uniqNum ^= idx;
        } return uniqNum;       // Return the unique number...
    }
}

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// C++ Solution:
// Runtime: 6 ms, faster than 98.77% of C++ online submissions for Single Number.
// Memory Usage: 11.8 MB, less than 98.93% of C++ online submissions for Single Number.

class Solution {
public:
    int singleNumber(vector<int>& nums) {
        // Initialize the unique number...
        int uniqNum = 0;
        // TRaverse all elements through the loop...
        for (int idx : nums) {
            // Concept of XOR...
            uniqNum ^= idx;
        } return uniqNum;       // Return the unique number...
    }
};

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Python Solution:
    
class Solution(object):
    def singleNumber(self, nums):
        # Initialize the unique number...
        uniqNum = 0;
        # TRaverse all elements through the loop...
        for idx in nums:
            # Concept of XOR...
            uniqNum ^= idx;
        return uniqNum;       # Return the unique number...

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// JavaScript Solution:
    
var singleNumber = function(nums) {
    // Initialize the unique number...
    let uniqNum = 0;
    // TRaverse all elements through the loop...
    for (let idx = 0; idx < nums.length; idx++) {
        // Concept of XOR...
        uniqNum = uniqNum ^ nums[idx];
    } return uniqNum;       // Return the unique number...
};

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// C Language:
    
int singleNumber(int* nums, int numsSize){
    // Initialize the unique number...
    int uniqNum = 0;
    // TRaverse all elements through the loop...
    for (int idx = 0; idx < numsSize; idx++) {
        // Concept of XOR...
        uniqNum = uniqNum ^ nums[idx];
    } return uniqNum;       // Return the unique number...
}

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Python3 Solution:

class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        # Initialize the unique number...
        uniqNum = 0;
        # TRaverse all elements through the loop...
        for idx in nums:
            # Concept of XOR...
            uniqNum ^= idx;
        return uniqNum;       # Return the unique number...
