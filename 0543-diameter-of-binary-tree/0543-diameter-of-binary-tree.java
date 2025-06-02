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
    public int traversal(TreeNode root,int diameter[]){
        if(root==null)return 0;
        int left=traversal(root.left,diameter);
        int right=traversal(root.right,diameter);
        //System.out.println(diameter[0]+" "+(left+right));

        diameter[0]= (diameter[0]>left+right) ? diameter[0] : (left+right);
        return 1 + (left>right ? left : right);

    }
    public int diameterOfBinaryTree(TreeNode root) {
        int diameter[]=new int [1];
        traversal(root,diameter);
        return diameter[0];
    }
}