// Runtime: 1 ms, faster than 80.17% of Java online submissions for Search in Rotated Sorted Array.
class Solution {
    public int search(int[] nums, int target) {
        int beg = 0, end = nums.length-1;
        while(beg <= end){
            int mid = beg + (end-beg)/2;
            if(target == nums[mid])  return mid;
            if(nums[beg] <= nums[mid]){
                if(nums[beg] <= target && target < nums[mid]) end = mid - 1;
                else beg = mid + 1;
            } else{
                if(nums[mid] < target && target <= nums[end]) beg = mid + 1;
                else end = mid - 1;
            }    
        } return -1;
    }
}