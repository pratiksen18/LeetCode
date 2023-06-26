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
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Postorder Traversal.
// Memory Usage: 40.9 MB, less than 74.94% of Java online submissions for Binary Tree Postorder Traversal.

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        // Create an array list to store the solution result...
        List<Integer> sol = new ArrayList<Integer>();
        // Return the solution answer if the tree is empty...
        if(root==null) return sol;
        // Create an empty stack and push the root node...
        Stack<TreeNode> bag = new Stack<TreeNode>();
        bag.push(root);
        // Loop till stack is empty...
        while(!bag.isEmpty()) {
            // set peek a node from the stack...
            TreeNode node = bag.peek();
            // If the subtrees of that node are null, then pop & store the pop value into solution result...
            if(node.left==null && node.right==null) {
                TreeNode pop = bag.pop();
                sol.add(pop.val);
            }
            else {
                // Push the right child of the popped node into the stack...
                if(node.right!=null) {
                    bag.push(node.right);
                    node.right = null;
                }
                // Push the left child of the popped node into the stack...
                if(node.left!=null) {
                    bag.push(node.left);
                    node.left = null;
                }
            }
        }
        return sol;     // Return the solution list...
    }
}

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// C++ Solution:
// Runtime: 1 ms, faster than 93.22% of C++ online submissions for Binary Tree Postorder Traversal.
// Memory Usage: 8.3 MB, less than 96.14% of C++ online submissions for Binary Tree Postorder Traversal.

class Solution {
public:
    vector<int> postorderTraversal(TreeNode* root) {
        vector<int> sol;
        postorder(root, sol);
        return sol;
    }
private:
    void postorder(TreeNode* root, vector<int>& sol) {
        if (!root)
            return;
        postorder(root->left, sol);
        postorder(root->right, sol);
        sol.push_back(root->val);
    }
};

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Python/Python3 Solution:

class Solution(object):
    def postorderTraversal(self, root):
        # Base case...
        if not root: return []
        # Create an array list to store the solution result...
        sol = []
        # Create an empty stack and push the root node...
        bag = [root]
        # Loop till stack is empty...
        while bag:
            # Pop a node from the stack...
            node = bag.pop()
            sol.append(node.val)
            # Push the left child of the popped node into the stack...
            if node.left:
                bag.append(node.left)
            # Append the right child of the popped node into the stack...
            if node.right:
                bag.append(node.right)
        return sol[::-1]       # Return the solution list...
