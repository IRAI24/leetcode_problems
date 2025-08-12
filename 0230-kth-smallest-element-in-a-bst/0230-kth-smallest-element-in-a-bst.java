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
    int c=0;
    int res=0;
    

    public int kthSmallest(TreeNode root, int k) {
        
      
    
     inorder(root,k);  
     return  res;
    }
     void inorder(TreeNode root ,int k)
    {
        if(root==null || res!=0) return;
        inorder(root.left,k);
        c++;
        if (c==k) {
            res=root.val;
            return ;
        }
        inorder(root.right,k);
        

        return ;
    }
}