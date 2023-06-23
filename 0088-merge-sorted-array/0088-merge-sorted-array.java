// Java Solution (Two Pointers Approach):
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Sorted Array.

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Initialize i and j to store indices of the last element of 1st and 2nd array respectively...
        int i = m - 1 , j = n - 1;
        // Initialize a variable k to store the last index of the 1st array...
        int k = m + n - 1;
        // Create a loop until either of i or j becomes zero...
        while(i >= 0 && j >= 0) {
            if(nums1[i] >= nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        // Either of i or j is not zero, which means some elements are yet to be merged.
        // Being already in a sorted manner, append them to the 1st array in the front.
        }
        // While i does not become zero...
        while(i >= 0)
            nums1[k--] = nums1[i--];
        // While j does not become zero...
        while(j >= 0)
            nums1[k--] = nums2[j--];
        // Now 1st array has all the elements in the required sorted order...
        return;
    }
}

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// C++ Solution (Sorting Function Approach):
// Runtime: 0 ms, faster than 100.00% of C++ online submissions for Merge Sorted Array.

class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        // Here, nums1 =1st array, nums2 = 2nd array...
        for(int i = 0 ; i < n ; i++)
            nums1[i + m] = nums2[i];
            // Sort the 1st array...
            sort(nums1.begin() , nums1.end());
        // Print the required result...
        return;
    }
};

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Python Solution:
// Runtime: 23 ms, faster than 89.40% of Python online submissions for Merge Sorted Array.

class Solution(object):
    def merge(self, nums1, m, nums2, n):
        # Initialize nums1's index
        i = m - 1
        # Initialize nums2's index
        j = n - 1
        # Initialize a variable k to store the last index of the 1st array...
        k = m + n - 1
        while j >= 0:
            if i >= 0 and nums1[i] > nums2[j]:
                nums1[k] = nums1[i]
                k -= 1
                i -= 1
            else:
                nums1[k] = nums2[j]
                k -= 1
                j -= 1

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// JavaScript Solution:
    
var merge = function(nums1, m, nums2, n) {
    // Initialize i and j to store indices of the last element of 1st and 2nd array respectively...
    let i = m - 1 , j = n - 1;
    // Initialize a variable k to store the last index of the 1st array...
    let k = m + n - 1;
    // Create a loop until either of i or j becomes zero...
    while(i >= 0 && j >= 0) {
        if(nums1[i] >= nums2[j]) {
            nums1[k] = nums1[i];
            i--;
        } else {
            nums1[k] = nums2[j];
            j--;
        }
        k--;
    // Either of i or j is not zero, which means some elements are yet to be merged.
    // Being already in a sorted manner, append them to the 1st array in the front.
    }
    // While i does not become zero...
    while(i >= 0)
        nums1[k--] = nums1[i--];
    // While j does not become zero...
    while(j >= 0)
        nums1[k--] = nums2[j--];
    // Now 1st array has all the elements in the required sorted order...
    return;
};

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// C Language (Two Pointers Approach):
    
void merge(int* nums1, int nums1Size, int m, int* nums2, int nums2Size, int n){
    // Initialize i and j to store indices of the last element of 1st and 2nd array respectively...
    int i = m - 1;
    int j = n -1;
    // Create a loop until either of i or j becomes zero...
    while(i>=0 && j>=0) {
        if(nums1[i] > nums2[j]) {
            nums1[i+j+1] = nums1[i];
            i--;
        } else {
            nums1[i+j+1] = nums2[j];
            j--;
        }
    }
    // While j does not become zero...
    while(j >= 0) {
        nums1[i+j+1] = nums2[j];
        j--;
    }
}

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Python3 Solution:

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        idx = 0
        for i in range(len(nums1)):
            if idx >= n:
                break
            if nums1[i] == 0:
                nums1[i]=nums2[idx]
                idx += 1
        nums1.sort()
