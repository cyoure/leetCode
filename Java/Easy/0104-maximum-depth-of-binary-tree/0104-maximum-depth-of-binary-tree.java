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
public class Solution {
    public int maxDepth(TreeNode root) {
        int depth = 0;
        if (root == null) return depth;
        return depthCount(root);
    }
    private int depthCount(TreeNode root){
       if  (root == null) return 0;
       int leftDepth = depthCount(root.left);
       int rightDepth = depthCount(root.right);
       return Math.max(leftDepth, rightDepth) + 1;
    }
}