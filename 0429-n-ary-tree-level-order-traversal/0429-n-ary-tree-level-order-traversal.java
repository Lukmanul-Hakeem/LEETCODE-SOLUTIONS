/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public void level(Node root,List<List<Integer>>L){
        if(root==null)return;
        Queue<Node> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> list=new ArrayList<>();
            int size=queue.size();
            for(int i=0;i<size;i++){
                Node temp=queue.poll();
                list.add(temp.val);
                for(int j=0;j<temp.children.size();j++){
                    if(temp.children.get(j)!=null)queue.offer(temp.children.get(j));
                }
            }
            L.add(list);
        } 
    }
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> L=new ArrayList<>();
        level(root,L);
        return L;
    }
}