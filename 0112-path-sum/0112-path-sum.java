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
    int target;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        target=targetSum;
       return getSum(root,0);
        
    }
    public boolean getSum(TreeNode root,int sum){
        if(root==null){
            return false;
        }
        sum+=root.val;
        boolean lefts=getSum(root.left,sum);
        boolean rights=getSum(root.right,sum);
        if(root.left==null && root.right==null){
              return sum==target;
        }
        return lefts|| rights;
        
    }
}