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

    public void preordertravesal(Node root,List<Integer>list){
        if(root==null)return;
        list.add(root.val);
        for(int i=0;i<root.children.size();i++){
            preordertravesal(root.children.get(i),list);
        }
    }
    public List<Integer> preorder(Node root) {
        List<Integer> list=new ArrayList<>();
        preordertravesal(root,list);
        return list;
    }
}