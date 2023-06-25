

// Java Solution:

class Solution {
    public int firstUniqChar(String s) {
        // Base case...
        if(s.length() == 0)  return -1;
        // To keep track of the count of each character, we initialize an int[]store with size 26...
        int[] store = new int[26];
        // Traverse string to keep track number of times each character in the string appears...
        for(char ch : s.toCharArray()){
            store[ch - 'a']++;      // To access the store[] element representative of each character, we subtract ‘a’ from that character...
        }
        // Traverse string again to find a character that appears exactly one time, return it’s index...
        for(int idx = 0; idx < s.length(); idx++){
            if(store[s.charAt(idx) - 'a'] == 1){
                return idx;
            }
        }
        return -1;      // if no character appeared exactly once...
    }
}

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// C++ Solution:

class Solution {
public:
    int firstUniqChar(string s) {
        map<char, int> hmap;
        for (int idx{}; idx < s.size(); idx++) {
            // Everytime the character appears in the string, add one to its count
            hmap[s[idx]]++;
        }
        // Traverse the string from the beginning...
        for (int idx{}; idx < s.size(); idx++) {
            // If the count of the char is equal to 1, it is the first distinct character in the list.
            if (hmap[s[idx]] == 1)
                return idx;
        } 
        return -1;     // if no character appeared exactly once...
    }
};

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Python/Python3 Solution:

class Solution(object):
    def firstUniqChar(self, s):
        hset = collections.Counter(s);
        # Traverse the string from the beginning...
        for idx in range(len(s)):
            # If the count is equal to 1, it is the first distinct character in the list.
            if hset[s[idx]] == 1:
                return idx
        return -1       # If no character appeared exactly once...

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------   
                    
// JavaScript Solution:
                    
var firstUniqChar = function(s) {
    for (let idx = 0; idx < s.length; idx++){
        // If same...
        if(s.indexOf(s[idx]) === s.lastIndexOf(s[idx])){
            // return the index of that unique character
            return idx
        } else {
            return -1       // If no character appeared exactly once...
        }
    }
};
