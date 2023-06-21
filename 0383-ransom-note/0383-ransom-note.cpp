// C++ Solution:
class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {
        // Initialize an array of count with the size 26...
        int cnt[26] = {0};
        // Traverse a loop through the entire String of magazine where char ch stores the char at the index of magazine...
        for(char ch : magazine)
            cnt[ch - 'a']++;
        // Run another for loop for ransomNote...
        for(char ch : ransomNote)
            // If the charachter doesn't exists in magazine for ransomNote, we return false...
            if(cnt[ch - 'a']-- <= 0)
                return false;
        return true;        // If nothing goes wrong, return true...
    }
};

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Java Solution:
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Initialize an array of count with the size 26...
        int[] count = new int[128];
        // Traverse a loop through the entire String of magazine where char ch stores the char at the index of magazine...
        for (final char ch : magazine.toCharArray())
            ++count[ch];
        // Run another for loop for ransomNote...
        for (final char ch : ransomNote.toCharArray())
             // If the charachter doesn't exists in magazine for ransomNote, we return false...
            if (--count[ch] < 0)
                return false;
        return true;      // If nothing goes wrong, return true...
    }
}

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Python/Python3 Solution:
class Solution(object):
    def canConstruct(self, ransomNote, magazine):
        st1, st2 = Counter(ransomNote), Counter(magazine)
        if st1 & st2 == st1:
            return True
        return False
