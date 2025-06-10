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
    public void findMin(TreeNode root,int min[],int prev){
        if(root == null)return;
        min[0] = Math.min(min[0],Math.abs(root.val - prev));
        findMin(root.left,min,root.val);
        findMin(root.right,min,root.val);
    }
    public int minDiffInBST(TreeNode root) {
        int min[]= new int[1];
        min[0] = Integer.MAX_VALUE;
        findMin(root,min,Integer.MAX_VALUE);
        return min[0];
    }
}