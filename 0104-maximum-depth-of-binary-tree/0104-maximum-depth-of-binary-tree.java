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
    public int findheight(TreeNode root){
        if(root == null)return 1;
        int left = findheight(root.left);
        int right = findheight(root.right);
        return left > right ? left + 1 : right + 1;
    }
    public int maxDepth(TreeNode root) {
        return findheight(root) - 1;
    }
}