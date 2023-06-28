

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

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// C++ Solution:
// Time Complexity : O(r*c)
// Space Complexity : O(r*c)

class Solution {
public:
    vector<vector<int>> matrixReshape(vector<vector<int>>& mat, int r, int c) {
        // If transformation doesn't occur, return mat...
        if (mat.size() * mat[0].size() != r * c) {
            return mat;
        }
        // Otherwise create a output matrix and fill the cells...
        vector<vector<int>> output(r, vector<int>(c));
        // Traverse the matrix through the loop... 
        for (int idx = 0; idx < r * c; idx++) {
            // idx % c will give us the current column number...
            // idx / c will give us how many rows we have completely filled...
            output[idx/c][idx % c] = mat[idx / mat[0].size()][idx % mat[0].size()];
        }
        return output;      // Return the output matrix...
    }
};

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Python/Python3 Solution:
// Time Complexity : O(r*c)
// Space Complexity : O(r*c)

class Solution(object):
    def matrixReshape(self, mat, r, c):
        # Base case...
        if not mat: return mat
        # If transformation doesn't occur, return mat...
        if len(mat) * len(mat[0]) != r * c:
            return mat
        # Otherwise create a output matrix and fill the cells...
        output = [[0 for i in range(c)] for i in range(r)]
        idx = 0
        # Traverse the matrix through the loop... 
        while idx < r * c:
            # idx % c will give us the current column number...
            # idx / c will give us how many rows we have completely filled...
            output[idx // c][ idx % c] =  mat[idx // len(mat[0])][idx % len(mat[0])]
            idx += 1
        return output       # Return the output matrix...
       
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------          

// JavaScript Solution:
// Time Complexity : O(r*c)
// Space Complexity : O(r*c)
                   
var matrixReshape = function(mat, r, c) {
    // If transformation doesn't occur, return mat...
    if (mat.length * mat[0].length != r * c) {
        return mat;
    }
    // Otherwise create a output matrix and fill the cells...
    const output = new Array(r).fill(0).map(() => new Array(c).fill(0));
    // Traverse the matrix through the loop... 
    for (let idx = 0; idx < r * c; idx++) {
        // idx % c will give us the current column number...
        // idx / c will give us how many rows we have completely filled...
        output[Math.floor(idx/c)][idx % c] = mat[Math.floor(idx / mat[0].length)][idx % mat[0].length];
    }
    return output;      // Return the output matrix...
};
                   
                   
                   
                   
