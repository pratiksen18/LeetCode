

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

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// C++ Solution (Bit-Manipulation):

class Solution {
public:
    bool isPowerOfTwo(int n) {
        // If n <= 0 that means its a negative hence not a power of 2...
        if (n <= 0){
            return false;
        }
        // Check if x & (x – 1) is equal to zero...
        // If yes, the number is a power of 2...
        else if ((n & (n - 1)) == 0){
            return true;
        }
        // Otherwise, The integer is not a power of 2...
        else {
            return false;
        }
    }
};

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Python Solution (Trival):

class Solution(object):
    def isPowerOfTwo(self, n):
        # If n <= 0 that means its a negative hence not a power of 2...
        if n <= 0:
            return False
        if n == 1:
            return True
        # Keep dividing the number by ‘2’ until it is not divisible by ‘2’ anymore.
        while (n % 2 == 0):
            n /= 2
        # If n is equal to 1, The integer is a power of two otherwise false...
        return n == 1

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
                
// JavaScript Solution:
                
var isPowerOfTwo = function(n) {
    if (n == 0)
        return 0;
    while (n != 1) {
        if (n%2 != 0)
            return 0;
        n = n/2;
    }
    return 1;
};

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// C Language:

bool isPowerOfTwo(int n){
    if(n == 1)
        return true;
    else if(n == 0)
        return false;
    else if(n % 2 != 0)
        return false;
    return isPowerOfTwo(n/2);
}

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Python3 Solution:

class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
        # If n <= 0 that means its a negative hence not a power of 2...
        if n <= 0:
            return False
        if n == 1:
            return True
        # Keep dividing the number by ‘2’ until it is not divisible by ‘2’ anymore.
        while (n % 2 == 0):
            n /= 2
        # If n is equal to 1, The integer is a power of two otherwise false...
        return n == 1
