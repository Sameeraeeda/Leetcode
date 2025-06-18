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
    int maxsum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxPath(root);
        return maxsum;
    }
    public  int maxPath(TreeNode root){
        if(root==null){
            return 0;
        }
        int lh=Math.max(maxPath(root.left),0);
        int rh=Math.max(maxPath(root.right),0);
        int currpath=root.val+lh+rh;
        maxsum=Math.max(maxsum,currpath);
        return root.val+Math.max(lh,rh);
        
    }
}