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
    public void traverse(TreeNode root,TreeNode prev,List<Integer> list, List<List<Integer>> L,int sum,int target){
        if(root==null){
            //if(prev.left==null && prev.right==null && sum==target)if(!L.contains(list))L.add(new ArrayList(list));
            return;
        }
        sum+=root.val;
        list.add(root.val);
        if(root.left==null && root.right==null && sum==target)L.add(new ArrayList(list));
        traverse(root.left,root,list,L,sum,target);
        traverse(root.right,root,list,L,sum,target);
        list.remove(list.size()-1);
    }
    public boolean hasPathSum(TreeNode root, int target) {
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> listoflist=new ArrayList<>();
        if(root==null)return false;
        traverse(root,null,list,listoflist,0,target);
        if(listoflist.size()!=0)return true;
        return false;
    }
}