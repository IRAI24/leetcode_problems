import java.util.*;
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
    public int[] findMode(TreeNode root) {
        Map<Integer,Integer> map=new HashMap<>();
        dfs(root,map);
        int max=0;
        for(int i:map.values())max=Math.max(max,i);
        
        int c=0;
        for(int i:map.values())if(max==i)c++;
                int[] a=new int[c];int i=0;
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        if(e.getValue()==max)a[i++]=e.getKey();
        return a;


    }
    private void dfs(TreeNode root,Map<Integer,Integer> map)
    {
        if(root==null) return;
        dfs(root.left,map);
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        dfs(root.right,map);
    }
}