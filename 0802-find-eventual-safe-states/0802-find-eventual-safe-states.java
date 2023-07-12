class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (dfs(graph, i, color)) { result.add(i); }
        }
        return result;
    }
    private boolean dfs(int[][] graph, int node, int[] color) {
        if (color[node] != 0) return color[node] == 2;
        color[node] = 1;
        for (int neighbor : graph[node]) {
            if (!dfs(graph, neighbor, color))  return false;
        }
        color[node] = 2;
        return true;
    }
}