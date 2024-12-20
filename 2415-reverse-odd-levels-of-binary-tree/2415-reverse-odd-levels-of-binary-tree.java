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
    public static void traversal(TreeNode root,Stack<Integer> stack,int k){
        if(root==null)return;
        if(k%2==1)stack.push(root.val);
        traversal(root.left,stack,k+1);
        traversal(root.right,stack,k+1);
    }
    public static void reverse(TreeNode root,Stack<Integer> stack,int k){
        if(root==null)return;
        reverse(root.left,stack,k+1);
        reverse(root.right,stack,k+1);
        if(k%2==1)root.val=stack.pop();
    }
    public TreeNode reverseOddLevels(TreeNode root) {
        Stack<Integer>stack=new Stack<>();
        traversal(root,stack,0);
        reverse(root,stack,0);
        // System.out.println(stack);
        return root;
    }
}