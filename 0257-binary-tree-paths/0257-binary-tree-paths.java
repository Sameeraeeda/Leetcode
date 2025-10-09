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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> al=new ArrayList<>();
        dfs(root,"",al);
        return al;
    }
    public static void dfs(TreeNode root,String check,ArrayList<String> al){
      if(root==null)return;
      check+=root.val;
      if(root.left!=null || root.right!=null){
        check+="->";
      }
      if(root.left==null && root.right==null){
        al.add(check);
        return;
       
      }
      dfs(root.left,check,al);
      dfs(root.right,check,al);
      
    } 
    
}