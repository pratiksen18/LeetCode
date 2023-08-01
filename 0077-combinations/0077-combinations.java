// Runtime: 19 ms, faster than 80.84% of Java online submissions for Combinations.
// Memory Usage: 43.4 MB, less than 96.78% of Java online submissions for Combinations.
class Solution {
    List<List<Integer>> output = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        if(k == 0) return output;
        dfs(1, n, k, new ArrayList<Integer>());
        return output;
    }
    private void dfs(int beg, int n, int k, List<Integer> list){
        if(k == 0){
            List<Integer> uplist = new ArrayList<>(list);
            output.add(uplist);
            return;
        }
        for(int i = beg; i <= n; i++){
            list.add(i);
            dfs(i+1, n, k-1, list);
            list.remove(list.size()-1);
        }    
    }
}