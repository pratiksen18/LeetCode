// C++ Solution:
// Time Complexity :  O(n)
// Space Complexity : O(1)

class Solution {
public:
    int characterReplacement(string s, int k) {
        // Base case...
        if (s.size() == 0) return 0;
        // Make an array...
        vector <int> arr(128);
        // Initialize largestCount & beg pointer...
        int beg = 0, largestCount = 0;
        // Traverse all characters through the loop...
        for (int end = 0; end < s.size(); end++) {
            // Get the largest count of a single, unique character in the current window...
            largestCount = max(largestCount, ++arr[s[end]]);
            // We are allowed to have at most k replacements in the window...
            // So, if max character frequency + distance between beg and end is greater than k...
            // That means we have met a largest possible sequence, we can move the window to right...
            if (end - beg + 1 - largestCount > k)       // The main equation is: end - beg + 1 - largestCount...
                arr[s[beg++]]--;
        }
        // Return the sequence we have passes, which is s.length() - beg...
        return s.length() - beg;
    }
};

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Java Solution:
// Time Complexity :  O(n)
// Space Complexity : O(1)

class Solution {
    public int characterReplacement(String s, int k) {
        // Make an array of size 26...
        int[] arr = new int[26];
        // Initialize largestCount, maxlen & beg pointer...
        int largestCount = 0, beg = 0, maxlen = 0;
        // Traverse all characters through the loop...
        for(int end = 0; end < s.length(); end ++){
            arr[s.charAt(end) - 'A']++;
            // Get the largest count of a single, unique character in the current window...
            largestCount = Math.max(largestCount, arr[s.charAt(end) - 'A']);
            // We are allowed to have at most k replacements in the window...
            // So, if max character frequency + distance between beg and end is greater than k...
            // this means we have considered changing more than k charactres. So time to shrink window...
            // Then there are more characters in the window than we can replace, and we need to shrink the window...
            if(end - beg + 1 - largestCount > k){     // The main equation is: end - beg + 1 - largestCount...
                arr[s.charAt(beg) - 'A']--;
                beg ++;
            }
            // Get the maximum length of repeating character...
            maxlen = Math.max(maxlen, end - beg + 1);     // end - beg + 1 = size of the current window...
        }
        return maxlen;      // Return the maximum length of repeating character...
    }
}

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Python/Python3 Solution:
// Time Complexity :  O(n)
// Space Complexity : O(1)
    
class Solution(object):
    def characterReplacement(self, s, k):
        maxlen, largestCount = 0, 0
        arr = collections.Counter()
        for idx in xrange(len(s)):
            arr[s[idx]] += 1
            largestCount = max(largestCount, arr[s[idx]])
            if maxlen - largestCount >= k:
                arr[s[idx - maxlen]] -= 1
            else:
                maxlen += 1
        return maxlen

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// JavaScript Solution:
// Time Complexity :  O(n)
// Space Complexity : O(1)
    
var characterReplacement = function(s, k) {
    // Make a map of size 26...
    var map = [26]
    // Initialize largestCount, maxlen & beg pointer...
    let largestCount = 0, beg = 0, maxlen = 0;
    // Traverse all characters through the loop...
    for(let end = 0; end < s.length; end++){
        const c = s[end]
        map[c] = (map[c] || 0) + 1
        // Get the largest count of a single, unique character in the current window...
        largestCount = Math.max(largestCount, map[c])
        // We are allowed to have at most k replacements in the window...
        // So, if max character frequency + distance between beg and end is greater than k...
        // this means we have considered changing more than k charactres. So time to shrink window...
        // Then there are more characters in the window than we can replace, and we need to shrink the window...
        if(end - beg + 1 - largestCount > k){     // The main equation is: end - beg + 1 - largestCount...
            map[s[beg]] -= 1
            beg += 1
        }
        // Get the maximum length of repeating character...
        maxlen = Math.max(maxlen, end - beg + 1);     // end - beg + 1 = size of the current window...
    }
    return maxlen;      // Return the maximum length of repeating character...
};
