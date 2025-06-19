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
     ArrayList<Integer> al1=new ArrayList<Integer>();
     ArrayList<Integer> al2=new ArrayList<Integer>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        dfs(root1,al1);
        dfs(root2,al2);
        return al1.equals(al2);
    }
    public static void dfs(TreeNode root,ArrayList<Integer> al){
        if(root==null){
            return;
        }
         dfs(root.left,al);
         dfs(root.right,al);
        if(root.left==null && root.right==null){
            al.add(root.val);
        }

    }
}