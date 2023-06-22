/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
// Java Solution:
/** Recursive Approach:**/
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Invert Binary Tree.
// Time Complexity : O(n)
// Space Complexity : O(n)
class Solution {
    public TreeNode invertTree(TreeNode root) {
        // Base case: if the tree is empty...
        if(root == null){
            return root;
        }
        // Call the function recursively for the left subtree...
        invertTree(root.left);
        // Call the function recursively for the right subtree...
        invertTree(root.right);
        // Swapping process...
        TreeNode curr = root.left;
        root.left = root.right;
        root.right = curr;
        return root;        // Return the root...
    }
}

/**Iterative Approach:**/
// Runtime: 1 ms, faster than 90.96% of Java online submissions for Invert Binary Tree.
// Time Complexity : O(n)
// Space Complexity : O(n)
class Solution {
    public TreeNode invertTree(TreeNode root) {
        LinkedList<TreeNode> q = new LinkedList<TreeNode>();
        // Base case: if the tree is empty...
        if(root != null){
            // Push the root node...
            q.add(root);
        }
        // Loop till queue is empty...
        while(!q.isEmpty()){
            // Dequeue front node...
            TreeNode temp = q.poll();
            // Enqueue left child of the popped node...
            if(temp.left != null)
                q.add(temp.left);
            // Enqueue right child of the popped node
            if(temp.right != null)
                q.add(temp.right);
            // Swapping process...
            TreeNode curr = temp.left;
            temp.left = temp.right;
            temp.right = curr;
        }
         return root;    // Return the root...
    }
}

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// C++ Solution (Recursive Approach):
// Time Complexity : O(n)
// Space Complexity : O(n)
class Solution {
public:
    TreeNode* invertTree(TreeNode* root) {
        // Base case...
        if(root == NULL){
            return root;
        }
        // Call the function recursively for the left subtree...
        invertTree(root->left);
        // Call the function recursively for the right subtree...
        invertTree(root->right);
        // swapping process...
        TreeNode* curr = root->left;
        root->left = root->right;
        root->right = curr;
        return root;        // Return the root...
    }
};

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Python / Python3 Solution:
class Solution(object):
    def invertTree(self, root):
        # Base case...
        if root == None:
            return root
        # swapping process...
        root.left, root.right = root.right, root.left
        # Call the function recursively for the left subtree...
        self.invertTree(root.left)
        # Call the function recursively for the right subtree...
        self.invertTree(root.right)
        return root     # Return the root...

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
            
// JavaScript Solution (Recursive Approach):
var invertTree = function(root) {
    // Base case...
    if(root == null){
        return root;
    }
    // Call the function recursively for the left subtree...
    invertTree(root.left);
    // Call the function recursively for the right subtree...
    invertTree(root.right);
    // swapping process...
    const curr = root.left;
    root.left = root.right;
    root.right = curr;
    return root;        // Return the root...   
};

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// C Language (Recursive Approach):
struct TreeNode* invertTree(struct TreeNode* root){
    // Base case...
    if(root == NULL){
        return root;
    }
    // Call the function recursively for the left subtree...
    invertTree(root->left);
    // Call the function recursively for the right subtree...
    invertTree(root->right);
    // swapping process...
    struct TreeNode* curr = root->left;
    root->left = root->right;
    root->right = curr;
    return root;        // Return the root...
}
