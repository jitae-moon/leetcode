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
class Solution {
    List<Integer> ans = new ArrayList<>();
    
    public List<Integer> preorderTraversal(TreeNode root) {
        dfs(root);
        return ans;
        
    }
    
    public void dfs(TreeNode root) {
        if (root == null) return;
        else {
            ans.add(root.val);
            dfs(root.left);
            dfs(root.right);
        }
    }
}