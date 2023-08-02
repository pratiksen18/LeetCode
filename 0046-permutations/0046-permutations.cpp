class Solution {
public:
    vector<vector<int>> output;
    void dfs(vector<int> &nums, int l) {
        if (l >= nums.size()) {
            output.push_back(nums);
            return;
        }
        for (int i = l; i < nums.size(); i++) {
            swap(nums[l], nums[i]);
            dfs(nums, l + 1);
            swap(nums[l], nums[i]);
        }
    }
    vector<vector<int>> permute(vector<int> &nums) {
        dfs(nums, 0);
        return output;
    }
};