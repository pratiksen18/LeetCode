class Solution {
    public int numMusicPlaylists(int n, int goal, int k) {
        int rem = (int)Math.pow(10, 9) + 7;
        long[][] dp = new long[goal+1][n+1];
        dp[0][0] = 1;
        for (int i = 1; i <= goal; i++){
            for (int j = 1; j <= n; j++){
                dp[i][j] = (dp[i-1][j-1] * (n - (j-1))) % rem; 
                if (j > k){ dp[i][j] = (dp[i][j] + (dp[i-1][j] * (j-k)) % rem) % rem; }
            }
        } return (int)dp[goal][n];
    }
}