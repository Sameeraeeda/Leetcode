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
    public int res=0;
    public int longestUnivaluePath(TreeNode root) {
        if(root==null) return 0;
        dfs(root);
        return res;
    }
    public int dfs(TreeNode root){
       if(root==null) return 0;
       int left=dfs(root.left);
       int right=dfs(root.right);
       int ls=0;
       int rs=0;
       if(root.left!=null && root.left.val==root.val){
         ls=left+1;
       }
       if(root.right!=null && root.right.val==root.val){
        rs=right+1;
       }
       res=Math.max(res,ls+rs);
       return Math.max(ls,rs);

    }
}