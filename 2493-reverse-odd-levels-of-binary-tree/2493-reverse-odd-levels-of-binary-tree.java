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
    public TreeNode reverseOddLevels(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int level=0;
        while(!q.isEmpty()){
            int n=q.size();
            List<TreeNode> ls=new ArrayList<>();
            for(int i=0;i<n;i++){
               TreeNode temp=q.poll();
               ls.add(temp);
               if(temp.left!=null){
                q.add(temp.left);
               }
               if(temp.right!=null){
                q.add(temp.right);
               }

            }
            if(level%2!=0){
                int left=0;
                int right=ls.size()-1;
                while(left<right){
                    int node=ls.get(left).val;
                    ls.get(left).val=ls.get(right).val;
                    ls.get(right).val=node;
                    left++;
                    right--;
                }
            }
            level++;
        }
        return root;
    }
}