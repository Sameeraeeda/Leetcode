class Solution {
    public int maxAscendingSum(int[] nums) {
        int Max=0;
        int sum=nums[0];
        if(nums.length==1){
            return nums[0];
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                sum+=nums[i];
                Max=Math.max(Max,sum);
            }
            else{
                Max=Math.max(Max,sum);
                sum=0;
                sum+=nums[i];
            }
         
        }
        return Max;
    }
}