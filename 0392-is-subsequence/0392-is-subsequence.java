

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

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// C++ Solution:

class Solution {
public:
    bool isSubsequence(string s, string t) {
        // Initialize two pointers i and j storing the last indices of both the strings...
        int i = s.size() , j = t.size();
        i-- , j--;
        // Iterate until either of them becomes zero...
        while(i >= 0 && j >= 0) {
            // Compare characters...
            if(s[i] == t[j])
                i-- , j--;
            else
                j--;
        }
        // If i (pointer of the first string) is greater than or equal to 0...
        // we have not been able to traverse the first string completely...
        // Hence, it is not a subsequence of the second...
        if(i >= 0)
            return false;
        return true;        // Otherwise, return true...
    }
};

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Python/Python3 Solution:

class Solution(object):
    def isSubsequence(self, s, t):
        # Base case
        if not s:
            return True
        i = 0
        # Traverse elements of t string
        for j in t:
            # If this index matches to the index of s string, increment i pointer...
            if j == s[i]:
                i += 1
            # If the pointer is equal to the size of s...
            if i == len(s):
                break
        return i == len(s)

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
                    
// JavaScript Solution:
                    
var isSubsequence = function(s, t) {
    // Base case: if the s string is empty...
    if(s.length == 0)
        return true;
    // Initialize pointers for both strings
    let i = 0;
    let j = 0;
    // We can iterate until either of them becomes zero...
    while(i < s.length && j < t.length){
        // Compare characters, increment i pointer...
        if(s.charAt(i) == t.charAt(j)){
            i++;
        }j++;
        // If the pointer is equal to the size of s, the match is found...
        if(i == s.length)  return true;
    }
    return false;       // Otherwise return false...
};

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// C Language:

bool isSubsequence(char * s, char * t){
    // Initialize two pointers i and j storing the last indices of both the strings...
        int i = strlen(s) , j = strlen(t);
        i-- , j--;
        // Iterate until either of them becomes zero...
        while(i >= 0 && j >= 0) {
            // Compare characters...
            if(s[i] == t[j])
                i-- , j--;
            else
                j--;
        }
        // If i (pointer of the first string) is greater than or equal to 0...
        // we have not been able to traverse the first string completely...
        // Hence, it is not a subsequence of the second...
        if(i >= 0)
            return false;
        return true;        // Otherwise, return true...
}

