// C++ Solution:
// Runtime: 0 ms, faster than 100.00% of C++ online submissions for Valid Parentheses.
class Solution {
public:
    bool isValid(string s) {
        // Initialize a stack and a index idx = 0...
        stack<char> stack;
        int idx = 0;
        // If the string is empty, return true...
        if(s.size() == 0){
            return true;
        }
        // Create a loop to check parentheses...
        while(idx < s.size()){
            // If it contains the below parentheses, push the char to stack...
            if( s[idx] == '(' || s[idx] == '[' || s[idx] == '{' ){
                stack.push(s[idx]);
            }
            // If the current char is a closing brace provided, pop the top element...
            // Stack is not empty...
            else if ( (s[idx] == ')' && !stack.empty() && stack.top() == '(') ||
                        (s[idx] == '}' && !stack.empty() && stack.top() == '{') ||
                        (s[idx] == ']' && !stack.empty() && stack.top() == '[')
                      ){
                stack.pop();
            }
            else {
                return false;       // If The string is not a valid parenthesis...
            }
            idx++;      // Increase the index...
        }
        // If stack.empty(), return true...
        if(stack.empty()) {
            return true;
        }
        return false;
    }
};

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Java Solution (Using Hashmap):
class Solution {
    public boolean isValid(String s) {
        // Create hashmap to store the pairs...
        HashMap<Character, Character> Hmap = new HashMap<Character, Character>();
        Hmap.put(')','(');
        Hmap.put('}','{');
        Hmap.put(']','[');
        // Create stack data structure...
        Stack<Character> stack = new Stack<Character>();
        // Traverse each charater in input string...
        for (int idx = 0; idx < s.length(); idx++){
            // If open parentheses are present, push it to stack...
            if (s.charAt(idx) == '(' || s.charAt(idx) == '{' || s.charAt(idx) == '[') {
                stack.push(s.charAt(idx));
                continue;
            }
            // If the character is closing parentheses, check that the same type opening parentheses is being pushed to the stack or not...
            // If not, we need to return false...
            if (stack.size() == 0 || Hmap.get(s.charAt(idx)) != stack.pop()) {
                return false;
            }
        }
        // If the stack is empty, return true...
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
}

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Python Solution:
class Solution(object):
    def isValid(self, s):
        # Create a pair of opening and closing parrenthesis...
        opcl = dict(('()', '[]', '{}'))
        # Create stack data structure...
        stack = []
        # Traverse each charater in input string...
        for idx in s:
            # If open parentheses are present, append it to stack...
            if idx in '([{':
                stack.append(idx)
            # If the character is closing parentheses, check that the same type opening parentheses is being pushed to the stack or not...
            # If not, we need to return false...
            elif len(stack) == 0 or idx != opcl[stack.pop()]:
                return False
        # At last, we check if the stack is empty or not...
        # If the stack is empty it means every opened parenthesis is being closed and we can return true, otherwise we return false...
        return len(stack) == 0

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
                    
// JavaScript Solution:
var isValid = function(s) {
    // Initialize stack to store the closing brackets expected...
    let stack = [];
    // Traverse each charater in input string...
    for (let idx = 0; idx < s.length; idx++) {
        // If open parentheses are present, push it to stack...
        if (s[idx] == '{') {
            stack.push('}');
        } else if (s[idx] == '[') {
            stack.push(']');
        } else if (s[idx] == '(') {
            stack.push(')');
        }
        // If a close bracket is found, check that it matches the last stored open bracket
        else if (stack.pop() !== s[idx]) {
            return false;
        }
    }
    return !stack.length;
};

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Python3 Solution:
class Solution:
    def isValid(self, s: str) -> bool:
        # Create a pair of opening and closing parrenthesis...
        opcl = dict(('()', '[]', '{}'))
        # Create stack data structure...
        stack = []
        # Traverse each charater in input string...
        for idx in s:
            # If open parentheses are present, append it to stack...
            if idx in '([{':
                stack.append(idx)
            # If the character is closing parentheses, check that the same type opening parentheses is being pushed to the stack or not...
            # If not, we need to return false...
            elif len(stack) == 0 or idx != opcl[stack.pop()]:
                return False
        # At last, we check if the stack is empty or not...
        # If the stack is empty it means every opened parenthesis is being closed and we can return true, otherwise we return false...
        return len(stack) == 0
