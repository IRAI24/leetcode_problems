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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        int s2=0;int s1=0;
        dfs(root1,l1);
        dfs(root2,l2);
       
        return l1.equals(l2);
    }
    private static void dfs(TreeNode root,List<Integer> l1)
    {
        if(root==null)  return;
        
            
            if(root.left==null &&root.right==null)l1.add(root.val);
            dfs(root.left,l1);
            dfs(root.right,l1);
        
       
    }
}