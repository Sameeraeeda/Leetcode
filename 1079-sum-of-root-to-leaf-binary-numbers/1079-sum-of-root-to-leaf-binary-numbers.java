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
    int sum=0;
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root,0);
    }
    public int dfs(TreeNode root,int num){
        if(root==null)return 0;
        num=num*2+root.val;
        if(root.left==null && root.right==null){
           sum+=num;
        }
        dfs(root.left,num);
        dfs(root.right,num);
        return sum;
    
    }
}