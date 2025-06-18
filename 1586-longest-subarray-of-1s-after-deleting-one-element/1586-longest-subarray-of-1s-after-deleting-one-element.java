class Solution {
    public int longestSubarray(int[] nums) {
      int left=0;
      int count=0;
      int maxlen=Integer.MIN_VALUE;
      for(int right=0;right<nums.length;right++){
          if(nums[right]==0){
            count++;
          }
          while(count>1){
            if(nums[left]==0){
                count--;
            }
            left++;
          }
            maxlen=Math.max(maxlen,right-left);
          
      }
      return maxlen;
    }
}