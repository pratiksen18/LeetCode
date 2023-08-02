// Runtime: 1 ms, faster than 98.41% of Java online submissions for Permutations.
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        dfs(0, nums, output);
        return output;
    }
    private void dfs(int start, int[] nums, List<List<Integer>> output){
        if(start == nums.length - 1){
            ArrayList<Integer> list = new ArrayList<>();
            for(int num: nums){
                list.add(num);
            }
            output.add(list);
            return;
        }
        for(int i = start; i < nums.length; i++){
            swapping(nums, i, start);
            dfs(start+1, nums, output);
            swapping(nums, i, start);
        }
    }
    private void swapping(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}