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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> inorder = new ArrayList<>();
        inorder(root, k, inorder);
        return inorder.get(k - 1);
    }

    private void inorder(TreeNode root, int k, List<Integer> inorder) {
        if (root == null) {
            return;
        } else {
            inorder(root.left, k, inorder);
            inorder.add(root.val);
            inorder(root.right, k, inorder);
        }
    }
}