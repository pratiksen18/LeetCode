

// Java Solution:

class Solution {
    public boolean canJump(int[] nums) {
        
        // Take curr variable to keep the current maximum jump...
        int curr = 0;
        
        // Traverse all the elements through loop...
        for (int i = 0; i < nums.length; i++) {
            
            // If the current index 'i' is less than current maximum jump 'curr'...
            // It means there is no way to jump to current index...
            // so we should return false...
            if (i > curr) {
                return false;
            }
            
            // Update the current maximum jump...
            curr = Math.max(curr, i + nums[i]);     // It’s possible to reach the end of the array...
        }
        return true;
    }
}

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// C++ Solution:

class Solution {
public:
    bool canJump(vector<int>& nums) {
        int idx = 0;
        //check what is the maximum index we can reach from that index...
        for (int maximum = 0; idx < nums.size() && idx <= maximum; ++idx)
            maximum = max(idx + nums[idx], maximum);       //if the maximum index reached is the last index of the array...
        return idx == nums.size();
    }
};

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Python Solution:

class Solution(object):
    def canJump(self, nums):
        # Take curr variable to keep the current maximum jump...
        curr = nums[0]
        # Traverse all the elements through loop...
        for i in range(1,len(nums)):
            # If the current index 'i' is less than current maximum jump 'curr'...
            # It means there is no way to jump to current index...
            # so we should return false...
            if curr == 0:
                return False
            curr -= 1
            # Update the current maximum jump...
            curr = max(curr, nums[i])       # It’s possible to reach the end of the array...
        return True

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// JavaScript Solution:

var canJump = function(nums) {
    
    // Base condition...
    if(nums.length <= 1)
        return true;
    
    // To keep the maximum index that can be reached...
    let maximum = nums[0];
    
    // Traverse all the elements through loop...
    for(let i = 0; i < nums.length; i++){
        
        //if there is no way to jump to next...
        // so we should return false...
        if(maximum <= i && nums[i] == 0) 
            return false;
        
        //update the maximum jump...    
        if(i + nums[i] > maximum){
            maximum = i + nums[i];
        }
 
        //maximum is enough to reach the end...
        if(maximum >= nums.length-1) 
            return true;
    }
 
    return false;   
};

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// C Language:

bool canJump(int* nums, int numsSize){
    int jump = 0;
    for (int i = 0; i < numsSize; i++) {
        if (jump < i) {
            break;
        }
        if (jump < i + nums[i]) {
            jump = i + nums[i];
        }
        if (jump >= numsSize - 1) {
            return true;
        }
    }
    return false;
}

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Python3 Solution:

class Solution:
    def canJump(self, nums: List[int]) -> bool:
        # Take curr variable to keep the current maximum jump...
        curr = nums[0]
        # Traverse all the elements through loop...
        for i in range(1,len(nums)):
            # If the current index 'i' is less than current maximum jump 'curr'...
            # It means there is no way to jump to current index...
            # so we should return false...
            if curr == 0:
                return False
            curr -= 1
            # Update the current maximum jump...
            curr = max(curr, nums[i])       # It’s possible to reach the end of the array...
        return True
