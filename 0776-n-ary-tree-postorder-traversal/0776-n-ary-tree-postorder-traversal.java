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
}
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer>l=new ArrayList<>();
        postOrder(root,l);
        return l;

    }
    public void postOrder(Node root,  List<Integer> l)
    {
        
        if(root == null) return ;
        
        
        int size = root.children.size();
        
        for(int i=0;i<size;i++)
        {
            postOrder(root.children.get(i),l);
        }
        l.add(root.val);
    }
}