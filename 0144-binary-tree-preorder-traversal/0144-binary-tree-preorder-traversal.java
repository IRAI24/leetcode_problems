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
    public List<Integer> preorderTraversal(TreeNode root) {
         List<Integer>l=new ArrayList<>();
        prerder(root,l);
        return l;
    }
    public void prerder(TreeNode root, List<Integer>l)
    {
        if(root==null ) return ;
        l.add( root.val);
        prerder(root.left,l);
        
        prerder(root.right,l);
    }
}