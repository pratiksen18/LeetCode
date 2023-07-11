# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def distanceK(self, root, target, k):
        def dfs(node, parent=None):
            if node:
                node.parent = parent
                dfs(node.left, node)
                dfs(node.right, node)
    
        dfs(root)
    
        queue = [(target, 0)]
        visited = set([target])
        result = []
    
        while queue:
            node, distance = queue.pop(0)
        
            if distance == k:
                result.append(node.val)
        
            if distance < k:
                neighbors = [node.left, node.right, node.parent]
            
                for neighbor in neighbors:
                    if neighbor and neighbor not in visited:
                        visited.add(neighbor)
                        queue.append((neighbor, distance + 1))
    
        return result
        