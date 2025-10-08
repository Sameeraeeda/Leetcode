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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ls=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        findres(root,targetSum,ls,curr);
        return ls;
    }
    public void findres(TreeNode root,int targetSum,List<List<Integer>> ls,List<Integer> curr){
        if(root==null) return;
        curr.add(root.val);
        int remaining=targetSum-root.val;
        if(root.left==null && root.right==null && remaining==0){
            ls.add(new ArrayList<>(curr));
        }
        else{
            findres(root.left,remaining,ls,curr);
            findres(root.right,remaining,ls,curr);
        }
        curr.remove(curr.size()-1);
    }
}