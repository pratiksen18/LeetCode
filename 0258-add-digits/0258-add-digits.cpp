

// C++ Solution:
// Runtime: 0 ms, faster than 100.00% of C++ online submissions for Add Digits.

class Solution {
public:
    int addDigits(int num) {
        // If num == 0, then result will be 0...
        if(num == 0)
            return 0;
        // If is divisible by 9, result will be 9...
        else if(num % 9 == 0)
            return 9;
        // if the num is not 0 and is not divisible by 9,
        // the result will always num % 9...
        else
            return num % 9;
    }
};
