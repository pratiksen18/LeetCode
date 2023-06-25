

// C++ Solution (Using Moore’s Voting Algorithm):

class Solution {
public:
    int majorityElement(vector<int>& nums) {
        // Initialize sol and cnt to store the solution and its frequency for respective iterations...
        int sol = 0, cnt = 0;
        // For every element i in the array...
        for(int i = 0; i < nums.size(); i++ ) {
            // If cnt is equal to zero, update sol as sol = i
            if(cnt == 0){
                sol = nums[i];
                cnt = 1;
            }
            // If i is equal to candidate, increment cnt...
            else if(sol == nums[i]){
                cnt++;
            }
            // Otherwise, decrement cnt...
            else{
                cnt--;
            }
        }
        // Return & print the solution...
        return sol;
    }
};

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Java Solution (Using Sorting Method):

class Solution {
    public int majorityElement(int[] nums) {
        // Base case...
        if (nums.length == 1) {
		    return nums[0];
	    }
        // Sort nums array...
        Arrays.sort(nums);
        // Since the majority element appears more than n / 2 times...
        // The n/2 -th element in the sorted nums must be the majority element...
	    return nums[nums.length / 2];
    }
}

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Python Solution (Using Moore’s Voting Algorithm):

class Solution(object):
    def majorityElement(self, nums):
        sol = None
        cnt = 0
        for i in nums:
            if cnt == 0:
                sol = i
            cnt += (1 if i == sol else -1)
        return sol

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// JavaScript Solution:

var majorityElement = function(nums) {
    // Initialize sol and cnt to store the solution and its frequency for respective iterations...
    let sol = 0, cnt = 0;
    // For every element i in the array...
    for(let i = 0; i < nums.length; i++ ) {
        // If cnt is equal to zero, update sol as sol = i
        if(cnt == 0){
            sol = nums[i];
            cnt = 1;
        }
        // If i is equal to candidate, increment cnt...
        else if(sol == nums[i]){
            cnt++;
        }
        // Otherwise, decrement cnt...
        else{
            cnt--;
        }
    }
    // Return & print the solution...
    return sol;
};

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// C Language:

int majorityElement(int* nums, int numsSize){
    int sol = nums[0],
    cnt = 0;
    for (int i = 0; i < numsSize; i++) {
        if (cnt == 0) {
            sol = nums[i];
        }
        if (nums[i] == sol) {
            cnt++;
        } else {
            cnt--;
        } 
    }        
    return sol;
}

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Python3 Solution:

class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        sol = None
        cnt = 0
        for i in nums:
            if cnt == 0:
                sol = i
            cnt += (1 if i == sol else -1)
        return sol
