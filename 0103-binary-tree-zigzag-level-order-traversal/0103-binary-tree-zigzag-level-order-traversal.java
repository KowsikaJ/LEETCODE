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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        int level=0;
        if(root==null) return ans;
        q.add(root);
 
        while(!q.isEmpty()){
            int levelsize=q.size();
            List<Integer> l=new LinkedList<>();
            for(int i=0;i<levelsize;i++){
                TreeNode node=q.poll();
                l.add(node.val);
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            if(level%2!=0) Collections.reverse(l);
            ans.add(l);
            level++;

        }
        return ans;
        
    }
}