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
    public boolean find(TreeNode root,Queue<Integer> queue,int flag){
        if(root == null) return true;
        if(root.left == null && root.right == null){
            if(flag == 0){
                queue.offer(root.val);
            }else{
                if(!queue.isEmpty() && queue.poll() == root.val)return true;
                else return false;
            }
        }

        if(find(root.left,queue,flag) && find(root.right,queue,flag))return true;
        return false;
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        Queue<Integer> queue = new LinkedList<>();
        find(root1,queue,0);
        if(!find(root2,queue,1))return false;
        return queue.isEmpty();
    }
}