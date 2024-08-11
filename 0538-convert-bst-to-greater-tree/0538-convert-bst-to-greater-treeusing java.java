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
    public void findBst(TreeNode root,int sum[]){
        if(root==null)return ;
        findBst(root.right,sum);
        sum[0]+=root.val;
        root.val=sum[0];
        findBst(root.left,sum);
    }
    public TreeNode convertBST(TreeNode root) {
        int sum[]=new int[1];
        findBst(root,sum);
        return root;
    }
}