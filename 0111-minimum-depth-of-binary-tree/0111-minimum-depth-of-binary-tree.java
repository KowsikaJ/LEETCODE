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
    public int minDepth(TreeNode root) {
        if(root==null) return 0;

        int leftdep=minDepth(root.left);
        int rightdep=minDepth(root.right);

        return (leftdep==0 || rightdep==0)?leftdep+rightdep+1 : Math.min(leftdep,rightdep)+1;
        
    }
}