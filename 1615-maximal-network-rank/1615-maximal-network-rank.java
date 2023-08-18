class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        int[][] graph = new int[n][n];
        int[] c = new int[n];
        for (var road : roads) {
            int p1 = road[0], p2 = road[1];
            graph[p1][p2] = 1;
            graph[p2][p1] = 1;
            ++c[p1];
            ++c[p2];
        }
        int output = 0;
        for (int p1 = 0; p1 < n; ++p1) {
            for (int p2 = p1 + 1; p2 < n; ++p2) { output = Math.max(output, c[p1] + c[p2] - graph[p1][p2]);}
        }
        return output;
    }
}