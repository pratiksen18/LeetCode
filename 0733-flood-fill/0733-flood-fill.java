

// Java Solution:
// Runtime: 1 ms, faster than 90.98% of Java online submissions for Flood Fill.

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        // Avoid infinite loop if the new and old colors are the same...
        if(image[sr][sc] == color) return image;
        // Run the fill function starting at the position given...
        fill(image, sr, sc, color, image[sr][sc]);
        return image;
    }
    public void fill(int[][] image, int sr, int sc, int color, int cur) {
        // If sr is less than 0 or greater equals to the length of image...
        // Or, If sc is less than 0 or greater equals to the length of image[0]...
        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length) return;
        // If image[sr][sc] is not equal to previous color...
        if(cur != image[sr][sc]) return;
        // Update the image[sr][sc] as a color...
        image[sr][sc] = color;
        // Make four recursive calls to the function with (sr-1, sc), (sr+1, sc), (sr, sc-1) and (sr, sc+1)...
        fill(image, sr-1, sc, color, cur);
        fill(image, sr+1, sc, color, cur);
        fill(image, sr, sc-1, color, cur);
        fill(image, sr, sc+1, color, cur);
    }
}

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// C++ Solution:

class Solution {
public:
    void fill(vector<vector<int>>& image, int sr, int sc, int color, int cur) {
        // If sr is less than 0 or greater equals to the length of image...
        // Or, If sc is less than 0 or greater equals to the length of image[0]...
        if(sr < 0 || sr >= image.size() || sc < 0 || sc >= image[0].size()) return;
        // If image[sr][sc] is not equal to previous color...
        if(cur != image[sr][sc]) return;
        // Update the image[sr][sc] as a color...
        image[sr][sc] = color;
        // Make four recursive calls to the function with (sr-1, sc), (sr+1, sc), (sr, sc-1) and (sr, sc+1)...
        fill(image, sr-1, sc, color, cur);
        fill(image, sr+1, sc, color, cur);
        fill(image, sr, sc-1, color, cur);
        fill(image, sr, sc+1, color, cur);
    }
    vector<vector<int>> floodFill(vector<vector<int>>& image, int sr, int sc, int color) {
        // Avoid infinite loop if the new and old colors are the same...
        if(image[sr][sc] == color) return image;
        // Run the fill function starting at the position given...
        fill(image, sr, sc, color, image[sr][sc]);
        return image;
    }
};

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Python/Python3 Solution:

class Solution(object):
    def fill(self, image, sr, sc, color, cur):
        # If sr is less than 0 or greater equals to the length of image...
        # Or, If sc is less than 0 or greater equals to the length of image[0]...
        if sr < 0 or sr >= len(image) or sc < 0 or sc >= len(image[0]): return;
        # If image[sr][sc] is not equal to previous color...
        if cur != image[sr][sc]: return;
        # Update the image[sr][sc] as a color...
        image[sr][sc] = color;
        # Make four recursive calls to the function with (sr-1, sc), (sr+1, sc), (sr, sc-1) and (sr, sc+1)...
        self.fill(image, sr-1, sc, color, cur);
        self.fill(image, sr+1, sc, color, cur);
        self.fill(image, sr, sc-1, color, cur);
        self.fill(image, sr, sc+1, color, cur);
    def floodFill(self, image, sr, sc, color):
        # Avoid infinite loop if the new and old colors are the same...
        if image[sr][sc] == color: return image;
        # Run the fill function starting at the position given...
        self.fill(image, sr, sc, color, image[sr][sc]);
        return image;

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// JavaScript  Solution:

var floodFill = function(image, sr, sc, color) {
    // Avoid infinite loop if the new and old colors are the same...
    if(image[sr][sc] == color) return image;
    // Run the fill function starting at the position given...
    fill(image, sr, sc, color, image[sr][sc]);
    return image;
}
var fill = function(image, sr, sc, color, cur) {
    // If sr is less than 0 or greater equals to the length of image...
    // Or, If sc is less than 0 or greater equals to the length of image[0]...
    if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length) return;
    // If image[sr][sc] is not equal to previous color...
    if(cur != image[sr][sc]) return;
    // Update the image[sr][sc] as a color...
    image[sr][sc] = color;
    // Make four recursive calls to the function with (sr-1, sc), (sr+1, sc), (sr, sc-1) and (sr, sc+1)...
    fill(image, sr-1, sc, color, cur);
    fill(image, sr+1, sc, color, cur);
    fill(image, sr, sc-1, color, cur);
    fill(image, sr, sc+1, color, cur);
};
