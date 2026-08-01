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
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        
        int leftH  = isBalancedTree(root.left);
        int rightH = isBalancedTree(root.right);

        // 이 노드에서 균형 체크 + 좌우 서브트리도 각각 균형인지
        return Math.abs(leftH - rightH) <= 1
                && isBalanced(root.left)
                && isBalanced(root.right);
    }
    private int isBalancedTree(TreeNode root) {
        if  (root == null) return 0;
        int leftDepth = isBalancedTree(root.left);
        int rightDepth = isBalancedTree(root.right);
        return Math.max(leftDepth, rightDepth) + 1;

    }
}