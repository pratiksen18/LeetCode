

// Java Solution:
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Is Subsequence.

class Solution {
    public boolean isSubsequence(String s, String t) {
        // Base case: if the s string is empty...
        if(s.length() == 0)
            return true;
        // Initialize pointers for both strings
        int i = 0;
        int j = 0;
        // We can iterate until either of them becomes zero...
        while(i < s.length() && j < t.length()){
            // Compare characters, increment i pointer...
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }j++;
            // If the pointer is equal to the size of s, the match is found...
            if(i == s.length()) return true;
        }
        return false;       // Otherwise return false...
    }
}