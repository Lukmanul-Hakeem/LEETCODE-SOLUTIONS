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
    public void parenthesis(TreeNode root,StringBuilder str){
        if(root==null)return;
        str.append("(");
        str.append(root.val);
        if(root.left==null && root.right!=null)str.append("()");
        parenthesis(root.left,str);
        parenthesis(root.right,str);
        str.append(")");
    }
    public String tree2str(TreeNode root) {
        StringBuilder str=new StringBuilder("");
        parenthesis(root,str);
        String newstr=str.substring(1,str.length()-1);
        return newstr;
    }
}