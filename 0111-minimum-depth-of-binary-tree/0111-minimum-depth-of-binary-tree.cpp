/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */

// C++ Solution:

class Solution {
public:
    int minDepth(TreeNode* root) {
        // Base case...
        // If the subtree is empty i.e. root is NULL, return depth as 0...
        if(root == NULL)  return 0;
        // Initialize the depth of two subtrees...
        int leftDepth = minDepth(root->left);
        int rightDepth = minDepth(root->right);
        // If the both subtrees are empty...
        if(root->left == NULL && root->right == NULL)
            return 1;
        // If the left subtree is empty, return the depth of right subtree after adding 1 to it...
        if(root->left == NULL)
            return 1 + rightDepth;
        // If the right subtree is empty, return the depth of left subtree after adding 1 to it...
        if(root->right == NULL)
            return 1 + leftDepth;
        // When the two child function return its depth...
        // Pick the minimum out of these two subtrees and return this value after adding 1 to it...
        return min(leftDepth, rightDepth) + 1;    // Adding 1 is the current node which is the parent of the two subtrees...
    }
};

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Java Solution:

class Solution {
    public int minDepth(TreeNode root) {
        // Base case...
        // If the subtree is empty i.e. root is NULL, return depth as 0...
        if(root == null)  return 0;
        // Initialize the depth of two subtrees...
        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);
        // If the both subtrees are empty...
        if(root.left == null && root.right == null)
            return 1;
        // If the left subtree is empty, return the depth of right subtree after adding 1 to it...
        if(root.left == null)
            return 1 + rightDepth;
        // If the right subtree is empty, return the depth of left subtree after adding 1 to it...
        if(root.right == null)
            return 1 + leftDepth;
        // When the two child function return its depth...
        // Pick the minimum out of these two subtrees and return this value after adding 1 to it...
        return Math.min(leftDepth, rightDepth) + 1;    // Adding 1 is the current node which is the parent of the two subtrees...
    }
}

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Python Solution:

class Solution(object):
    def minDepth(self, root):
        # Base case...
        # If the subtree is empty i.e. root is NULL, return depth as 0...
        if root is None:  return 0
        # Initialize the depth of two subtrees...
        leftDepth = self.minDepth(root.left)
        rightDepth = self.minDepth(root.right)
        # If the both subtrees are empty...
        if root.left is None and root.right is None:
            return 1
        # If the left subtree is empty, return the depth of right subtree after adding 1 to it...
        if root.left is None:
            return 1 + rightDepth
        # If the right subtree is empty, return the depth of left subtree after adding 1 to it...
        if root.right is None:
            return 1 + leftDepth
        # When the two child function return its depth...
        # Pick the minimum out of these two subtrees and return this value after adding 1 to it...
        return min(leftDepth, rightDepth) + 1;    # Adding 1 is the current node which is the parent of the two subtrees...

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// JavaScript Solution:
    
var minDepth = function(root) {
    // Base case...
    // If the subtree is empty i.e. root is NULL, return depth as 0...
    if(root == null)  return 0;
    // If the both subtrees are empty...
    if(root.left == null && root.right == null)
        return 1;
    // If the left subtree is empty, return the depth of right subtree after adding 1 to it...
    if(root.left == null)
        return 1 + minDepth(root.right);
    // If the right subtree is empty, return the depth of left subtree after adding 1 to it...
    if(root.right == null)
        return 1 + minDepth(root.left);
    // When the two child function return its depth...
    // Pick the minimum out of these two subtrees and return this value after adding 1 to it...
    return Math.min(minDepth(root.left), minDepth(root.right)) + 1;    // Adding 1 is the current node which is the parent of the two subtrees...
};

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// C Language:
    
int minDepth(struct TreeNode* root){
    if(root == NULL)
        return 0;
    else {
        int leftDepth = minDepth(root->left);
        int rightDepth = minDepth(root->right);
        if(leftDepth > rightDepth)
            return rightDepth + 1;
        else
            return leftDepth + 1;
    }
}

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Python3 Solution:

class Solution:
    def minDepth(self, root: Optional[TreeNode]) -> int:
        # Base case...
        # If the subtree is empty i.e. root is NULL, return depth as 0...
        if root is None:  return 0
        # Initialize the depth of two subtrees...
        leftDepth = self.minDepth(root.left)
        rightDepth = self.minDepth(root.right)
        # If the both subtrees are empty...
        if root.left is None and root.right is None:
            return 1
        # If the left subtree is empty, return the depth of right subtree after adding 1 to it...
        if root.left is None:
            return 1 + rightDepth
        # If the right subtree is empty, return the depth of left subtree after adding 1 to it...
        if root.right is None:
            return 1 + leftDepth
        # When the two child function return its depth...
        # Pick the minimum out of these two subtrees and return this value after adding 1 to it...
        return min(leftDepth, rightDepth) + 1;    # Adding 1 is the current node which is the parent of the two subtrees...
