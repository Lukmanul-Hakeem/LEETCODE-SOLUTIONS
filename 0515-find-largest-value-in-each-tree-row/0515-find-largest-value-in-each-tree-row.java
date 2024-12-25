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
    public void findMaxOfEachRow(TreeNode root,List<Integer> list,int level){
        if(root == null)return;
        
        // if(list.size()==0){
        //     list.add(root.val);
        //     // System.out.println("hello");
        // }
        // else if(list.size()-1>=level && list.get(level)<root.val){
        //     list.set(level,root.val);
        //     // System.out.println("hello...");
        // }else if(list.size()==level){
        //     list.add(root.val);
        // }
        if(list.size()==level)list.add(root.val);
        else if(list.get(level)<root.val){
            list.set(level,root.val);
        }
        findMaxOfEachRow(root.left,list,level+1);
        findMaxOfEachRow(root.right,list,level+1);
    }
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list =new ArrayList<>();
        findMaxOfEachRow(root,list,0);
        return list;
    }
}