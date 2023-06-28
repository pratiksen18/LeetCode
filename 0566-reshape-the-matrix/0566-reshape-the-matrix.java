

// Java Solution:
// Runtime: 1 ms, faster than 92.33% of Java online submissions for Reshape the Matrix.
// Time Complexity : O(r*c)
// Space Complexity : O(r*c)

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        // If transformation doesn't occur, return mat...
        if (mat.length * mat[0].length != r * c) {
            return mat;
        }
        // Otherwise create a output matrix and fill the cells...
        int[][] output = new int[r][c];
        // Traverse the matrix through the loop... 
        for (int idx = 0; idx < r * c; idx++) {
            // idx % c will give us the current column number...
            // idx / c will give us how many rows we have completely filled...
            output[idx/c][idx % c] = mat[idx / mat[0].length][idx % mat[0].length];
        }
        return output;      // Return the output matrix...
    }
}