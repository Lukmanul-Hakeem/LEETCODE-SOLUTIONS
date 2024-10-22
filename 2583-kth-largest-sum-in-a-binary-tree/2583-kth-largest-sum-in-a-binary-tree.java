/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {

    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode> queue=new LinkedList<>();
        PriorityQueue<Long> minHeap=new PriorityQueue<>();
        queue.add(root);
        int size=0;
        long sum=0;
        int level=0;
        while(!queue.isEmpty()){
            level++;
            size=queue.size();
            sum=0;
            for(int i=0;i<size;i++){
                TreeNode temp=queue.poll();
                sum+=temp.val;
                if(temp.left!=null){
                    queue.add(temp.left);
                }
                if(temp.right!=null){
                    queue.add(temp.right);
                }
            }
            if(minHeap.size()==k){
                if(minHeap.peek()<sum){
                    minHeap.poll();
                    minHeap.add(sum);
                }
            }else minHeap.add(sum);
        }
        if(level<k)return -1;
        return minHeap.peek();
    }
}