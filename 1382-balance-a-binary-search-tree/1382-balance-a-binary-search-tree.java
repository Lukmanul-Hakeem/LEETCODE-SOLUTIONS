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
    public void inorder(TreeNode temp,ArrayList<Integer> list){
        if(temp==null)return ;
        inorder(temp.left,list);
        list.add(temp.val);
        inorder(temp.right,list);
    }
    public TreeNode createNode(int val){
        return new TreeNode(val);
    }
    public TreeNode insert(ArrayList<Integer> list,int low,int high){
        if(low>high)return null;
        int mid=(low+high)/2;
        TreeNode node=createNode(list.get(mid));
        node.left=insert(list,low,mid-1);
        node.right=insert(list,mid+1,high);
        return node;
    }
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        inorder(root,list);
        TreeNode root1=null;
        root1=insert(list,0,list.size()-1);
        return root1;
    }
}