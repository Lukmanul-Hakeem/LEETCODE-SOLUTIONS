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
    public boolean find(TreeNode root1,TreeNode root2){
        if(root1 == null && root2 == null)return true;

        if(root1 != null && root2 != null){

            // System.out.println(root1.val+" "+root2.val);

            if(root1.val != root2.val)return false;

            if(find(root1.right,root2.left) && find(root1.left,root2.right))return true;

            return false;
        }

        return false;
        
    }
    public boolean isSymmetric(TreeNode root) {
        return find(root.left,root.right);
    }
}