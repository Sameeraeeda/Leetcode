class Solution {
    public int[] leftRightDifference(int[] nums) {
        int ls[]=new int[nums.length];
        int rs[]=new int[nums.length];
        int leftsum=0;
        int rightsum=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            ls[i]=leftsum;
            leftsum+=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            rs[i]=rightsum;
            rightsum+=nums[i];
        }
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int diff=Math.abs(ls[i]-rs[i]);
            res[i]=diff;
        }
        return res;
    }
}