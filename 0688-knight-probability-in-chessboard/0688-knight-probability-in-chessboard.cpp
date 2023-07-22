class Solution {
public:
    double knightProbability(int n, int k, int row, int column) {
        // We use dynamic programming to store the probabilities at each cell for each move...
        // The dp array is a 3-dimensional array...
        // dp[n][r][c] represents the probability of the knight being at cell (r, c) after m moves...
        vector<vector<double>> dp(n, vector<double>(n, 0));
        vector<int> dr = {-2, -2, -1, -1, 1, 1, 2, 2};
        vector<int> dc = {-1, 1, -2, 2, -2, 2, -1, 1};
        // At first, initialize dp[0][row][column] to 1, as the knight starts at the specified cell.
        dp[row][column] = 1;
        // For each move from 1 to k, the algorithm iterates over each cell on the chessboard.
        for (int m = 0; m < k; m++) {
            vector<vector<double>> tmp(n, vector<double>(n, 0));
            // For each cell, it considers all 8 possible moves of the knight &
            // Calculates the probability of reaching that cell from the neighboring cells.
            for (int r = 0; r < n; r++) {
                for (int c = 0; c < n; c++) {
                    for (int i = 0; i < 8; i++) {
                        // Introduce the terms newRow & newCol...
                        int newRow = r + dr[i];
                        int newCol = c + dc[i];
                        // If the new cell is within the bounds of the chessboard....
                        if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n) {
                            // update by adding the probability of the previous move divided by 8.0...
                            tmp[newRow][newCol] += dp[r][c] / 8.0;
                        }
                    }
                }
            }
            dp = tmp;
        }
        // Initialize the output probability...
        double output = 0;
        // Sum up the output probabilities of all cells at the kth move to get the final output probability.
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                output += dp[r][c];
            }
        }
        // return the output that the knight remains on the board after k moves.
        return output;
    }
};