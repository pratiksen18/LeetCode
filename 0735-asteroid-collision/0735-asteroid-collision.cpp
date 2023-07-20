// Runtime 16 ms Beats 83.50% Memory 17.4 MB Beats 85.46%
class Solution {
public:
    vector<int> asteroidCollision(vector<int>& asteroids) {
        vector<int> stack;
        for (int i = 0; i < asteroids.size(); i++) {
            if (asteroids[i] > 0 || stack.empty() || stack.back() < 0)
                stack.push_back(asteroids[i]);
            else if (stack.back() <= -asteroids[i]) {
                if(stack.back() < -asteroids[i]) i--;
                stack.pop_back();
            }
        }
        return stack;
    }
};