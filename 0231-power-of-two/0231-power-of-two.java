

// Java Solution (Recursive Approach):
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Power of Two.

class Solution {
    public boolean isPowerOfTwo(int n) {
        // Base cases as '1' is the only odd number which is a power of 2 i.e. 2^0...
        if(n==1)
            return true;
        // All other odd numbers are not powers of 2...
        else if (n % 2 != 0 || n == 0)
            return false;
        // Recursive function call
        return isPowerOfTwo(n/2);
    }
}