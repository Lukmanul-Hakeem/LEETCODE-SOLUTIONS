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
    public void traversal(TreeNode root,int val,int count[]){
        if(root==null)return;
        if(root.val>=val){
            count[0]++;
            val=root.val;
        }
        traversal(root.left,val,count);
        traversal(root.right,val,count);
    }
    public int goodNodes(TreeNode root) {
        int count[]=new int[1];
        traversal(root,root.val,count);
        return count[0];
    }
}