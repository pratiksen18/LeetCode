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
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Symmetric Tree.
class Solution {
    public boolean isSymmetric(TreeNode root) {
        // Soecial case...
        if (root == null)
		    return true;
        // call the function  recursively...
	    return isSymmetric(root.left, root.right);
    }
    // After division the tree will be divided in two parts...
    // The root of the left part is rootleft & the root of the right part is rootright...
    public boolean isSymmetric(TreeNode rootleft, TreeNode rootright) {
        // If root of the left part & the root of the right part is same, return true...
	    if (rootleft == null && rootright == null) {
		    return true;
	    }
        // If root of any part is null, then the binary tree is not symmetric. So return false...
        else if (rootright == null || rootleft == null) {
		    return false;
	    }
        // If the value of the root of the left part is not equal to the value of the root of the right part...
        if (rootleft.val != rootright.val)
		    return false;
        // In case of not symmetric...
        if (!isSymmetric(rootleft.left, rootright.right))
		    return false;
	    if (!isSymmetric(rootleft.right, rootright.left))
		    return false;
        // Otherwise, return true...
        return true;
    }
}

