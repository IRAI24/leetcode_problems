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
    public void flatten(TreeNode root) {
        if ( root==null ) return;
        TreeNode temp=root;
        List<Integer>l=new ArrayList<>();
        preorder(root,l);
       // System.out.println(l);
       root.val=l.get(0);
       root.left=null;
       
        TreeNode temp1=root;
        for(int i=1;i<l.size();i++)
        {
            temp1.right=new TreeNode(l.get(i));
            temp1.left=null;
            temp1=temp1.right;
        }
        
    }
    static List<Integer> preorder(TreeNode root,List<Integer> l)
    {
        
        if(root!=null) 
        {
            l.add(root.val);
            preorder(root.left,l);
            preorder(root.right,l);
        }
        return l;
    }
    
}