/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public boolean helper(ListNode head,TreeNode root){
        if(head==null)return true;
        if(root==null)return false;
        if(root.val==head.val){
            return helper(head.next,root.left) || helper(head.next,root.right);
        }

        return false;
    }
    public boolean search(ListNode head,TreeNode root){
        if(root==null)return false;
        if(root.val==head.val){
            boolean help=helper(head,root);
            if(help==true)return true;
        }
        boolean left=search(head,root.left);
        boolean right=search(head,root.right);
        return left||right;
    }
    public boolean isSubPath(ListNode head, TreeNode root) {
        return search(head,root);
    }
}