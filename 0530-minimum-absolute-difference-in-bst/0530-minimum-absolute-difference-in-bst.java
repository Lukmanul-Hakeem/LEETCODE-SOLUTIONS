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
    public void findMin(TreeNode root,List<Integer> list){
        if(root == null)return;
        // if(min[0] > root.val){
        //     min[1] = min[0];
        //     min[0] = root.val;
        // }else if(min[1] > root.val)min[1] = root.val;
        findMin(root.left,list);
        list.add(root.val);
        findMin(root.right,list);
    }
    public int minDiffInBST(TreeNode root) {
        // int min[]= new int[2];
        // Arrays.fill(min,Integer.MAX_VALUE);

        List<Integer> list = new ArrayList<>();

        findMin(root,list);
        int min = Integer.MAX_VALUE;
        for(int i =1;i<list.size();i++){
            min = Math.min(min,list.get(i) - list.get(i-1));
        }
        return min;
    }
    public int getMinimumDifference(TreeNode root) {
        return minDiffInBST(root);
    }
}