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
    public int findMaxHeight(TreeNode root){
        if(root==null)return 0;
        int left=findMaxHeight(root.left);
        int right=findMaxHeight(root.right);
        return 1+(left>right?left:right);
    }
    public int balanceFactor(TreeNode root){
        if(root==null)return 0;
        int left=findMaxHeight(root.left);
        int right=findMaxHeight(root.right);
        return left-right;
    }
    public boolean inorder(TreeNode root){
        if(root==null)return true;
        int bf=balanceFactor(root);
        System.out.printf("%d | %d ",bf,root.val);
        if(bf>1 || bf <-1)return false;
        boolean left=inorder(root.left);
        boolean right=inorder(root.right);
        return left & right;
    }
    public boolean isBalanced(TreeNode root) {
        return inorder(root);
    }
}